package com.taidii.staffdevelopment.service.impl;

import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.dao.*;
import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.dto.development.TrainDTO;
import com.taidii.staffdevelopment.dto.training.*;import com.taidii.staffdevelopment.entity.*;
import com.taidii.staffdevelopment.enums.CourseStatusEnum;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;
import com.taidii.staffdevelopment.enums.UserCourseStatusEnum;
import com.taidii.staffdevelopment.error.TrainingError;
import com.taidii.staffdevelopment.service.ITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;import java.util.Locale;
@Service
public class TrainingServiceImpl implements ITrainingService{
    
    @Autowired
    ICourseDAO courseDAO;
    
    @Autowired
    IUserCourseDAO userCourseDAO;
    
    @Autowired
    ISelfEvaluationPlanDAO planDAO;
    
    @Autowired
    ISelfEvaluationDAO selfEvaluationDAO;
    
    @Autowired
    IDutyLevelSkillDAO skillDAO;
    
    @Autowired
    IDutyDAO dutyDAO;
    
    @Autowired
    IDutyLevelDAO dutyLevelDAO;
    
    private static String basePicUrl = "http://7xj2zq.com5.z0.glb.qiniucdn.com/";
    private static String baseAttachmentUrl = "http://owiju9mp2.bkt.clouddn.com";
    
    @Override
    public List<SubCategoryDTO> getAllSubCategory(Integer schoolId){
        List<SubCategoryDTO> skillDTOs = new LinkedList<>();
        DevelopDutyLevelSkillExample example = new DevelopDutyLevelSkillExample();
        
        Integer lastYear = courseDAO.getLastYear(schoolId);
        if(lastYear == null){
            return null;
        }
        
        example.createCriteria().andDepthEqualTo(2)
                .andSchoolIdIn(Arrays.asList(0,schoolId))
                .andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId())
                .andYearIn(Arrays.asList(0,lastYear));
        List<DevelopDutyLevelSkill> skillList = skillDAO.selectByExample(example);
        if(skillList == null || skillList.size() < 1){
            return skillDTOs;
        }
        for(DevelopDutyLevelSkill skill : skillList){
            SubCategoryDTO skillDTO = new SubCategoryDTO();
            skillDTO.setId(skill.getId());
            skillDTO.setName(skill.getName());
            skillDTO.setCode(skill.getCode());
            skillDTOs.add(skillDTO);
        }
        return skillDTOs;
    }
    
    
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void addCourse(CourseDTO course){
        //插入课程
        DevelopCourse developCourse = new DevelopCourse();
        this.copyCourse(course, developCourse);
        developCourse.setIsDelete(IsDeleteEnum.NORMAL.getId());
        Date now = new Date();
        Integer year = courseDAO.getLastYear(course.getSchoolId());
        developCourse.setYear(year);
        developCourse.setGmtCreate(now);
        developCourse.setGmtModify(now);
        courseDAO.insert(developCourse);
        //关联user
        developCourse.setCourseFee(course.getCourseFee());
        List<Integer> members = course.getMembers().stream().map(OptionDTO::getId).collect(Collectors.toList());
        this.addUserCourse(members, developCourse);
    }
    
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void deleteCourse(Integer courseId){
        //标记 相关userCourse 为删除
        DevelopUserCourseExample userCourseExample = new DevelopUserCourseExample();
        userCourseExample.createCriteria().andCourseIdEqualTo(courseId);
        DevelopUserCourse userCourse = new DevelopUserCourse();
        userCourse.setIsDelete(IsDeleteEnum.DELETEED.getId());
        userCourseDAO.updateByExampleSelective(userCourse, userCourseExample);
        //标记 course 为删除
        DevelopCourse course = new DevelopCourse();
        course.setId(courseId);
        course.setIsDelete(IsDeleteEnum.DELETEED.getId());
        courseDAO.updateByPrimaryKeySelective(course);
    }
    
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void modifyCourse(CourseDTO course) throws RuntimeException{
        DevelopCourse oldCourse = courseDAO.selectByPrimaryKey(course.getId());
        if(oldCourse == null){
            throw new BizException(TrainingError.COURSE_NOT_FIND);
        }
        
        DevelopCourse newCourse = new DevelopCourse();
        this.copyCourse(course, newCourse);
        //现在的member
        List<Integer> newMember = course.getMembers().stream().map(OptionDTO::getId).collect(Collectors.toList());
        //原来的member
        DevelopUserCourseExample userCourseExample = new DevelopUserCourseExample();
        userCourseExample.createCriteria().andCourseIdEqualTo(course.getId()).andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
        List<DevelopUserCourse> userCourses = userCourseDAO.selectByExample(userCourseExample);
        List<Integer> oldMember = userCourses.stream().map(DevelopUserCourse::getUserId).collect(Collectors.toList());
        
        //如果 course 信息修改了，就更新
        if(!oldCourse.equals(newCourse)){
            Date now = new Date();
            newCourse.setYear(oldCourse.getYear());
            newCourse.setGmtModify(now);
            newCourse.setGmtCreate(oldCourse.getGmtCreate());
            courseDAO.updateByPrimaryKey(newCourse);
        }
        //相同的成员更新
        List<Integer> sameMember = newMember.stream().filter(item -> oldMember.contains(item)).collect(Collectors.toList());
        modifyUserCourse(newCourse, sameMember);
        //缺少的成员,添加
        newCourse.setCourseFee(course.getCourseFee());
        List<Integer> lessMember = newMember.stream().filter(item -> !oldMember.contains(item)).collect(Collectors.toList());
        addUserCourse(lessMember, newCourse);
        //多余的成员,删除
        List<Integer> moreMember = oldMember.stream().filter(item -> !newMember.contains(item)).collect(Collectors.toList());
        deleteUserCourse(moreMember,newCourse.getId());
    }
    
    @Override
    public List<CourseDTO> getCourseList(Integer year, Integer schoolId, Integer status){
        List<CourseDTO> courses = courseDAO.getCourseList(schoolId, year, status);
        if(courses == null || courses.size() < 1){
            return null;
        }
        List<OptionDTO> users = getAllTeacherOfSchool(schoolId);
        Map<Integer, String> userName = optionToMap(users);
        for(CourseDTO course: courses){
            for(OptionDTO member : course.getMembers()){
                int id = member.getId();
                String name = userName.get(id);
                member.setName(name);
            }
        }
        return courses;
    }
    
    @Override
    public List<CategoryDTO> getTrainingNeedList(Integer schoolId, Integer dutyId){
        List<CategoryDTO> skillTree = courseDAO.getSkillTree(schoolId);
        if(skillTree == null || skillTree.size() < 1){
            return null;
        }
        //找到最新的review状态的自评的时间
        List<Integer> evaluationIds = courseDAO.getLastestReviewEvaluationId(schoolId, dutyId);
        if(evaluationIds == null || evaluationIds.size() < 1){
            return skillTree;
        }
        //对带有用户状态的subCategory 进行索引
        List<SubCategoryDTO> subCategoryDTOS = courseDAO.getUnFinishedSkill(schoolId, evaluationIds);
        if(subCategoryDTOS == null || subCategoryDTOS.size() < 1){
            return skillTree;
        }
        Map<String, Integer> skillCodeToIndex = new HashMap<>();
        int index = 0;
        for(SubCategoryDTO subCategory: subCategoryDTOS){
            skillCodeToIndex.put(subCategory.getCode(), index);
            index++;
        }
        //得到学校全部用户
        List<OptionDTO> teachers = getAllTeacherOfSchool(schoolId);
        List<OptionDTO> teacherPics = courseDAO.getUserPic(schoolId);
        Map<Integer, String> userName = optionToMap(teachers);
        Map<Integer, String> userPic = optionToMap(teacherPics);
        for(CategoryDTO category : skillTree){
            List<SubCategoryDTO> subCategorys = category.getSubCategorys();
            if(subCategorys == null || subCategorys.size() < 1)
                continue;
            for(SubCategoryDTO subCategory : subCategorys){
                Integer subCategoryIndex = skillCodeToIndex.get(subCategory.getCode());
                if(subCategoryIndex == null){
                    continue;
                }
                SubCategoryDTO subCategoryWithUser = subCategoryDTOS.get(subCategoryIndex);
                List<TrainingNeedUserDTO> users = subCategoryWithUser.getTeachers();
                if(users == null || users.size() < 1)
                    continue;
                for(TrainingNeedUserDTO user : users){
                    int id = user.getId();
                    user.setName(userName.get(id));
                    if(userPic.get(id) != null && !"".equals(userPic.get(id))){
                        user.setPic(basePicUrl+userPic.get(id));
                    }
                    decideUserCourseStatus(user);
                }
                subCategory.setTeachers(users);
                subCategory.getTeachers();
            }
        }
        return skillTree;
    }

    @Override
    public List<CourseConfirmDTO> getCourseConfirmDetail(Integer courseId) throws RuntimeException{
        List<CourseConfirmDTO> courseConfirms = new LinkedList<>();
        DevelopCourse course = courseDAO.selectByPrimaryKey(courseId);
        if(course == null || IsDeleteEnum.DELETEED.getId()== course.getIsDelete() || course.getStatus() == CourseStatusEnum.PLANED.getId()){
            throw new BizException(TrainingError.COURSE_NOT_FIND);
        }
        DevelopUserCourseExample userCourseExample = new DevelopUserCourseExample();
        userCourseExample.createCriteria().andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId())
                .andCourseIdEqualTo(courseId);
        List<DevelopUserCourse> userCourses = userCourseDAO.selectByExample(userCourseExample);
        if(userCourses == null || userCourses.size() < 1){
            return courseConfirms;
        }
        for(DevelopUserCourse userCourse : userCourses){
            CourseConfirmDTO courseConfirm = new CourseConfirmDTO();
            
            courseConfirm.setId(userCourse.getId());
            courseConfirm.setCourseId(courseId);
            courseConfirm.setUserId(userCourse.getUserId());
            courseConfirm.setAttendance(userCourse.getStatus());
            courseConfirm.setGrant(userCourse.getGrant());
            courseConfirm.setPayroll(userCourse.getAbsenteePayroll());
            courseConfirm.setStatus(course.getStatus());
            courseConfirm.setAttachment(userCourse.getAttachment());
            courseConfirms.add(courseConfirm);
        }
        return courseConfirms;
    }
    
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void completeCourse(List<CourseConfirmDTO> confirms){
        if(confirms == null || confirms.size() < 1){
            return;
        }
        Integer courseId = confirms.get(0).getCourseId();
        DevelopCourse course = courseDAO.selectByPrimaryKey(courseId);
        if(course == null || course.getIsDelete().equals(IsDeleteEnum.DELETEED.getId())){
            throw new BizException(TrainingError.COURSE_NOT_FIND);
        }
        double totalGrant = 0;
        double totalPayroll = 0;
        Date now = new Date();
        //更新 user course 的grant，payroll，status，training hours
        for(CourseConfirmDTO confirm : confirms){
            DevelopUserCourse userCourse = new DevelopUserCourse();
            userCourse.setId(confirm.getId());
            userCourse.setGrant(confirm.getGrant());
            userCourse.setAbsenteePayroll(confirm.getPayroll());
            if(confirm.getAttachment() != null){
                userCourse.setAttachment(confirm.getAttachment());
            }
            if(confirm.getAttendance().equals(UserCourseStatusEnum.ATTENDANCE.getId())){
                userCourse.setCompletedTrainingHour(course.getTrainingHours());
                userCourse.setStatus(UserCourseStatusEnum.ATTENDANCE.getId());
            }else{
                userCourse.setCompletedTrainingHour(0);
                userCourse.setStatus(UserCourseStatusEnum.ABSENCE.getId());
            }
            userCourse.setGmtModify(now);
            userCourseDAO.updateByPrimaryKeySelective(userCourse);
            if(confirm.getGrant() != null)
                totalGrant += confirm.getGrant();
            if(confirm.getPayroll() != null)
                totalPayroll += confirm.getPayroll();
        }
        //更新course 的总grant payroll
        course.setGmtModify(now);
        course.setStatus(CourseStatusEnum.COMPLETED.getId());
        course.setGrant(totalGrant);
        course.setAbsenteePayroll(totalPayroll);
        courseDAO.updateByPrimaryKeySelective(course);
    }
    
    @Override
    public List<UserSummaryDTO> getUserSummary(Integer schoolId, Integer year){
        List<UserSummaryDTO> result = courseDAO.getUserSummary(schoolId, year);
        if(result == null || result.size() < 1){
            return null;
        }
        List<OptionDTO> users = this.getAllTeacherOfSchool(schoolId);
        Map<Integer, String> userName = optionToMap(users);
        for(UserSummaryDTO userSummary : result){
            int id = userSummary.getId();
            userSummary.setName(userName.get(id));
        }
        return result;
    }
    
    @Override
    public List<Integer> getCourseYear(Integer schoolId){
        return courseDAO.getCourseYear(schoolId);
    }
    
    @Override
    public List<OptionDTO> getDuty(){
        List<OptionDTO> result = new ArrayList<>();
        DevelopDutyExample example = new DevelopDutyExample();
        example.createCriteria().andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
        List<DevelopDuty> duties = dutyDAO.selectByExample(example);
        if(duties == null || duties.size() < 1)
            return null;
        for(DevelopDuty duty : duties){
            OptionDTO dutyDto = new OptionDTO();
            dutyDto.setName(duty.getName());
            dutyDto.setId(duty.getId());
            result.add(dutyDto);
        }
        return result;
    }
    
    @Override
    public List<OptionDTO> getSubDuty(){
        List<OptionDTO> result = new ArrayList<>();
        DevelopDutyLevelExample example = new DevelopDutyLevelExample();
        example.createCriteria().andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
        List<DevelopDutyLevel> duties = dutyLevelDAO.selectByExample(example);
        if(duties == null || duties.size() < 1)
            return null;
        for(DevelopDutyLevel duty : duties){
            OptionDTO dutyDto = new OptionDTO();
            dutyDto.setName(duty.getName());
            dutyDto.setId(duty.getId());
            result.add(dutyDto);
        }
        return result;
    }
    
    @Override
    public List<OptionDTO> getAllTeacherOfSchool(Integer schoolId){
        return courseDAO.getAllTeacherOfSchool(schoolId);
    }
    
    @Override
    public UserCourseHistoryDTO getUserCourseHistory(Integer userId, Integer year){
        //得到个人信息
        UserCourseHistoryDTO courseHistory = courseDAO.getUserInfo(userId);
        if(courseHistory == null){
            throw new BizException(TrainingError.USER_NOT_FOUND);
        }
        if(courseHistory.getPic() != null && !"".equals(courseHistory.getPic())){
            courseHistory.setPic(basePicUrl + courseHistory.getPic());
        }
        //得到历史
        List<CourseDTO> history = courseDAO.getUserCourseHistory(userId, year);
        if(history != null && history.size() > 0){
            Date now = new Date();
            for(CourseDTO course : history){
                //status 在数据库的 status中改造，3为历史，2为进行中，1为未开始
                int status = course.getStatus();
                if(status != CourseStatusEnum.COMPLETED.getId()){
                    //对还未confirm的status进行改造，课程开始时间小于当前时间标位未开始
                    if(course.getStartTime().after(now)){
                        status = status - 1;
                    }
                }
                course.setStatus(status);
            }
        }
        courseHistory.setHistory(history);
        return courseHistory;
    }
    
    @Override
    public void updateAttachment(Integer userCourseId, String attachmentUrl)throws BizException{
        DevelopUserCourse existUserCourse = userCourseDAO.selectByPrimaryKey(userCourseId);
        if(existUserCourse == null){
            throw new BizException(TrainingError.COURSE_NOT_FIND);
        }
        DevelopUserCourse userCourse = new DevelopUserCourse();
        userCourse.setAttachment(attachmentUrl);
        userCourse.setId(userCourseId);
        userCourseDAO.updateByPrimaryKeySelective(userCourse);
    }
    
    private void copyCourse(CourseDTO course, DevelopCourse developCourse){
        developCourse.setId(course.getId());
        developCourse.setAwardingOrganization(course.getAwardingOrganization());
        developCourse.setCourseFee(course.getCourseFee());
        developCourse.setDutyLevelSkillId(course.getDutyLevelSkillId());
        developCourse.setName(course.getName());
        developCourse.setStartTime(course.getStartTime());
        developCourse.setSchoolId(course.getSchoolId());
        developCourse.setTrainingHours(course.getTrainingHours());
        developCourse.setStatus(course.getStatus());
        developCourse.setIsDelete(IsDeleteEnum.NORMAL.getId());
        if(course.getCourseFee() != null){
            developCourse.setCourseFee(course.getCourseFee() * course.getMembers().size());
        }
    }
    private Map<Integer, String> optionToMap(List<OptionDTO> data){
        Map<Integer, String> result = new HashMap<>();
        if(data != null && data.size() > 1){
            for(OptionDTO item : data){
                result.put(item.getId(), item.getName());
            }
        }
        return  result;
    }
    private void addUserCourse(List<Integer> members, DevelopCourse course){
        if(members == null || members.size()<1){
            return;
        }
        Map<Integer, Integer> userEvaluationMap = courseDAO.getLastestReview(members);
        Date now = new Date();
        for(Integer member : members){
            DevelopUserCourse developUserCourse = new DevelopUserCourse();
            developUserCourse.setGmtModify(now);
            developUserCourse.setGmtCreate(now);
            developUserCourse.setCourseFee(course.getCourseFee());
            developUserCourse.setPlanTotalTrainingHour(course.getTrainingHours());
            developUserCourse.setCourseId(course.getId());
            developUserCourse.setUserId(member);
            developUserCourse.setIsDelete(IsDeleteEnum.NORMAL.getId());
            developUserCourse.setStatus(UserCourseStatusEnum.INITIALIZATION.getId());
            developUserCourse.setSelfEvaluationId(userEvaluationMap.get(member));
            userCourseDAO.insert(developUserCourse);
        }
    }
    private void modifyUserCourse(DevelopCourse course, List<Integer> members){
        if(members == null || members.size()<1){
            return;
        }
        Map<Integer, Integer> userEvaluationMap = courseDAO.getLastestReview(members);
        DevelopUserCourse userCourse = new DevelopUserCourse();
        DevelopUserCourseExample example = new DevelopUserCourseExample();
        for(Integer member : members){
            Integer evaluationId = userEvaluationMap.get(member);
            userCourse.setSelfEvaluationId(evaluationId);
            userCourse.setCourseFee(course.getCourseFee());
            userCourse.setPlanTotalTrainingHour(course.getTrainingHours());
            example.clear();
            example.createCriteria().andCourseIdEqualTo(course.getId()).andUserIdEqualTo(member);
            
            userCourseDAO.updateByExampleSelective(userCourse, example);
        }
    }
    private void deleteUserCourse(List<Integer> members, Integer courseId){
        if(members == null || members.size() < 1){
            return;
        }
        DevelopUserCourseExample example = new DevelopUserCourseExample();
        example.createCriteria().andCourseIdEqualTo(courseId).andUserIdIn(members);
        //标记删除
        DevelopUserCourse userCourse = new DevelopUserCourse();
        userCourse.setIsDelete(IsDeleteEnum.DELETEED.getId());
        userCourseDAO.updateByExampleSelective(userCourse, example);
    }


    /**
     * @param trainDTO
     *
     * @description: 添加培训课程
     * @author:谭农春
     * @createTime: 2018/6/21 15:25
     */
    @Override
    public void addRoadMapCourse(TrainDTO trainDTO) {
         Calendar calendar = Calendar.getInstance(Locale.UK);
           // 添加课程
        DevelopCourse course = new DevelopCourse();
        course.setGmtCreate(new Date());
        course.setGmtModify(new Date());
        course.setIsDelete(IsDeleteEnum.NORMAL.getId());
        course.setName(trainDTO.getCourse());
        course.setAwardingOrganization(trainDTO.getOrganization());
        course.setStartTime(trainDTO.getCourseStartDate());
        course.setCourseFee(trainDTO.getCourseFee());
        // 获取年份
        course.setYear(calendar.get(Calendar.YEAR));
        course.setSchoolId(trainDTO.getCentreId());
        course.setTrainingHours(trainDTO.getTrainingHours());
        course.setDutyLevelSkillId(trainDTO.getSkillId());
        // 计划
        course.setStatus(CourseStatusEnum.PLANED.getId());
        //TODO
        courseDAO.insert(course);
        //=========================
        DevelopUserCourse userCourse = new DevelopUserCourse();
        userCourse.setGmtModify(new Date());
        userCourse.setGmtCreate(new Date());
        userCourse.setIsDelete(IsDeleteEnum.NORMAL.getId());
        userCourse.setUserId(trainDTO.getUserId());
        // 训练课程
        userCourse.setPlanTotalTrainingHour(trainDTO.getTrainingHours());
        userCourse.setCourseFee(trainDTO.getCourseFee());
        // 关联课程
        userCourse.setCourseId(course.getId());
        // 关联评估
        userCourse.setSelfEvaluationId(trainDTO.getSelfEvaluationId());
        userCourseDAO.insert(userCourse);
    }

    
    private void decideUserCourseStatus(TrainingNeedUserDTO user){
        if(user.getStatus() == null){
            user.setStatus(1);
        }else if(user.getStatus() < 10){
            user.setStatus(2);
        }else{
            user.setStatus(3);
        }
    }}
