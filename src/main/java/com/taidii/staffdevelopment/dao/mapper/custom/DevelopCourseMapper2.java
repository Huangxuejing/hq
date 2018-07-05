package com.taidii.staffdevelopment.dao.mapper.custom;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.dto.training.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DevelopCourseMapper2 {
   
    /**
     * 获取 course list
     * @author GongYu
     * @date 2018/6/15
     * @param schoolId 学校ID
     * @param status 状态
     * @return list
     */
    List<CourseDTO> getCourseList(@Param("schoolId") Integer schoolId,
                                  @Param("status")Integer status,
                                  @Param("year") Integer year);
    
    /**
     * training need analysis
     * @author GongYu
     * @date 2018/6/19
     * @param schoolId 学校
     * @return
     */
    List<CategoryDTO> getSkillTree(@Param("schoolId") Integer schoolId);
    
    /**
     * 获取员工培训总结
     * @author gongyu
     * @date 2018/6/21
     * @param schoolId schoolId
     * @param year year
     * @return list
     */
    List<UserSummaryDTO> getUserSummary(@Param("schoolId") Integer schoolId, @Param("year") Integer year);
    
    /**
     * 找到最新的review 状态的自评年份和阶段
     * @param userIds
     * @return
     */
    List<Map<String, Integer>> getLastestReview(@Param("userIds") List<Integer> userIds);
    
    /**
     * 找到计划中未完全完成的二级技能
     * @author GongYu
     * @date 2018/6/21
     * @param schoolId 学校ID
     * @return list
     */
    List<SubCategoryDTO> getUnFinishedSkill(@Param("schoolId") Integer schoolId,
                                            @Param("evaluationIds")List<Integer> evaluationIds);
    
    /**
     * 获取 所有课程 的年份
     * @param schoolId
     * @return
     */
    List<Integer> getCourseYear(@Param("schoolId")Integer schoolId);
    
    /**
     * 获取学校全部老师
     */
    List<OptionDTO> getAllTeacherOfSchool(@Param("schoolId")Integer schoolId);
    
    /**
     * 获取教师课程主页的教师信息
     */
    UserCourseHistoryDTO getUserInfo(@Param("userId")Integer userId);
    
    /**
     * 获取教师课程主页的课程历史
     */
    List<CourseDTO> getUserCourseHistory(@Param("userId")Integer userId, @Param("year")Integer year);
    
    /**
     * 获取用户头像
     */
    List<OptionDTO> getUserPic(@Param("schoolId")Integer schoolId);
    
    /**
     * 学校每个人的最新review状态的自评,可以职业筛选
     */
    List<Integer> getLastestReviewEvaluationId(@Param("schoolId")Integer schoolId,
                                               @Param("dutyId") Integer dutyId);
    
    /**
     * 查找当前年
     */
    Integer getLastYear(@Param("schoolId")Integer schoolId);
}
