package com.taidii.staffdevelopment.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.dao.IDutyLevelDAO;
import com.taidii.staffdevelopment.dao.IDutyLevelSkillDAO;
import com.taidii.staffdevelopment.dao.IProfessionalDevelopDAO;
import com.taidii.staffdevelopment.dao.IRatingDAO;
import com.taidii.staffdevelopment.dao.ISelfEvaluationDAO;
import com.taidii.staffdevelopment.dao.ISelfEvaluationPlanDAO;
import com.taidii.staffdevelopment.dao.ISelfEvaluationReflectionDAO;
import com.taidii.staffdevelopment.dao.ISelfEvaluationSkillDAO;
import com.taidii.staffdevelopment.dao.ITimeSettingDAO;
import com.taidii.staffdevelopment.dao.IUserDutyLevelDAO;
import com.taidii.staffdevelopment.dto.RatingDTO;
import com.taidii.staffdevelopment.dto.development.TeacherInfoDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.AddPlanDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.CommentDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SaveSelfAchievementsDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SaveSelfPlanDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SaveSelfSkillDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationDetailDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationDutyLevelDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationEventDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPlanDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPlanDetailDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPoorDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPoorListDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationSkillDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationTeacherListDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationTeacherNameDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.TargetScoreDTO;
import com.taidii.staffdevelopment.entity.DevelopDutyLevel;
import com.taidii.staffdevelopment.entity.DevelopDutyLevelSkill;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluation;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationExample;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationPlan;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationPlanExample;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationReflection;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationReflectionExample;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationSkill;
import com.taidii.staffdevelopment.entity.DevelopTimeSetting;
import com.taidii.staffdevelopment.entity.DevelopUserDutyLevel;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;
import com.taidii.staffdevelopment.enums.MarkStatusEnum;
import com.taidii.staffdevelopment.enums.RoleTypeEnum;
import com.taidii.staffdevelopment.enums.SelfEvaluationPeriodEnum;
import com.taidii.staffdevelopment.enums.SelfEvaluationStatusEnum;
import com.taidii.staffdevelopment.error.CommonError;
import com.taidii.staffdevelopment.error.DutyError;
import com.taidii.staffdevelopment.error.SelfEvaluationError;
import com.taidii.staffdevelopment.service.IDutyLevelService;
import com.taidii.staffdevelopment.service.ISelfEvaluationService;
import com.taidii.staffdevelopment.util.DateUtils;

@Service
public class SelfEvaluationServiceImpl implements ISelfEvaluationService{

	@Autowired
	private ISelfEvaluationDAO selfEvaluationDAO;
	@Autowired
	private ISelfEvaluationSkillDAO selfEvaluationSkillDAO;
	@Autowired
	private ISelfEvaluationReflectionDAO selfEvaluationReflectionDAO;
	@Autowired
	private ISelfEvaluationPlanDAO selfEvaluationPlanDAO;
	@Autowired
	private IRatingDAO ratingDAO;
	@Autowired
	private IDutyLevelSkillDAO dutyLevelSkillDAO;
	@Autowired
	private IProfessionalDevelopDAO professionalDevelopDAO;
	@Autowired
	private IUserDutyLevelDAO userDutyLevelDAO;
	@Autowired
	private IDutyLevelDAO dutyLevelDAO;
	@Autowired
	private ITimeSettingDAO timeSettingDAO;
	
	@Autowired
	private IDutyLevelService dutyLevelService;
	
	/**
	 * @description:获取用户自评页面数据
	 * @param year
	 * @param userId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 上午10:04:37
	 */
	@Override
	public SelfEvaluationPoorListDTO getSelfEvaluationList(Integer year, Integer userId,String name) {
		
		SelfEvaluationPoorListDTO selfEvaluationPoorListDTO = new SelfEvaluationPoorListDTO();
		
		//获取用户当前职务，可能为空
		DevelopDutyLevel dutyLevel = dutyLevelService.getDutyLevelByUserId(userId);
		
		//获取用户之前的自评列表
		DevelopSelfEvaluationExample example = new DevelopSelfEvaluationExample();
		example.createCriteria()
			.andUserIdEqualTo(userId)
			.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
		if(year != null) {
			example.getOredCriteria().get(0).andYearEqualTo(year);
		}
		example.setOrderByClause(" id desc ");
		
		List<DevelopSelfEvaluation> developSelfEvaluationList = selfEvaluationDAO.selectByExample(example);
		
		List<SelfEvaluationPoorDTO> list = new ArrayList<>();
		
		if(!CollectionUtils.isEmpty(developSelfEvaluationList)) {
			for(DevelopSelfEvaluation developSelfEvaluation : developSelfEvaluationList) {
				
				SelfEvaluationPoorDTO selfEvaluationPoorDTO = new SelfEvaluationPoorDTO();
				selfEvaluationPoorDTO.setId(developSelfEvaluation.getId());
				selfEvaluationPoorDTO.setLastUpdate(DateUtils.dateToUK(developSelfEvaluation.getGmtModify()));
				selfEvaluationPoorDTO.setPeriod(SelfEvaluationPeriodEnum.getValueById(developSelfEvaluation.getPeriod()));
				selfEvaluationPoorDTO.setStatus(developSelfEvaluation.getStatus());
				selfEvaluationPoorDTO.setYear(developSelfEvaluation.getYear());
				list.add(selfEvaluationPoorDTO);
			}
		}
		
		if(dutyLevel != null) {
			selfEvaluationPoorListDTO.setDutyLevelName(dutyLevel.getName());
		}
		selfEvaluationPoorListDTO.setList(list);
		selfEvaluationPoorListDTO.setUserName(name);
		
		return selfEvaluationPoorListDTO;
	}

	@Override
	public List<Integer> getYearList(Integer userId,String roleType,Integer schoolId) {
		
		Map<String,Object> params = new HashMap<>();
		
		if(RoleTypeEnum.teacher.getId().equals(roleType)) {
			params.put("userId", userId);
		}else {
			params.put("schoolId", schoolId);
		}
		params.put("isDelete", IsDeleteEnum.NORMAL.getId());
		
		return selfEvaluationDAO.getYearList(params);
	}

	@Override
	public SelfEvaluationDetailDTO getSelfEvaluationDetail(Integer id) {
		
		if(id == null) {
			throw new BizException(CommonError.REQUEST_PARAMETER_ERROR);
		}
		
		//获取用户自评
		DevelopSelfEvaluation selfEvaluation = selfEvaluationDAO.selectByPrimaryKey(id);
		
		if(selfEvaluation == null) {
			throw new BizException(SelfEvaluationError.SELF_EVALUATION_NOT_FOUND);
		}
		//获取老师名称
		TeacherInfoDTO teacher = professionalDevelopDAO.fetchNameAndDutyName(selfEvaluation.getUserId());
		
		//获取用户自评skill
		Map<String,Object> params = new HashMap<>();
		
		params.put("dutyLevelId", selfEvaluation.getDutyLevelId());
		params.put("schoolId", selfEvaluation.getSchoolId());
		params.put("parentId", 0);
		params.put("selfEvaluationId", selfEvaluation.getId());
		params.put("isDelete", IsDeleteEnum.NORMAL.getId());
		params.put("year", selfEvaluation.getYear());
		params.put("period", selfEvaluation.getPeriod());
		
		//获取自评基础能力
		List<SelfEvaluationSkillDTO> skillList = getSelfEvaluationSkill(params);
		//调整结构
		this.changeList(skillList, selfEvaluation.getUserId());
		
		//获取个人成就
		List<SelfEvaluationEventDTO> reflection = getSelfEvaluationEvent(selfEvaluation.getId());
		
		//获取未来计划
		List<SelfEvaluationPlanDTO>  planList = getSelfEvaluationPlan(selfEvaluation.getId());
		
		SelfEvaluationDetailDTO selfEvaluationDetailDTO = new SelfEvaluationDetailDTO();
		
		selfEvaluationDetailDTO.setId(id);
		selfEvaluationDetailDTO.setCreateTime(DateUtils.dateToUK(selfEvaluation.getGmtCreate()));
		selfEvaluationDetailDTO.setLastUpdate(DateUtils.dateToUK(selfEvaluation.getGmtModify()));
		selfEvaluationDetailDTO.setUserName(teacher.getTeacherName());
		selfEvaluationDetailDTO.setDutyLevelName(selfEvaluation.getDutyLevelName());
		selfEvaluationDetailDTO.setYear(selfEvaluation.getYear());
		selfEvaluationDetailDTO.setPeriod(SelfEvaluationPeriodEnum.getValueById(selfEvaluation.getPeriod()));
		selfEvaluationDetailDTO.setStatus(SelfEvaluationStatusEnum.getValueById(selfEvaluation.getStatus()));
		selfEvaluationDetailDTO.setEvaluatorComment(selfEvaluation.getEvaluatorComment());
		selfEvaluationDetailDTO.setSkillList(skillList);
		selfEvaluationDetailDTO.setReflection(reflection);
		selfEvaluationDetailDTO.setPlanList(planList);
		
		return selfEvaluationDetailDTO;
	}
	
	/**
	 * @description:递归获取自评能力树
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午3:13:43
	 */
	private List<SelfEvaluationSkillDTO> getSelfEvaluationSkill(Map<String,Object> params){
		
		List<SelfEvaluationSkillDTO> list = selfEvaluationSkillDAO.getSelfEvaluationSkillTree(params);
		
		if(!CollectionUtils.isEmpty(list)) {
			for(SelfEvaluationSkillDTO selfEvaluationSkillDTO : list) {
				params.put("parentId", selfEvaluationSkillDTO.getDutyLevelSkillId());
				List<SelfEvaluationSkillDTO> childList = getSelfEvaluationSkill(params);
				selfEvaluationSkillDTO.setChild(childList);
			}
		}
		return list;
	}
	
	/**
	 * @description:调整结构，将三层关系调整成两层，方便显示
	 * @param list
	 * @param userId
	 * @author: 衷文涛
	 * @createTime:2018年6月22日 上午9:10:28
	 */
	private void changeList(List<SelfEvaluationSkillDTO> list,Integer userId){
		//调整结构，将三层关系调整成两层，方便显示
		if(!CollectionUtils.isEmpty(list)){
			for (SelfEvaluationSkillDTO s : list){
				//第一层
				if(!CollectionUtils.isEmpty(s.getChild())){
					List<SelfEvaluationSkillDTO> newChildList = new ArrayList<>();
					for(SelfEvaluationSkillDTO child : s.getChild()){
						//第二层
						SelfEvaluationSkillDTO newChild = new SelfEvaluationSkillDTO();
						newChild.setId(child.getId());
						newChild.setDepth(child.getDepth());
						newChild.setDutyLevelSkillId(child.getDutyLevelSkillId());
						newChild.setEvidence(child.getEvidence());
						newChild.setGuidingQuestion(child.getGuidingQuestion());
						newChild.setName(child.getName());
						newChild.setRaing(child.getRaing());
						newChild.setSelfEvaluationPlanId(child.getSelfEvaluationPlanId());
						newChildList.add(newChild);

						if(!CollectionUtils.isEmpty(child.getChild())){
							for(SelfEvaluationSkillDTO c : child.getChild()){
								//第三层   将第三层加到第二层

								//如果是第三层，还要判断有没有历史
								boolean flag = selfEvaluationPlanDAO.checkUserHaveCompletePlan(userId, c.getDutyLevelSkillId());

								SelfEvaluationSkillDTO newC = new SelfEvaluationSkillDTO();
								newC.setId(c.getId());
								newC.setDepth(c.getDepth());
								newC.setDutyLevelSkillId(c.getDutyLevelSkillId());
								newC.setEvidence(c.getEvidence());
								newC.setGuidingQuestion(c.getGuidingQuestion());
								newC.setName(c.getName());
								newC.setRaing(c.getRaing());
								newC.setSelfEvaluationPlanId(c.getSelfEvaluationPlanId());
								newC.setHaveHistory(flag);
								newC.setTargetScore(c.getTargetScore());
								newChildList.add(newC);
							}
						}
					}
					s.setChild(newChildList);
				}
			}
		}
	}
	
	/**
	 * @description:通过自评id获取自评时期的成就和特长
	 * @param selfEvaluationId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午3:17:23
	 */
	private List<SelfEvaluationEventDTO> getSelfEvaluationEvent(Integer selfEvaluationId){
		
		List<SelfEvaluationEventDTO> list = new ArrayList<>();
		
		DevelopSelfEvaluationReflectionExample example = new DevelopSelfEvaluationReflectionExample();
		example.createCriteria().andSelfEvaluationIdEqualTo(selfEvaluationId).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
		List<DevelopSelfEvaluationReflection> reflectionList = selfEvaluationReflectionDAO.selectByExample(example);
		if(!CollectionUtils.isEmpty(reflectionList)) {
			for(DevelopSelfEvaluationReflection reflection : reflectionList) {
				SelfEvaluationEventDTO selfEvaluationEventDTO = new SelfEvaluationEventDTO();
				selfEvaluationEventDTO.setId(reflection.getId());
				selfEvaluationEventDTO.setStrengthsOrAchievements(reflection.getStrengthsOrAchievements());
				selfEvaluationEventDTO.setEvidence(reflection.getEvidence());
				selfEvaluationEventDTO.setDate(reflection.getTime());
				list.add(selfEvaluationEventDTO);
			}
		}
		return list;
	}
	
	/**
	 * @description:通过用户自评id获取用户自评计划
	 * @param selfEvaluationId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午4:04:46
	 */
	@Override
	public List<SelfEvaluationPlanDTO> getSelfEvaluationPlan(Integer selfEvaluationId){
		
		List<SelfEvaluationPlanDTO> list = new ArrayList<>();
		
		//直接获取自评相关计划
		List<SelfEvaluationPlanDetailDTO> planList = selfEvaluationPlanDAO.getSelfEvaluationPlanDetail(selfEvaluationId,IsDeleteEnum.NORMAL.getId());
		
		if(!CollectionUtils.isEmpty(planList)) {

			Map<Integer,String> nameMap = new HashMap<>();
			Map<Integer,List<SelfEvaluationPlanDTO>> planDetailMap = new HashMap<>();
			
			//包装
			for(SelfEvaluationPlanDetailDTO planDetailDTO : planList) {

				List<SelfEvaluationPlanDTO> selfEvaluationPlanDTOList;
				if(planDetailMap.get(planDetailDTO.getParentId()) == null){
					selfEvaluationPlanDTOList = new ArrayList<>();
					nameMap.put(planDetailDTO.getParentId(),planDetailDTO.getParentName());
				}else{
					selfEvaluationPlanDTOList = planDetailMap.get(planDetailDTO.getParentId());
				}

				SelfEvaluationPlanDTO e = new SelfEvaluationPlanDTO();
				e.setDutyLevelSkillId(planDetailDTO.getDutyLevelSkillId());
				e.setId(planDetailDTO.getId());
				e.setName(planDetailDTO.getName());
				e.setActionPlan(planDetailDTO.getActionPlan());
				e.setTargetCompleteDate(planDetailDTO.getTargetCompleteDate());
				e.setAreaOfImprovement(planDetailDTO.getAreaOfImprovement());
				e.setDepth(3);
				selfEvaluationPlanDTOList.add(e);
				planDetailMap.put(planDetailDTO.getParentId(), selfEvaluationPlanDTOList);
			}
			
			//包装完毕之后全部拉出来做成集合
			for(Integer id : planDetailMap.keySet()) {
				SelfEvaluationPlanDTO e = new SelfEvaluationPlanDTO();
				e.setId(id);
				e.setName(nameMap.get(id));
				e.setDepth(2);
				list.add(e);
				list.addAll(planDetailMap.get(id));
//				for(SelfEvaluationPlanDTO s : planDetailMap.get(id)){
//					list.add(s);
//				}
			}
		}
		return list;
	}

	@Override
	public List<RatingDTO> getSelfEvaluationRating(Integer id) {
		
		if(id == null) {
			throw new BizException(CommonError.REQUEST_PARAMETER_ERROR);
		}
		
		DevelopSelfEvaluation selfEvaluation = selfEvaluationDAO.selectByPrimaryKey(id);
		
		if(selfEvaluation == null) {
			throw new BizException(SelfEvaluationError.SELF_EVALUATION_NOT_FOUND);
		}
		
		Map<String,Object> params = new HashMap<>();
		params.put("schoolId", selfEvaluation.getSchoolId());
		params.put("year", selfEvaluation.getYear());
		params.put("period", selfEvaluation.getPeriod());
		params.put("isDelete", IsDeleteEnum.NORMAL.getId());
		
		return ratingDAO.queryBy(params);
	}

	/**
	 * @description:保存用户自评的描述和评论
	 * @param saveSkillEvidenceDTO
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 上午11:17:47
	 */
	@Override
	public int saveOrUpdateSelfEvaluationSkill(SaveSelfSkillDTO saveSkillEvidenceDTO,String roleType) {
		
		DevelopSelfEvaluation selfEvaluation = checkSelfEvaluationChange(saveSkillEvidenceDTO.getSelfEvaluationId(),roleType);
		
		checkSelfEvaluationSkill(saveSkillEvidenceDTO.getDutyLevelSkillId());

		DevelopSelfEvaluationSkill selfEvalutionSkill =  new DevelopSelfEvaluationSkill();
		
		Date date = new Date();
		int selfSkillId = 0;
		
		if(saveSkillEvidenceDTO.getSelfSkillId() != null) {
			//更新
			DevelopSelfEvaluationSkill oldSelfEvalutionSkill = selfEvaluationSkillDAO.selectByPrimaryKey(saveSkillEvidenceDTO.getSelfSkillId());
			
			if(oldSelfEvalutionSkill == null) {
				throw new BizException(SelfEvaluationError.SELF_EVALUATION_SKILL_NOT_FOUND);
			}

			selfSkillId = saveSkillEvidenceDTO.getSelfSkillId();

			selfEvalutionSkill.setId(oldSelfEvalutionSkill.getId());
			selfEvalutionSkill.setGmtModify(date);
			if(saveSkillEvidenceDTO.getEvidence() != null) {
				selfEvalutionSkill.setEvidence(saveSkillEvidenceDTO.getEvidence());
			}
			if(saveSkillEvidenceDTO.getScore() != null) {
				selfEvalutionSkill.setScore(saveSkillEvidenceDTO.getScore());
			}
			selfEvaluationSkillDAO.updateByPrimaryKeySelective(selfEvalutionSkill);
		}else {
			//新增
			selfEvalutionSkill.setGmtCreate(date);
			selfEvalutionSkill.setGmtModify(date);
			selfEvalutionSkill.setIsDelete(IsDeleteEnum.NORMAL.getId());
			selfEvalutionSkill.setSelfEvaluationId(saveSkillEvidenceDTO.getSelfEvaluationId());
			selfEvalutionSkill.setDutyLevelSkillId(saveSkillEvidenceDTO.getDutyLevelSkillId());
			if(saveSkillEvidenceDTO.getEvidence() != null) {
				selfEvalutionSkill.setEvidence(saveSkillEvidenceDTO.getEvidence());
			}
			if(saveSkillEvidenceDTO.getScore() != null) {
				selfEvalutionSkill.setScore(saveSkillEvidenceDTO.getScore());
			}
			selfEvaluationSkillDAO.insertSelective(selfEvalutionSkill);
			selfSkillId = selfEvalutionSkill.getId();
		}
		
		DevelopSelfEvaluation newSelfEvaluation = new DevelopSelfEvaluation();
		newSelfEvaluation.setId(selfEvaluation.getId());
		newSelfEvaluation.setGmtModify(date);
		selfEvaluationDAO.updateByPrimaryKeySelective(newSelfEvaluation);
		
		return selfSkillId;
	}
	
	/**
	 * @description:校验员工自评是否可以编辑
	 * @param id
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 上午9:32:56
	 */
	private DevelopSelfEvaluation checkSelfEvaluationChange(Integer id,String roleType) {
		
		if(id == null) {
			throw new BizException(CommonError.REQUEST_PARAMETER_ERROR);
		}
		
		DevelopSelfEvaluation selfEvaluation = selfEvaluationDAO.selectByPrimaryKey(id);
		
		if(selfEvaluation == null) {
			throw new BizException(SelfEvaluationError.SELF_EVALUATION_NOT_FOUND);
		}
		
		if(selfEvaluation.getIsDelete().intValue() == IsDeleteEnum.DELETEED.getId()) {
			throw new BizException(SelfEvaluationError.SELF_EVALUATION_NOT_FOUND);
		}
		
		if(RoleTypeEnum.teacher.getId().equals(roleType)) {
			if(selfEvaluation.getStatus().intValue() != SelfEvaluationStatusEnum.DRAFT.getId()) {
				throw new BizException(SelfEvaluationError.SELF_EVALUATION_NOT_IN_DRAFT);
			}
		}else {
			if(selfEvaluation.getStatus().intValue() != SelfEvaluationStatusEnum.SUBMIT.getId()) {
				throw new BizException(SelfEvaluationError.SELF_EVALUATION_NOT_IN_SUBMIT);
			}
		}
		
		return selfEvaluation;
	}
	
	/**
	 * @description:校验这个能力的 Id  是否属于这个职务等级
	 * @param dutyLevelSkillId
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 上午11:06:44
	 */
	private void checkSelfEvaluationSkill(Integer dutyLevelSkillId) {
		//判断能力是否在这个职务里面
		DevelopDutyLevelSkill skill = dutyLevelSkillDAO.selectByPrimaryKey(dutyLevelSkillId);
		if(skill == null || skill.getIsDelete().intValue() == IsDeleteEnum.DELETEED.getId()) {
			throw new BizException(DutyError.DUTY_NOT_CONTAIN_SKILL);
		}
	}

	/**
	 * @description:保存自评成就
	 * @param saveSelfAchievementsDTO
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 上午11:41:13
	 */
	@Override
	public int saveOrUpdateSelfEvaluationReflection(SaveSelfAchievementsDTO saveSelfAchievementsDTO,String roleType) {
		
		DevelopSelfEvaluation selfEvaluation = checkSelfEvaluationChange(saveSelfAchievementsDTO.getSelfEvaluationId(),roleType);
		
		Date date = new Date();

		int refectionId = 0;
		
		if(saveSelfAchievementsDTO.getId() == null) {
			//新增
			DevelopSelfEvaluationReflection reflection = new DevelopSelfEvaluationReflection();
			reflection.setGmtCreate(date);
			reflection.setGmtModify(date);
			reflection.setIsDelete(IsDeleteEnum.NORMAL.getId());
			reflection.setSelfEvaluationId(saveSelfAchievementsDTO.getSelfEvaluationId());
			if(saveSelfAchievementsDTO.getStrengthsOrAchievements() != null) {
				reflection.setStrengthsOrAchievements(saveSelfAchievementsDTO.getStrengthsOrAchievements());
			}
			if(saveSelfAchievementsDTO.getEvidence() != null) {
				reflection.setEvidence(saveSelfAchievementsDTO.getEvidence());
			}
			if(saveSelfAchievementsDTO.getTime() != null) {
				reflection.setTime(saveSelfAchievementsDTO.getTime());
			}
			selfEvaluationReflectionDAO.insertSelective(reflection);

			refectionId = reflection.getId();
		}else {
			//更新
			//校验是否存在
			DevelopSelfEvaluationReflection oldReflection = selfEvaluationReflectionDAO.selectByPrimaryKey(saveSelfAchievementsDTO.getId());
			if(oldReflection == null) {
				throw new BizException(SelfEvaluationError.SELF_EVALUATION_SKILL_NOT_FOUND);
			}

			refectionId = saveSelfAchievementsDTO.getId();

			if(saveSelfAchievementsDTO.getSelfEvaluationId().intValue() != oldReflection.getSelfEvaluationId()) {
				throw new BizException(SelfEvaluationError.SELF_EVALUATION_REFLECTION_DATA_ERROR);
			}
			DevelopSelfEvaluationReflection reflection = new DevelopSelfEvaluationReflection();
			reflection.setId(oldReflection.getId());
			reflection.setGmtModify(date);
			if(saveSelfAchievementsDTO.getStrengthsOrAchievements() != null) {
				reflection.setStrengthsOrAchievements(saveSelfAchievementsDTO.getStrengthsOrAchievements());
			}
			if(saveSelfAchievementsDTO.getEvidence() != null) {
				reflection.setEvidence(saveSelfAchievementsDTO.getEvidence());
			}
			if(saveSelfAchievementsDTO.getTime() != null) {
				reflection.setTime(saveSelfAchievementsDTO.getTime());
			}
			selfEvaluationReflectionDAO.updateByPrimaryKeySelective(reflection);
		}
		
		DevelopSelfEvaluation newSelfEvaluation = new DevelopSelfEvaluation();
		newSelfEvaluation.setId(selfEvaluation.getId());
		newSelfEvaluation.setGmtModify(date);
		selfEvaluationDAO.updateByPrimaryKeySelective(newSelfEvaluation);
		
		return refectionId;
	}

	/**
	 * @description:保存用户自评计划
	 * @param saveSelfPlanDTO
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 下午2:19:29
	 */
	@Override
	public int saveOrUpdateSelfEvaluationPlan(SaveSelfPlanDTO saveSelfPlanDTO,String roleType) {
		
		checkSelfEvaluationChange(saveSelfPlanDTO.getSelfEvaluationId(),roleType);
		
		checkSelfEvaluationSkill(saveSelfPlanDTO.getDutyLevelSkillId());

		Date date = new Date();

		if(saveSelfPlanDTO.getId() == null) {
			throw new BizException(SelfEvaluationError.SELF_EVALUATION_PLAN_NOT_FOUND);
		}
		
		//更新
		DevelopSelfEvaluationPlan oldPlan = selfEvaluationPlanDAO.selectByPrimaryKey(saveSelfPlanDTO.getId());
		if(oldPlan == null) {
			throw new BizException(SelfEvaluationError.SELF_EVALUATION_PLAN_NOT_FOUND);
		}

		DevelopSelfEvaluationPlan plan = new DevelopSelfEvaluationPlan();
		plan.setId(oldPlan.getId());
		plan.setGmtModify(date);
		if(saveSelfPlanDTO.getActionPlan() != null) {
			plan.setActionPlan(saveSelfPlanDTO.getActionPlan());
		}
		if(saveSelfPlanDTO.getTargetCompleteDate() != null) {
			plan.setTargetCompleteDate(saveSelfPlanDTO.getTargetCompleteDate());
		}
		if(saveSelfPlanDTO.getAreaOfImprovement() != null) {
			plan.setAreaOfImprovement(saveSelfPlanDTO.getAreaOfImprovement());
		}
		selfEvaluationPlanDAO.updateByPrimaryKeySelective(plan);
		
		DevelopSelfEvaluation newSelfEvaluation = new DevelopSelfEvaluation();
		newSelfEvaluation.setId(saveSelfPlanDTO.getSelfEvaluationId());
		newSelfEvaluation.setGmtModify(date);
		selfEvaluationDAO.updateByPrimaryKeySelective(newSelfEvaluation);
		
		return saveSelfPlanDTO.getId();
	}

	/**
	 * @description:提交用户自评
	 * @param id
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 下午2:23:30
	 */
	@Override
	public void submitSelfEvaluation(Integer id,String roleType) {
		
		DevelopSelfEvaluation selfEvaluation = checkSelfEvaluationChange(id,roleType);
		
		DevelopSelfEvaluation newSelfEvaluation = new DevelopSelfEvaluation();
		newSelfEvaluation.setId(selfEvaluation.getId());
		newSelfEvaluation.setGmtModify(new Date());
		if(RoleTypeEnum.teacher.getId().equals(roleType)) {
			newSelfEvaluation.setStatus(SelfEvaluationStatusEnum.SUBMIT.getId());
		}else {
			newSelfEvaluation.setStatus(SelfEvaluationStatusEnum.REVIEWED.getId());
		}
		
		selfEvaluationDAO.updateByPrimaryKeySelective(newSelfEvaluation);
	}

	@Override
	public void saveOrUpdatePlan(AddPlanDTO addPlanDTO,String roleType) {
		
		Date date = new Date();
		Map<Integer,DevelopSelfEvaluationPlan> planMap = new HashMap<>();
		
		//校验自评
		checkSelfEvaluationChange(addPlanDTO.getSelfEvaluationId(),roleType);
		
		DevelopSelfEvaluationPlanExample example = new DevelopSelfEvaluationPlanExample();
		example.createCriteria()
			.andSelfEvaluationIdEqualTo(addPlanDTO.getSelfEvaluationId())
			.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
		List<DevelopSelfEvaluationPlan> selfEvaluationPlanList = selfEvaluationPlanDAO.selectByExample(example);
		if(!CollectionUtils.isEmpty(selfEvaluationPlanList)) {
			for(DevelopSelfEvaluationPlan plan : selfEvaluationPlanList) {
				planMap.put(plan.getDutyLevelSkillId(), plan);
			}
		}
		
		//校验那些打钩了的，有调整就修改
		if(!CollectionUtils.isEmpty(addPlanDTO.getScoreList())) {
			for(TargetScoreDTO scoreDTO : addPlanDTO.getScoreList()) {
				DevelopSelfEvaluationPlan plan = planMap.get(scoreDTO.getDutyLevelSkillId());
				if(plan != null) {
					DevelopSelfEvaluationPlan newPlan = new DevelopSelfEvaluationPlan();
					newPlan.setId(plan.getId());
					newPlan.setTargetScore(scoreDTO.getTargetScore());
					newPlan.setGmtModify(date);
					selfEvaluationPlanDAO.updateByPrimaryKeySelective(newPlan);
					planMap.put(scoreDTO.getDutyLevelSkillId(), null);
				}else {
					DevelopSelfEvaluationPlan newPlan = new DevelopSelfEvaluationPlan();
					newPlan.setTargetScore(scoreDTO.getTargetScore());
					newPlan.setGmtCreate(date);
					newPlan.setGmtModify(date);
					newPlan.setIsDelete(IsDeleteEnum.NORMAL.getId());
					newPlan.setDutyLevelSkillId(scoreDTO.getDutyLevelSkillId());
					newPlan.setSelfEvaluationId(addPlanDTO.getSelfEvaluationId());
					newPlan.setStatus(MarkStatusEnum.UNFINISH.getId());
					selfEvaluationPlanDAO.insert(newPlan);
				}
			}
		}
		
		//去除那些未打钩的
		for(Integer id : planMap.keySet()) {
			DevelopSelfEvaluationPlan plan = planMap.get(id);
			if(plan != null) {
				DevelopSelfEvaluationPlan newPlan = new DevelopSelfEvaluationPlan();
				newPlan.setId(plan.getId());
				newPlan.setGmtModify(date);
				newPlan.setIsDelete(IsDeleteEnum.DELETEED.getId());
				selfEvaluationPlanDAO.updateByPrimaryKeySelective(newPlan);
			}
		}
		
		DevelopSelfEvaluation newSelfEvaluation = new DevelopSelfEvaluation();
		newSelfEvaluation.setId(addPlanDTO.getSelfEvaluationId());
		newSelfEvaluation.setGmtModify(date);
		selfEvaluationDAO.updateByPrimaryKeySelective(newSelfEvaluation);
	}

	@Override
	public void deleteSelfEvaluationReflection(Integer selfEvaluationId, Integer id,String roleType) {
		
		Date date = new Date();
		
		//校验自评
		checkSelfEvaluationChange(selfEvaluationId,roleType);
		
		DevelopSelfEvaluationReflection reflection = selfEvaluationReflectionDAO.selectByPrimaryKey(id);
		if(reflection == null) {
			throw new BizException(SelfEvaluationError.SELF_EVALUATION_REFLECTION_NOT_FOUND);
		}
		
		DevelopSelfEvaluationReflection newReflection = new DevelopSelfEvaluationReflection();
		
		newReflection.setId(reflection.getId());
		newReflection.setGmtModify(date);
		newReflection.setIsDelete(IsDeleteEnum.DELETEED.getId());
		
		DevelopSelfEvaluation newSelfEvaluation = new DevelopSelfEvaluation();
		newSelfEvaluation.setId(selfEvaluationId);
		newSelfEvaluation.setGmtModify(date);
		selfEvaluationDAO.updateByPrimaryKeySelective(newSelfEvaluation);
		
		selfEvaluationReflectionDAO.updateByPrimaryKeySelective(newReflection);
	}

	@Override
	public void saveSelfEvaluationComment(CommentDTO commentDTO,String roleType) {
		
		//校验自评
		DevelopSelfEvaluation selfEvaluation = checkSelfEvaluationChange(commentDTO.getSelfEvaluationId(),roleType);
		
		DevelopSelfEvaluation newSelfEvaluation = new DevelopSelfEvaluation();
		
		newSelfEvaluation.setId(selfEvaluation.getId());
		newSelfEvaluation.setGmtModify(new Date());
		newSelfEvaluation.setEvaluatorComment(commentDTO.getComment());
		
		selfEvaluationDAO.updateByPrimaryKeySelective(newSelfEvaluation);
	}

	@Override
	public List<SelfEvaluationDutyLevelDTO> getAllSelfEvaluation(Integer year, Integer period,Integer schoolId) {
		
		Map<String,Object> params = new HashMap<>();
		
		params.put("isDelete", IsDeleteEnum.NORMAL.getId());
		params.put("schoolId", schoolId);
		params.put("year", year);
		params.put("period", period);

		List<SelfEvaluationTeacherListDTO> selfEvaluationTeacherListDTOList = selfEvaluationDAO.getList(params);
		
		Map<Integer,SelfEvaluationDutyLevelDTO> map = new TreeMap<>();
		Map<Integer,Integer> dutyLevelMap = new HashMap<>();
		
		List<SelfEvaluationDutyLevelDTO> list = new ArrayList<>();
		
		if(!CollectionUtils.isEmpty(selfEvaluationTeacherListDTOList)) {
			for(SelfEvaluationTeacherListDTO s : selfEvaluationTeacherListDTOList) {
				
				SelfEvaluationDutyLevelDTO selfEvaluationDutyLevelDTO = map.get(s.getDutyLevelId());
				if(selfEvaluationDutyLevelDTO == null) {
					Integer num = dutyLevelMap.get(s.getDutyId());
					if(num == null) {
						num = dutyLevelMap.size() + 1;
						dutyLevelMap.put(s.getDutyId(), num);
					}
					selfEvaluationDutyLevelDTO = new SelfEvaluationDutyLevelDTO();
					selfEvaluationDutyLevelDTO.setDutyLevelId(s.getDutyLevelId());
					selfEvaluationDutyLevelDTO.setDutyLevelName(s.getDutyLevelName());
					selfEvaluationDutyLevelDTO.setCompleteCount(0);
					selfEvaluationDutyLevelDTO.setTotalCount(0);
					selfEvaluationDutyLevelDTO.setNum(num);
					selfEvaluationDutyLevelDTO.setList(new ArrayList<>());
				}
				
				if(s.getId() != null) {
					List<SelfEvaluationTeacherNameDTO> selfEvaluationTeacherNameDTOList = selfEvaluationDutyLevelDTO.getList();
					
					SelfEvaluationTeacherNameDTO teacherDTO = new SelfEvaluationTeacherNameDTO();
					teacherDTO.setId(s.getId());
					teacherDTO.setTeacherName(s.getTeacherName());
					teacherDTO.setUrl(s.getUrl());
					teacherDTO.setStatus(s.getStatus());
					selfEvaluationTeacherNameDTOList.add(teacherDTO);
					selfEvaluationDutyLevelDTO.setList(selfEvaluationTeacherNameDTOList);
					if(SelfEvaluationStatusEnum.REVIEWED.getId() == s.getStatus()) {
						selfEvaluationDutyLevelDTO.setCompleteCount(selfEvaluationDutyLevelDTO.getCompleteCount() + 1);
					}
					selfEvaluationDutyLevelDTO.setTotalCount(selfEvaluationDutyLevelDTO.getTotalCount() + 1);
				}
				map.put(s.getDutyLevelId(), selfEvaluationDutyLevelDTO);
			}
			
			for(Integer id : map.keySet()) {
				list.add(map.get(id));
			}
		}
		
		return list;
	}

	@Override
	public Integer getLastPeriod(Integer userId, Integer schoolId, String roleType) {
		Map<String,Object> params = new HashMap<>();
		
		if(RoleTypeEnum.teacher.getId().equals(roleType)) {
			params.put("userId", userId);
		}else {
			params.put("schoolId", schoolId);
		}
		params.put("isDelete", IsDeleteEnum.NORMAL.getId());
		
		Integer period = selfEvaluationDAO.getLastPeriod(params);
		if(period == null) {
			period = SelfEvaluationPeriodEnum.MID_YEAR.getId();
		}
		return period;
	}
	
	@Override
	public void overdueSelfEvaluation(List<DevelopTimeSetting> developTimeSettingList) {
		
		Date date = new Date();
		
		if(!CollectionUtils.isEmpty(developTimeSettingList)) {
			for(DevelopTimeSetting timeSetting : developTimeSettingList) {
				DevelopSelfEvaluationExample example = new DevelopSelfEvaluationExample();
				example.createCriteria()
					.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId())
					.andSchoolIdEqualTo(timeSetting.getSchoolId())
					.andYearEqualTo(timeSetting.getYear())
					.andPeriodEqualTo(timeSetting.getPeriod())
					.andStatusBetween(SelfEvaluationStatusEnum.DRAFT.getId(), SelfEvaluationStatusEnum.SUBMIT.getId());
				List<DevelopSelfEvaluation> list = selfEvaluationDAO.selectByExample(example);
				
				int status;
				
				if(!CollectionUtils.isEmpty(list)) {
					for(DevelopSelfEvaluation selfEvaluation : list) {
						
						if(selfEvaluation.getStatus().intValue() == SelfEvaluationStatusEnum.DRAFT.getId()) {
							status = SelfEvaluationStatusEnum.OVERDUE_DRAFT.getId();
						}else {
							status = SelfEvaluationStatusEnum.OVERDUE_SUBMIT.getId();
						}
						
						DevelopSelfEvaluation newSelfEvaluation = new DevelopSelfEvaluation();
						newSelfEvaluation.setId(selfEvaluation.getId());
						newSelfEvaluation.setGmtModify(date);
						newSelfEvaluation.setStatus(status);
						selfEvaluationDAO.updateByPrimaryKeySelective(newSelfEvaluation);
					}
				}
			}
		}
	}

	/**
	 * @description:根据时间设置，推送自评
	 * @param developTimeSettingList
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午9:24:18
	 */
	@Override
	public void pushSelfEvaluation(List<DevelopTimeSetting> developTimeSettingList) {

		Map<String,Object> params = new HashMap<>();
		Date date = new Date();
		
		Map<Integer, DevelopDutyLevel> dutyLevelMap = dutyLevelDAO.getDutyLevelMap();
		Map<Integer,DevelopDutyLevelSkill> dutyLevelSkillMap = new HashMap<>();
		
		//根据学校id推送自评
		if(!CollectionUtils.isEmpty(developTimeSettingList)) {
			for(DevelopTimeSetting timeSetting : developTimeSettingList) {
				
				params.put("schoolId", timeSetting.getSchoolId());
				params.put("isDelete", IsDeleteEnum.NORMAL.getId());
				
				//获取一个需要升级的学校的所有有职务的老师
				List<DevelopUserDutyLevel> userDutyLevelList = userDutyLevelDAO.getSchoolAllUser(params);
				
				DevelopSelfEvaluation selfEvaluation = new DevelopSelfEvaluation();
				//逐个推送自评
				if(!CollectionUtils.isEmpty(userDutyLevelList)) {
					for(DevelopUserDutyLevel userDutyLevel : userDutyLevelList) {
						selfEvaluation.setId(null);
						selfEvaluation.setGmtCreate(date);
						selfEvaluation.setGmtModify(date);
						selfEvaluation.setIsDelete(IsDeleteEnum.NORMAL.getId());
						selfEvaluation.setSchoolId(timeSetting.getSchoolId());
						selfEvaluation.setUserId(userDutyLevel.getUserId());
						selfEvaluation.setDutyLevelId(userDutyLevel.getDutyLevelId());
						selfEvaluation.setDutyLevelName(dutyLevelMap.get(userDutyLevel.getDutyLevelId()).getName());
						selfEvaluation.setPeriod(timeSetting.getPeriod());
						selfEvaluation.setYear(timeSetting.getYear());
						selfEvaluation.setStatus(SelfEvaluationStatusEnum.DRAFT.getId());
						
						selfEvaluationDAO.insertSelective(selfEvaluation);
						Integer newSelfEvaluationId = selfEvaluation.getId();
						
						//查询上次自评，判断是否完成
						//将去年未完成自评计划顺推过来
						DevelopSelfEvaluation lastYearSelfEvaluation = null;
						DevelopSelfEvaluationExample selfEvaluationExample = new DevelopSelfEvaluationExample();
						if(timeSetting.getPeriod().intValue() == SelfEvaluationPeriodEnum.ANNUAL.getId()) {
							//如果是年末直接查当年年中自评
							selfEvaluationExample.createCriteria()
								.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId())
								.andYearEqualTo(timeSetting.getYear())
								.andSchoolIdEqualTo(timeSetting.getSchoolId())
								.andUserIdEqualTo(userDutyLevel.getUserId())
								.andPeriodEqualTo(SelfEvaluationPeriodEnum.MID_YEAR.getId());
							List<DevelopSelfEvaluation> list = selfEvaluationDAO.selectByExample(selfEvaluationExample);
							if(!CollectionUtils.isEmpty(list)) {
								lastYearSelfEvaluation = list.get(0);
							}
						}else {
							//如果是年中，去找去年年末自评
							selfEvaluationExample.createCriteria()
								.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId())
								.andYearEqualTo(timeSetting.getYear() - 1)
								.andSchoolIdEqualTo(timeSetting.getSchoolId())
								.andUserIdEqualTo(userDutyLevel.getUserId())
								.andPeriodEqualTo(SelfEvaluationPeriodEnum.ANNUAL.getId());
							List<DevelopSelfEvaluation> list = selfEvaluationDAO.selectByExample(selfEvaluationExample);
							if(!CollectionUtils.isEmpty(list)) {
								lastYearSelfEvaluation = list.get(0);
							}
						}
						if(lastYearSelfEvaluation != null) {
							//如果找到了过去的自评
							//查询过去自评是否已经全部ok，没有ok就顺延
							DevelopSelfEvaluationPlanExample selfEvaluationPlanExample = new DevelopSelfEvaluationPlanExample();
							selfEvaluationPlanExample.createCriteria()
								.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId())
								.andSelfEvaluationIdEqualTo(lastYearSelfEvaluation.getId())
								.andStatusEqualTo(MarkStatusEnum.UNFINISH.getId());
							List<DevelopSelfEvaluationPlan> list = selfEvaluationPlanDAO.selectByExample(selfEvaluationPlanExample);
							if(!CollectionUtils.isEmpty(list)) {
								
								DevelopSelfEvaluationPlan newPlan = new DevelopSelfEvaluationPlan();
								for(DevelopSelfEvaluationPlan plan : list) {
									
									//这里很危险，请一定升级
									DevelopDutyLevelSkill dutyLevelSkill = dutyLevelSkillMap.get(plan.getDutyLevelSkillId());
									if(dutyLevelSkill == null) {
										dutyLevelSkill = dutyLevelSkillDAO.getSkillByLastYearSkillId(plan.getDutyLevelSkillId());
										if(dutyLevelSkill != null) {
											dutyLevelSkillMap.put(plan.getDutyLevelSkillId(), dutyLevelSkill);
										}
									}
									
									//这里是个问题，能力可能被删除了，所以建议如果被删除了就直接放弃掉顺延
									if(dutyLevelSkill != null) {
										newPlan.setId(null);
										newPlan.setGmtCreate(date);
										newPlan.setGmtModify(date);
										newPlan.setIsDelete(IsDeleteEnum.NORMAL.getId());
										newPlan.setSelfEvaluationId(newSelfEvaluationId);
										newPlan.setDutyLevelSkillId(dutyLevelSkill.getId());
										newPlan.setAreaOfImprovement(plan.getAreaOfImprovement());
										newPlan.setActionPlan(plan.getActionPlan());
										newPlan.setStatus(plan.getStatus());
										newPlan.setEvidence(plan.getEvidence());
										newPlan.setTargetScore(plan.getTargetScore());
										
										selfEvaluationPlanDAO.insertSelective(newPlan);
									}
								}
							}
						}
					}
				}
				//这里就是这个学校升级完成，就直接给他更新一下
				DevelopTimeSetting newTimeSetting = new DevelopTimeSetting();
				newTimeSetting.setId(timeSetting.getId());
				newTimeSetting.setGmtModify(date);
				newTimeSetting.setExecutionTime(date);
				newTimeSetting.setExecutionNum(timeSetting.getExecutionNum() == null ? 1 : timeSetting.getExecutionNum() + 1);
				timeSettingDAO.updateByPrimaryKeySelective(newTimeSetting);
			}
		}
	}

	@Override
	public void overdueTeacherSelfEvaluation(List<DevelopTimeSetting> developTimeSettingList) {
		Date date = new Date();
		
		if(!CollectionUtils.isEmpty(developTimeSettingList)) {
			for(DevelopTimeSetting timeSetting : developTimeSettingList) {
				DevelopSelfEvaluationExample example = new DevelopSelfEvaluationExample();
				example.createCriteria()
					.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId())
					.andSchoolIdEqualTo(timeSetting.getSchoolId())
					.andYearEqualTo(timeSetting.getYear())
					.andPeriodEqualTo(timeSetting.getPeriod())
					.andStatusEqualTo(SelfEvaluationStatusEnum.DRAFT.getId());
				List<DevelopSelfEvaluation> list = selfEvaluationDAO.selectByExample(example);
				
				if(!CollectionUtils.isEmpty(list)) {
					for(DevelopSelfEvaluation selfEvaluation : list) {
						DevelopSelfEvaluation newSelfEvaluation = new DevelopSelfEvaluation();
						newSelfEvaluation.setId(selfEvaluation.getId());
						newSelfEvaluation.setGmtModify(date);
						newSelfEvaluation.setStatus(SelfEvaluationStatusEnum.OVERDUE_DRAFT.getId());
						selfEvaluationDAO.updateByPrimaryKeySelective(newSelfEvaluation);
					}
				}
			}
		}
	}
}
