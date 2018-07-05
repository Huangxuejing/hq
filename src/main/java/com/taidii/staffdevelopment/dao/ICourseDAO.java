package com.taidii.staffdevelopment.dao;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.dto.training.*;
import com.taidii.staffdevelopment.entity.DevelopCourse;
import com.taidii.staffdevelopment.entity.DevelopCourseExample;

import java.util.List;
import java.util.Map;

public interface ICourseDAO extends IDAO<DevelopCourse, DevelopCourseExample>{
    
    /**
     * 获取 course list
     * @author GongYu
     * @date 2018/6/15
     * @param schoolId 学校ID
     * @param year 年
     * @param status 状态
     * @return list
     */
    List<CourseDTO> getCourseList(Integer schoolId,Integer year, Integer status);
    
    /**
     * 获取员工培训总结
     * @author gongyu
     * @date 2018/6/21
     * @param schoolId schoolId
     * @param year year
     * @return list
     */
    List<UserSummaryDTO> getUserSummary(Integer schoolId, Integer year);
    
    /**
     * 获取二级技能树
     * @author GongYu
     * @date 2018/6/21
     * @param schoolId 学校ID
     * @return list
     */
    List<CategoryDTO> getSkillTree(Integer schoolId);
    
    /**
     * 找到最新的review 状态的自评年份和阶段，返回的数字为可以分解为year 和 period
     * @param userIds
     * @return [year,period]
     */
    Map<Integer, Integer> getLastestReview(List<Integer> userIds);
    
    /**
     * 找到计划中未完全完成的二级技能及用户
     * @author GongYu
     * @date 2018/6/21
     * @param schoolId 学校ID
     * @return list
     */
    List<SubCategoryDTO> getUnFinishedSkill(Integer schoolId, List<Integer> evaluationIds);
    
    /**
     * 获取 所有课程 的年份
     * @param schoolId
     * @return
     */
    List<Integer> getCourseYear(Integer schoolId);
    
    /**
     * 获取学校全部老师
     */
    List<OptionDTO> getAllTeacherOfSchool(Integer schoolId);
    
    /**
     * 获取教师课程主页的教师信息
     */
    UserCourseHistoryDTO getUserInfo(Integer userId);
    
    /**
     * 获取教师课程主页的课程历史
     */
    List<CourseDTO> getUserCourseHistory(Integer userId, Integer year);
    
    /**
     * 获取用户头像
     */
    List<OptionDTO> getUserPic(Integer schoolId);
    
    /**
     * 获取学校每个职工的最新的review状态的自评
     * @param schoolId
     * @return
     */
    List<Integer> getLastestReviewEvaluationId(Integer schoolId, Integer dutyId);
    
    /**
     * 获取最新的年
     */
    Integer getLastYear(Integer schoolId);
}
