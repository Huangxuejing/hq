package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.hq.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IClassDao;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentKlassscheduleMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.EnrichmentKlassscheduleMapper2;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.EnrichmentStudentklassMapper2;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;

/**
 * @class: ClassDaoImpl
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/20
 */
@Service
public class ClassDaoImpl implements IClassDao {

    @Autowired
    private EnrichmentKlassscheduleMapper enrichmentKlassscheduleMapper;

    @Autowired
    private EnrichmentStudentklassMapper2 enrichmentStudentklassMapper2;

    @Autowired
    private EnrichmentKlassscheduleMapper2 enrichmentKlassscheduleMapper2;

    @Override
    public EnrichmentKlassschedule getClassByClassId(Integer id) {
        return enrichmentKlassscheduleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<StudentDto> getStudentByClassId(Integer classId) {
        return enrichmentStudentklassMapper2.getStudentByClassId(classId);
    }

    @Override
    public List<Integer> getStartYear() {
        return enrichmentKlassscheduleMapper2.getStartYear();
    }

    @Override
    public StatusDto getStudentStatus(Integer classId, Integer studentId) {
        return enrichmentStudentklassMapper2.getStudentStatus(classId,studentId);
    }

    @Override
    public List<ClassSchedule2Dto> getClassSchedule(Integer classId) {
        return enrichmentKlassscheduleMapper2.getClassSchedule(classId);
    }

    @Override
    public List<ClassSchedule2Dto> getClassSchedule(Integer hqId, Integer classId) {
        return enrichmentKlassscheduleMapper2.getClassSchedule2(hqId,classId);
    }

    @Override
    public List<ItemListDto> getItemList(Integer hqId) {
        return enrichmentKlassscheduleMapper2.getItemList(hqId);
    }

    @Override
    public void updateItemList(EnrichmentKlassschedule enrichmentKlassschedule) {
        enrichmentKlassscheduleMapper.updateByPrimaryKeySelective(enrichmentKlassschedule);
    }

    @Override
    public List<ClassListDto> getClassListByCenter(Integer centerId, Integer year, Integer isStart, Integer repeat, String keyWord,Integer courseId) {
        Map<String,Object> map = new HashMap<>();
        map.put("centerId",centerId);
        map.put("year",year);
        map.put("isStart",isStart);
        map.put("repeat",repeat);
        map.put("keyWord",keyWord);
        map.put("courseId",courseId);
        return enrichmentKlassscheduleMapper2.getClassListByCenter(map);
    }

    @Override
    public List<ClassListDto> getClassListByHq(Integer hqId, Integer year, Integer isStart, Integer repeat, String keyWord, Integer courseId) {
        Map<String,Object> map = new HashMap<>();
        map.put("hqId",hqId);
        map.put("year",year);
        map.put("isStart",isStart);
        map.put("repeat",repeat);
        map.put("keyWord",keyWord);
        map.put("courseId",courseId);
        return enrichmentKlassscheduleMapper2.getClassListByHq(map);
    }

    @Override
    public int getStudentNumber(Integer classId) {
        return enrichmentStudentklassMapper2.getStudentNumber(classId);
    }

}
