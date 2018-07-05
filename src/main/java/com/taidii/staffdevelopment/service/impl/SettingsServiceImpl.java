package com.taidii.staffdevelopment.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.taidii.staffdevelopment.dao.*;
import com.taidii.staffdevelopment.dto.settings.*;
import com.taidii.staffdevelopment.entity.*;
import org.apache.commons.collections4.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;
import com.taidii.staffdevelopment.enums.SelfEvaluationPeriodEnum;
import com.taidii.staffdevelopment.enums.SkillDepthEnum;
import com.taidii.staffdevelopment.error.SettingsError;
import com.taidii.staffdevelopment.service.ISettingsService;

@Service
public class SettingsServiceImpl implements ISettingsService {

    @Autowired
    private IRatingDAO ratingDAO;
    @Autowired
    private IDutyDAO dutyDAO;
    @Autowired
    private IUserDutyLevelDAO userDutyLevelDAO;
    @Autowired
    private ISkillGuidingsDAO skillGuidingsDAO;
    @Autowired
    private IDutyLevelSkillDAO skillDAO;
    @Autowired
    private IDutyLevelSkillDAO dutyLevelSkillDAO;
    @Autowired
    private ITimeSettingDAO timeSettingDAO;

    @Override
    public void saveDevelopRating(DevelopRating developRating,Integer term) throws BizException{
        DevelopRatingExample example=new DevelopRatingExample();
        example.createCriteria().andSchoolIdEqualTo(developRating.getSchoolId()).
                andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId()).
                andNameEqualTo(developRating.getName()).
                andRateKeysEqualTo(developRating.getRateKeys()).andPeriodEqualTo(term);
        List<DevelopRating> list=ratingDAO.selectByExample(example);
        if(!CollectionUtils.isEmpty(list)){
            throw new BizException(SettingsError.SCORE_REPEAT_ERROR);
        }
        DevelopRatingExample example1=new DevelopRatingExample();
        example1.createCriteria().andSchoolIdEqualTo(developRating.getSchoolId()).
                andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId()).
                andScoreEqualTo(developRating.getScore()).andPeriodEqualTo(term);
        List<DevelopRating> list1=ratingDAO.selectByExample(example1);
        if(!CollectionUtils.isEmpty(list1)){
            throw new BizException(SettingsError.SCORE_REPEAT_ERROR);
        }
        developRating.setGmtCreate(new Date());
        developRating.setGmtModify(new Date());
        developRating.setPeriod(term);
        developRating.setIsDelete(IsDeleteEnum.NORMAL.getId());
        ratingDAO.insertSelective(developRating);
    }

    @Override
    public void deleteDevelopRating(Integer id) throws BizException {
        DevelopRating developRating=ratingDAO.selectByPrimaryKey(id);
        if(developRating!=null){
            developRating.setIsDelete(IsDeleteEnum.DELETEED.getId());
            developRating.setGmtModify(new Date());
            ratingDAO.updateByPrimaryKey(developRating);
        }
    }

    @Override
    public List<DevelopRating> selectDevelopRatingList(Integer schoolId, Integer year,Integer term) {
        DevelopRatingExample example=new DevelopRatingExample();
        example.createCriteria().andSchoolIdEqualTo(schoolId).
                andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId()).
                andYearEqualTo(year).andPeriodEqualTo(term);
        example.setOrderByClause("score asc");
        List<DevelopRating> list=ratingDAO.selectByExample(example);
        return list;
    }

    @Override
    public List<SkillLevelDto> fetchSkillLevel() {
        List<SkillLevelDto> skillLevelDtoList=dutyDAO.fetchSkillLevelList();
        return skillLevelDtoList;
    }

    @Override
    public List<TeacherDto> fetchNotLevelTeacher(Integer schoolId) {
        return dutyDAO.fetchNotLevelTeacher(schoolId);
    }

    @Override
    public List<StaffLevelTeachersDto> fetchStaffLevelTeacherList(Integer schoolId) {

        List<StaffLevelTeachersDto> list=dutyDAO.fetchStaffLevelList(schoolId);

        if(!CollectionUtils.isEmpty(list)){
            for (int i =0; i <list.size(); i++) {
                List<TeacherDto> teachers = dutyDAO.fetchStaffLevelTeacherList(schoolId,list.get(i).getId());
                list.get(i).setTeachers(teachers);
            }
        }
        return list;
    }

    @Override
    public void saveStaffTeacher(Integer levelId, Integer userId) {
        DevelopUserDutyLevel userDutyLevel=new DevelopUserDutyLevel();
        userDutyLevel.setUserId(userId);
        userDutyLevel.setDutyLevelId(levelId);
        userDutyLevel.setGmtCreate(new Date());
        userDutyLevel.setGmtModify(new Date());
        userDutyLevel.setIsDelete(IsDeleteEnum.NORMAL.getId());
        userDutyLevelDAO.insertSelective(userDutyLevel);
    }

    @Override
    public void saveDomain(List<DomainDto> domains,Integer type,Integer levelId,Integer year,Integer schoolId,Integer term) throws BizException{
        DevelopDutyLevelSkill skill=new DevelopDutyLevelSkill();
        String code=null;
        if(!CollectionUtils.isEmpty(domains)){
            for (DomainDto domain:domains) {
                if(StringUtils.isEmpty(domain.getName())){
                    throw new BizException(SettingsError.DOMAIN_CANNOT_NULL_ERROR);
                }
            }
            for (DomainDto domain:domains) {
                if(domain.getId()==null){
                    code=UUID.randomUUID().toString().replaceAll("-","");
                    this.insertDevelopDutyLevelSkill(domain.getName(),type,SkillDepthEnum.DOMAIN.getId(),
                            0,year,schoolId,SelfEvaluationPeriodEnum.MID_YEAR.getId(),code);
                }else{
                    skill=null;
                    skill=skillDAO.selectByPrimaryKey(domain.getId());
                    if(skill!=null){
                        skill.setName(domain.getName());
                        skill.setGmtModify(new Date());
                        skillDAO.updateByPrimaryKey(skill);
                    }
                }
            }
        }
    }

    @Override
    public void saveCategorys(DomainDto domain,Integer type,Integer levelId,Integer year,Integer schoolId,Integer term) throws BizException{
        List<CategoryDto> categorys=domain.getCategorys();
        DevelopDutyLevelSkill skill=skillDAO.selectByPrimaryKey(domain.getId());
        String parentCode=skill.getCode();
        if(!StringUtils.isEmpty(parentCode)){
            parentCode=parentCode+"-";
        }
        String code=null;
        if(!CollectionUtils.isEmpty(categorys)){
            for (CategoryDto category:categorys) {
                if(StringUtils.isEmpty(category.getName())){
                    throw new BizException(SettingsError.CATEGORY_CANNOT_NULL_ERROR);
                }
            }
            for (CategoryDto category:categorys) {
                if(category.getId()==null){
                    code=parentCode+UUID.randomUUID().toString().replaceAll("-","");
                    this.insertDevelopDutyLevelSkill(category.getName(),type,SkillDepthEnum.CATEGORY.getId(),
                            domain.getId(),year,schoolId,SelfEvaluationPeriodEnum.MID_YEAR.getId(),code);
                }else{
                    skill=null;
                    skill=skillDAO.selectByPrimaryKey(category.getId());
                    if(skill!=null){
                        skill.setName(category.getName());
                        skill.setGmtModify(new Date());
                        skillDAO.updateByPrimaryKey(skill);
                    }
                }
            }
        }
    }
    @Override
    public void saveSkillGuidings(List<DomainDto> domains,Integer type,Integer levelId,Integer year,Integer schoolId,Integer term) throws BizException {
        DevelopDutyLevelSkill skill=new DevelopDutyLevelSkill();
        List<DevelopSkillGuidings> skillGuidings=null;
        DevelopSkillGuidings skillGuiding=new DevelopSkillGuidings();
        List<CategoryDto> categorys=null;
        List<SkillDto> skills=null;
        Integer skillId=null;
        List<DevelopDutyLevelSkill> developSkills=new ArrayList<>();
        List<Integer> deleteIds=new ArrayList<>();
        String parentCode=null;
        String code=null;
        for (DomainDto domain:domains){
            categorys=null;
            categorys=domain.getCategorys();
            if(!CollectionUtils.isEmpty(categorys)){
                for (CategoryDto category:categorys) {
                    skills=null;
                    skills=category.getSkills();
                    if(!CollectionUtils.isEmpty(skills)) {
                        for(SkillDto skillDto:skills){
                            if(StringUtils.isEmpty(skillDto.getName())){
                                throw new BizException(SettingsError.SKILL_NAME_CANNOT_NULL_ERROR);
                            }
                        }
                    }
                }
            }
        }
        for (DomainDto domain:domains){
            categorys=null;
            categorys=domain.getCategorys();
            if(!CollectionUtils.isEmpty(categorys)){
                for (CategoryDto category:categorys) {
                    skill=skillDAO.selectByPrimaryKey(category.getId());
                    parentCode=skill.getCode();
                    if(!StringUtils.isEmpty(parentCode)){
                        parentCode=parentCode+"-";
                    }
                    skills=null;
                    skills=category.getSkills();
                    DevelopDutyLevelSkillExample DevelopDutyLevelSkillExample=new DevelopDutyLevelSkillExample();
                    DevelopDutyLevelSkillExample.createCriteria().andTypeEqualTo(type).andDepthEqualTo(SkillDepthEnum.SKILL.getId()).
                            andYearEqualTo(year).andSchoolIdEqualTo(schoolId).andParentIdEqualTo(category.getId()).
                            andTermEqualTo(term.toString()).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
                    developSkills=skillDAO.selectByExample(DevelopDutyLevelSkillExample);
                    if(!CollectionUtils.isEmpty(developSkills)){
                        for(DevelopDutyLevelSkill developSkill:developSkills)
                        deleteIds.add(developSkill.getId());
                    }
                    if(!CollectionUtils.isEmpty(skills)) {
                        for(SkillDto skillDto:skills){
                            if(skillDto.getId()==null){
                                //新增
                                skillId=null;
                                code=parentCode+UUID.randomUUID().toString().replaceAll("-","");
                                skillId=this.insertDevelopDutyLevelSkill(skillDto.getName(),type,SkillDepthEnum.SKILL.getId(),
                                        category.getId(),year,schoolId,term,code);
                                if(skillId!=null){
                                    skillGuiding.setGmtModify(new Date());
                                    skillGuiding.setGmtCreate(new Date());
                                    skillGuiding.setDutyLevelId(levelId);
                                    skillGuiding.setSkillId(skillId);
                                    skillGuiding.setGuidingQuestions(skillDto.getGuidingQuestions()==null?null:skillDto.getGuidingQuestions());
                                    skillGuiding.setIsDelete(IsDeleteEnum.NORMAL.getId());
                                    skillGuidingsDAO.insertSelective(skillGuiding);
                                }
                            }else{
                                //修改
                                skill=null;
                                skill=skillDAO.selectByPrimaryKey(skillDto.getId());
                                deleteIds.remove(skillDto.getId());
                                if(skill!=null){
                                    skill.setName(skillDto.getName());
                                    skill.setGmtModify(new Date());
                                    skillDAO.updateByPrimaryKey(skill);
                                    if(!StringUtils.isEmpty(skillDto.getGuidingQuestions())){
                                        DevelopSkillGuidingsExample example=new DevelopSkillGuidingsExample();
                                        example.createCriteria().andDutyLevelIdEqualTo(levelId).
                                                andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId()).
                                                andSkillIdEqualTo(skill.getId());
                                        skillGuidings=skillGuidingsDAO.selectByExample(example);
                                        if(!CollectionUtils.isEmpty(skillGuidings)){
                                            for(DevelopSkillGuidings guidings:skillGuidings){
                                                guidings.setGuidingQuestions(skillDto.getGuidingQuestions());
                                                guidings.setGmtModify(new Date());
                                                skillGuidingsDAO.updateByPrimaryKey(guidings);
                                            }
                                        }else{
                                            skillGuiding.setGmtModify(new Date());
                                            skillGuiding.setGmtCreate(new Date());
                                            skillGuiding.setDutyLevelId(levelId);
                                            skillGuiding.setSkillId(skillDto.getId());
                                            skillGuiding.setGuidingQuestions(skillDto.getGuidingQuestions());
                                            skillGuiding.setIsDelete(IsDeleteEnum.NORMAL.getId());
                                            skillGuidingsDAO.insertSelective(skillGuiding);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(!CollectionUtils.isEmpty(deleteIds)){
            for(Integer id:deleteIds){
                DevelopDutyLevelSkill deleteSkill=new DevelopDutyLevelSkill();
                deleteSkill=skillDAO.selectByPrimaryKey(id);
                if(deleteSkill!=null){
                    deleteSkill.setIsDelete(IsDeleteEnum.DELETEED.getId());
                    deleteSkill.setGmtModify(new Date());
                    skillDAO.updateByPrimaryKey(deleteSkill);
                }
            }
        }
    }

    @Override
    public List<DomainDto> fetchFrameworkSkillList(Integer type, Integer levelId, Integer year, Integer schoolId,Integer term) {
        List<DomainDto> domainDtos=new ArrayList<>();
        List<DevelopSkillGuidings> skillGuidings=new ArrayList<>();
        List<DevelopDutyLevelSkill> domainList=new ArrayList<>();
        List<DevelopDutyLevelSkill> categoryList=new ArrayList<>();
        List<DevelopDutyLevelSkill> guidingQuestionList=new ArrayList<>();
        DevelopDutyLevelSkillExample domainExample=new DevelopDutyLevelSkillExample();
        domainExample.createCriteria().andTypeEqualTo(type).andDepthEqualTo(SkillDepthEnum.DOMAIN.getId()).
                andYearEqualTo(year).andSchoolIdEqualTo(schoolId).
                andTermEqualTo(term.toString()).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
        domainList=skillDAO.selectByExample(domainExample);
        if(!CollectionUtils.isEmpty(domainList)){
            for(DevelopDutyLevelSkill domainSkill:domainList){
                DomainDto domainDto=new DomainDto();
                domainDto.setId(domainSkill.getId());
                domainDto.setName(domainSkill.getName());
                List<CategoryDto> categorys=new ArrayList<>();
                DevelopDutyLevelSkillExample categoryExample=new DevelopDutyLevelSkillExample();
                categoryExample.createCriteria().andTypeEqualTo(type).andDepthEqualTo(SkillDepthEnum.CATEGORY.getId()).
                        andYearEqualTo(year).andSchoolIdEqualTo(schoolId).andParentIdEqualTo(domainSkill.getId()).
                        andTermEqualTo(term.toString()).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
                categoryList=skillDAO.selectByExample(categoryExample);
                if(!CollectionUtils.isEmpty(categoryList)){
                    for(DevelopDutyLevelSkill categorySkill:categoryList){
                        CategoryDto categoryDto=new CategoryDto();
                        categoryDto.setId(categorySkill.getId());
                        categoryDto.setName(categorySkill.getName());
                        List<SkillDto> skills=new ArrayList<>();
                        DevelopDutyLevelSkillExample skillExample=new DevelopDutyLevelSkillExample();
                        skillExample.createCriteria().andTypeEqualTo(type).andDepthEqualTo(SkillDepthEnum.SKILL.getId()).
                                andYearEqualTo(year).andSchoolIdEqualTo(schoolId).andParentIdEqualTo(categorySkill.getId()).
                                andTermEqualTo(term.toString()).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
                        guidingQuestionList=skillDAO.selectByExample(skillExample);
                        if(!CollectionUtils.isEmpty(guidingQuestionList)){
                            for(DevelopDutyLevelSkill guidingQuestionSkill:guidingQuestionList){
                                SkillDto skillDto=new SkillDto();
                                skillDto.setId(guidingQuestionSkill.getId());
                                skillDto.setName(guidingQuestionSkill.getName());
                                DevelopSkillGuidingsExample guidingsExample=new DevelopSkillGuidingsExample();
                                guidingsExample.createCriteria().andSkillIdEqualTo(guidingQuestionSkill.getId()).
                                        andDutyLevelIdEqualTo(levelId).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
                                skillGuidings=skillGuidingsDAO.selectByExample(guidingsExample);
                                if(!CollectionUtils.isEmpty(skillGuidings)){
                                    skillDto.setGuidingQuestions(skillGuidings.get(0).getGuidingQuestions());
                                }
                                skills.add(skillDto);
                            }
                            if(!CollectionUtils.isEmpty(skills)){
                                categoryDto.setSkills(skills);
                            }
                        }
                        categorys.add(categoryDto);
                    }
                    if(!CollectionUtils.isEmpty(categorys)){
                        domainDto.setCategorys(categorys);
                    }
                }
                domainDtos.add(domainDto);
            }
        }
        return domainDtos;
    }



    private Integer insertDevelopDutyLevelSkill(String name,Integer type,Integer depth,Integer parentId,Integer year,Integer schoolId,Integer term,String code){
        DevelopDutyLevelSkill skill=new DevelopDutyLevelSkill();
        skill.setName(name);
        skill.setType(type);
        skill.setDepth(depth);
        skill.setGmtModify(new Date());
        skill.setGmtCreate(new Date());
        skill.setYear(year);
        skill.setParentId(parentId);
        skill.setSchoolId(schoolId);
        skill.setTerm(term.toString());
        skill.setCode(code);
        skillDAO.insertSelective(skill);
        Integer id=skill.getId();
        return id;
    }

	@Override
	public void upgradeScore(List<DevelopTimeSetting> list) {
		//如果升级集合不为空，就要多集合中的配置数据进行升级
		if(!CollectionUtils.isEmpty(list)) {
			
			DevelopRating newRating = new DevelopRating();
			Date date = new Date();
			
			for(DevelopTimeSetting timeSetting : list) {
				Integer year = timeSetting.getYear();
				Integer period = timeSetting.getPeriod();
				if(period.intValue() == SelfEvaluationPeriodEnum.ANNUAL.getId()) {
					period = SelfEvaluationPeriodEnum.MID_YEAR.getId();
				}else {
					period = SelfEvaluationPeriodEnum.ANNUAL.getId();
					year = year-1;
				}
				//查询上学期的rating
				DevelopRatingExample example = new DevelopRatingExample();
				example.createCriteria()
					.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId())
					.andYearEqualTo(year)
					.andPeriodEqualTo(period)
					.andSchoolIdEqualTo(timeSetting.getSchoolId());
				List<DevelopRating> ratingList = ratingDAO.selectByExample(example);
				
				//将去年的rating顺延到今年来
				if(!CollectionUtils.isEmpty(ratingList)) {
					for(DevelopRating rating : ratingList) {
						newRating.setId(null);
						newRating.setGmtCreate(date);
						newRating.setGmtModify(date);
						newRating.setIsDelete(IsDeleteEnum.NORMAL.getId());
						newRating.setName(rating.getName());
						newRating.setScore(rating.getScore());
						newRating.setRateKeys(rating.getRateKeys());
						newRating.setYear(timeSetting.getYear());
						newRating.setSchoolId(timeSetting.getSchoolId());
						newRating.setPeriod(timeSetting.getPeriod());
						ratingDAO.insertSelective(newRating);
					}
				}
			}
		}
	}

	@Override
	public void upgradeDutyLevelSkill(List<DevelopTimeSetting> list) {
		if(!CollectionUtils.isEmpty(list)) {
			Date date = new Date();
			DevelopDutyLevelSkill newSkill = new DevelopDutyLevelSkill();
			DevelopSkillGuidings newSkillGuidings = new DevelopSkillGuidings();
			Integer parentId;
			
			for(DevelopTimeSetting timeSetting : list) {
				Integer year = timeSetting.getYear();
				Integer period = timeSetting.getPeriod();
				if(period.intValue() == SelfEvaluationPeriodEnum.ANNUAL.getId()) {
					period = SelfEvaluationPeriodEnum.MID_YEAR.getId();
				}else {
					period = SelfEvaluationPeriodEnum.ANNUAL.getId();
					year = year-1;
				}
				//查询上一学期的skill，复制过来
				DevelopDutyLevelSkillExample example = new DevelopDutyLevelSkillExample();
				example.createCriteria()
					.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId())
					.andSchoolIdEqualTo(timeSetting.getSchoolId())
					.andYearEqualTo(year)
					.andTermEqualTo(period+"");
				example.setOrderByClause(" depth asc");
				List<DevelopDutyLevelSkill> dutyLevelSkillList = dutyLevelSkillDAO.selectByExample(example);
				
				//这里是查询正常的custom skill
				if(!CollectionUtils.isEmpty(dutyLevelSkillList)) {
					//缓存 对应老id和新id
					Map<Integer,Integer> oldIdToNewIdMap = new HashedMap<>();
					
					for(DevelopDutyLevelSkill oldSkill : dutyLevelSkillList) {
						
						if(oldSkill.getParentId() == 0) {
							parentId = 0;
						}else {
							parentId = oldIdToNewIdMap.get(oldSkill.getParentId());
						}
						
						newSkill.setId(null);
						newSkill.setGmtCreate(date);
						newSkill.setGmtModify(date);
						newSkill.setIsDelete(IsDeleteEnum.NORMAL.getId());
						newSkill.setType(oldSkill.getType());
						newSkill.setName(oldSkill.getName());
						newSkill.setDepth(oldSkill.getDepth());
						newSkill.setYear(timeSetting.getYear());
						newSkill.setTerm(timeSetting.getPeriod()+"");
						newSkill.setSchoolId(timeSetting.getSchoolId());
						newSkill.setParentId(parentId);
						newSkill.setLastYearSelfId(oldSkill.getId());
						newSkill.setCode(oldSkill.getCode());
						dutyLevelSkillDAO.insertSelective(newSkill);
						
						//由于已经排序过,所以前面的一定是 0 后面的 parentid一定能在map里面找到
						oldIdToNewIdMap.put(oldSkill.getId(), newSkill.getId());
						//以上就复制skill
						
						//首先只有depth等于3才会有guidings
						if(newSkill.getDepth() == 3) {
							//将guilding顺延过来
							DevelopSkillGuidingsExample skillGuidingsExample = new DevelopSkillGuidingsExample();
							skillGuidingsExample.createCriteria()
								.andSkillIdEqualTo(oldSkill.getId())
								.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
							List<DevelopSkillGuidings> skillGuidingsList = skillGuidingsDAO.selectByExample(skillGuidingsExample);
							if(!CollectionUtils.isEmpty(skillGuidingsList)) {
								for(DevelopSkillGuidings oldSkillGuidings : skillGuidingsList) {
									newSkillGuidings.setId(null);
									newSkillGuidings.setGmtCreate(date);
									newSkillGuidings.setGmtModify(date);
									newSkillGuidings.setIsDelete(IsDeleteEnum.NORMAL.getId());
									newSkillGuidings.setDutyLevelId(oldSkillGuidings.getDutyLevelId());
									newSkillGuidings.setGuidingQuestions(oldSkillGuidings.getGuidingQuestions());
									newSkillGuidings.setSkillId(newSkill.getId());
									skillGuidingsDAO.insertSelective(newSkillGuidings);
								}
							}
						}
					}
				}
			}
		}
	}

    @Override
    public void saveTimeSetting(List<SessionTimeDto> timeDtos, Integer year, Integer schoolId) throws ParseException,BizException{
        Date date1=new Date(timeDtos.get(0).getTeacherEndTime());
        Date date2=new Date(timeDtos.get(1).getStartTime());
        if(date1.getTime()>=date2.getTime()){
            throw new BizException(SettingsError.DATE_REPEAT_ERROR);
        }
        for (SessionTimeDto timeDto:timeDtos) {
            DevelopTimeSetting timeSetting=new DevelopTimeSetting();
            if(timeDto.getId()==null){
                timeSetting.setGmtCreate(new Date());
                timeSetting.setGmtModify(new Date());
                timeSetting.setPeriod(timeDto.getTerm());
                timeSetting.setSchoolId(schoolId);
                timeSetting.setYear(year);
                timeSetting.setIsDelete(IsDeleteEnum.NORMAL.getId());
                timeSetting.setStartTime(new Date(timeDto.getStartTime()));
                timeSetting.setEndTime(new Date(timeDto.getEndTime()));
                timeSetting.setTeacherEndTime(new Date(timeDto.getTeacherEndTime()));
                timeSetting.setExecutionTime(new Date());
                timeSetting.setExecutionNum(0);
                timeSettingDAO.insertSelective(timeSetting);
            }else{
                timeSetting=timeSettingDAO.selectByPrimaryKey(timeDto.getId());
                timeSetting.setStartTime(new Date(timeDto.getStartTime()));
                timeSetting.setEndTime(new Date(timeDto.getEndTime()));
                timeSetting.setTeacherEndTime(new Date(timeDto.getTeacherEndTime()));
                timeSetting.setExecutionTime(new Date());
                timeSetting.setExecutionNum(0);
                timeSettingDAO.updateByPrimaryKey(timeSetting);
            }
        }
    }

    @Override
    public TimeSettingDto fetchSettingTime(Integer year, Integer schoolId) {
        Date date=new Date();
        SimpleDateFormat formatYear=new SimpleDateFormat("yyyy");
        Integer nowYear=Integer.parseInt(formatYear.format(date));
        TimeSettingDto timeSettingDto=new TimeSettingDto();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        String nowDate=dateFormat.format(date);
        timeSettingDto.setNowYear(nowDate);
        DevelopTimeSettingExample example=new DevelopTimeSettingExample();
        List<DevelopTimeSetting> timeSettingList=new ArrayList<>();
        if(year.intValue()==nowYear.intValue()){
            example.createCriteria().andYearBetween(nowYear+1,nowYear+2).
                    andSchoolIdEqualTo(schoolId).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
            timeSettingList=timeSettingDAO.selectByExample(example);
        }else if(year.intValue()==nowYear.intValue()+1){
            example.createCriteria().andYearEqualTo(nowYear+2).
                    andSchoolIdEqualTo(schoolId).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
            timeSettingList=timeSettingDAO.selectByExample(example);
        }else if(year.intValue()==nowYear.intValue()+2){
            timeSettingDto.setFlag(false);
        }else if(year.intValue()==nowYear.intValue()-1){
            example.createCriteria().andYearBetween(nowYear,nowYear+2).
                    andSchoolIdEqualTo(schoolId).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
            timeSettingList=timeSettingDAO.selectByExample(example);
        }else if(year.intValue()==nowYear.intValue()-2){
            example.createCriteria().andYearBetween(nowYear-1,nowYear+2).
                    andSchoolIdEqualTo(schoolId).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
            timeSettingList=timeSettingDAO.selectByExample(example);
        }
        if(!CollectionUtils.isEmpty(timeSettingList)){
            timeSettingDto.setFlag(true);
        }else{
            timeSettingDto.setFlag(false);
        }
        DevelopTimeSettingExample timeSettingExample=new DevelopTimeSettingExample();
        timeSettingExample.createCriteria().andYearEqualTo(year).
                andSchoolIdEqualTo(schoolId).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
        timeSettingExample.setOrderByClause("period asc");
        timeSettingList=timeSettingDAO.selectByExample(timeSettingExample);
        List<SessionTimeDto> timeList=new ArrayList<>();
        if(!CollectionUtils.isEmpty(timeSettingList)){
            for(DevelopTimeSetting timeSetting:timeSettingList){
                SessionTimeDto sessionTimeDto=new SessionTimeDto();
                sessionTimeDto.setId(timeSetting.getId());
                sessionTimeDto.setTerm(timeSetting.getPeriod());
                if(timeSetting.getStartTime().getTime()>=date.getTime()){
                    sessionTimeDto.setSlag(false);
                }else{
                    sessionTimeDto.setSlag(true);
                }
                sessionTimeDto.setStartTime(dateFormat.format(timeSetting.getStartTime()));
                if(timeSetting.getEndTime().getTime()>=date.getTime()){
                    sessionTimeDto.setElag(false);
                }else{
                    sessionTimeDto.setElag(true);
                }
                sessionTimeDto.setEndTime(dateFormat.format(timeSetting.getEndTime()));
                if(timeSetting.getTeacherEndTime().getTime()>=date.getTime()){
                    sessionTimeDto.setTlag(false);
                }else{
                    sessionTimeDto.setTlag(true);
                }
                sessionTimeDto.setTeacherEndTime(dateFormat.format(timeSetting.getTeacherEndTime()));
                timeList.add(sessionTimeDto);
            }
        }else{
            for (int i =1; i <=2; i++) {
                SessionTimeDto sessionTimeDto=new SessionTimeDto();
                sessionTimeDto.setId(null);
                sessionTimeDto.setTerm(i);
                sessionTimeDto.setStartTime(null);
                sessionTimeDto.setEndTime(null);
                sessionTimeDto.setTeacherEndTime(null);
                sessionTimeDto.setSlag(false);
                sessionTimeDto.setElag(false);
                sessionTimeDto.setTlag(false);
                timeList.add(sessionTimeDto);
            }
        }
        timeSettingDto.setTimes(timeList);
        return timeSettingDto;
    }

    @Override
    public List<Integer> fetchSkillLevelGrade() {
        List<Integer> list=dutyDAO.fetchSkillLevelGrade();
        return list;
    }

    @Override
    public List<Integer> fetchYearList(Integer schoolId) {
        List<Integer> list=dutyDAO.fetchYearList(schoolId);
        return list;
    }
}
