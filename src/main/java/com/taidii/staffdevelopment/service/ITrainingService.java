package com.taidii.staffdevelopment.service;

import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.dto.development.TrainDTO;
import com.taidii.staffdevelopment.dto.training.*;

public interface ITrainingService {
    
    /**
     * 获取学校的全部二级技能
     * @author GongYu
     * @date 2018/6/20
     * @param schoolId 学校ID
     * @return list
     */
    List<SubCategoryDTO> getAllSubCategory(Integer schoolId);
    
    /**
     * 新增课程
     * @author GongYu
     * @date 2018/6/19
     * @param course course
     */
    void addCourse(CourseDTO course);
    
    /**
     * 删除课程
     * @param courseId 课程ID
     */
    void deleteCourse(Integer courseId);
    
    /**
     * 编辑课程
     * @author GongYu
     * @date 2018/6/20
     * @param course course
     */
    void modifyCourse(CourseDTO course);
    /**
     * 获取课程列表
     * @param year 年
     * @param schoolId 学校Id
     * @param status 计划课程或已确认课程
     * @return
     */
    List<CourseDTO> getCourseList(Integer year, Integer schoolId, Integer status);
    
    /**
     * 获取 training need 列表
     * @param schoolId 学校ID
     * @param dutyId 职业ID
     * @return
     */
    List<CategoryDTO> getTrainingNeedList(Integer schoolId, Integer dutyId);
    
    /**
     * 课程完成前确认信息
     * @param courseId
     * @return
     */
    List<CourseConfirmDTO> getCourseConfirmDetail(Integer courseId);
    
    /**
     * 对 course 的最终确认，结束课程
     * @author GongYu
     * @param confirms 人员
     */
    void completeCourse(List<CourseConfirmDTO> confirms);
    
    /**
     * 获取员工的某年培训总结
     * @param schoolId 学校ID
     * @param year 年
     * @return
     */
    List<UserSummaryDTO> getUserSummary(Integer schoolId, Integer year);
/**
 * @description:  
 *     添加培训课程
 * @author:谭农春
 * @createTime: 2018/6/21 15:25 
 */

    public void addRoadMapCourse(TrainDTO trainDTO);

    
    /**
     * 获取 所有课程 的年份
     * @param schoolId
     * @return
     */
    List<Integer> getCourseYear(Integer schoolId);
    
    /**
     * 获取职业
     * @return
     */
    List<OptionDTO> getDuty();
    
    /**
     * 获取职业
     * @return
     */
    List<OptionDTO> getSubDuty();
    
    /**
     * 获取学校全部老师
     */
    List<OptionDTO> getAllTeacherOfSchool(Integer schoolId);
    
    /**
     * 教师个人历史课程详情
     */
    UserCourseHistoryDTO getUserCourseHistory(Integer userId, Integer year);
    
    /**
     * 更新附件
     * @author GongYu
     * @param userCourseId 用户课程ID
     * @param attachmentUrl 上传七牛云后的链接地址
     */
    void updateAttachment(Integer userCourseId, String attachmentUrl);
}
