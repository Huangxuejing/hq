package com.taidii.staffdevelopment.hq.service;

import java.util.List;

import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.hq.dto.ClassListDto;
import com.taidii.staffdevelopment.hq.dto.ClassScheduleDto;
import com.taidii.staffdevelopment.hq.dto.ItemListDto;
import com.taidii.staffdevelopment.hq.dto.StudentDto;

/**
 * @class: IClassService
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/19
 */
public interface IClassService {
    /**
     * 查询班级列表
     * @param type 0-center 1-all
     * @param year 年份
     * @param isStart 是否开课
     * @param repeat 星期
     * @param courseId 课程
     * @param keyWord 关键词
     * @return
     */
    List<ClassListDto> getClassList(LoginUser loginUser,Integer type,Integer year,Integer isStart,Integer repeat,String keyWord,Integer courseId,Integer centreId);

    /**
     * 获取班级下的学生
     * @param classId
     * @return
     */
    List<StudentDto> getStudentByClassId(Integer classId);

    /**
     * 查看班级信息
     * @param classId
     * @return
     */
    List<ClassScheduleDto> getClassSchedule(LoginUser loginUser,Integer classId,int type);

    /**
     * 查询收费项目
     * @param loginUser
     * @return
     */
    List<ItemListDto> getItemList(LoginUser loginUser);

    /**
     * 修改价格(班级的收费项目)
     * @param id
     * @param amount
     */
    void updateItemList(Integer id,Long amount);

    /**
     * 获取班级起始年份
     * @return
     */
    List<Integer> getStartYear();

}
