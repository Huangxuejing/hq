package com.taidii.staffdevelopment.hq.dao;

import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.hq.dto.*;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;

/**
 * @class: IClassDao
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/20
 */
public interface IClassDao {
    /**
     * 主键查找班级
     * @param id
     * @return
     */
    EnrichmentKlassschedule getClassByClassId(Integer id);

    /**
     * 班级下的学生
     * @param classId
     * @return
     */
    List<StudentDto> getStudentByClassId(Integer classId);

    /**
     * 获取年份
     * @return
     */
    List<Integer> getStartYear();

    StatusDto getStudentStatus(Integer classId, Integer studentId);

    /**
     * 班级排课信息(centre)
     * @param classId
     * @return
     */
    List<ClassSchedule2Dto> getClassSchedule(Integer classId);

    /**
     * 班级排课信息(hq)
     * @param hqId
     * @param classId
     * @return
     */
    List<ClassSchedule2Dto> getClassSchedule(Integer hqId, Integer classId);

    /**
     * 查询收费项目
     * @param hqId
     * @return
     */
    List<ItemListDto> getItemList(Integer hqId);

    /**
     * 修改价格(班级的收费项目)
     * @param enrichmentKlassschedule
     */
    void updateItemList(EnrichmentKlassschedule enrichmentKlassschedule);

    /**
     * 查询班级(centre)
     * @param centerId
     * @param year
     * @param isStart
     * @param repeat
     * @param courseId
     * @param keyWord
     * @return
     */
    List<ClassListDto> getClassListByCenter(Integer centerId, Integer year, Integer isStart, Integer repeat, String keyWord,Integer courseId);

    /**
     * 查询班级(all)
     * @param hqId
     * @param year
     * @param isStart
     * @param repeat
     * @param keyWord
     * @return
     */
    List<ClassListDto> getClassListByHq(Integer hqId, Integer year, Integer isStart, Integer repeat, String keyWord,Integer courseId);

    /**
     * 班级学生数
     * @param classId
     * @return
     */
    int getStudentNumber(Integer classId);

}
