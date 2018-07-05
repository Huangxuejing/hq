package com.taidii.staffdevelopment.dao.impl;

import com.taidii.staffdevelopment.dao.ICourseDAO;
import com.taidii.staffdevelopment.dao.mapper.custom.DevelopCourseMapper2;
import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.dto.training.*;
import com.taidii.staffdevelopment.entity.DevelopCourse;
import com.taidii.staffdevelopment.entity.DevelopCourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseDAO extends DAOImpl<DevelopCourse, DevelopCourseExample> implements ICourseDAO{
    
    @Autowired
    DevelopCourseMapper2 mapper2;
    
    @Override
    public List<CourseDTO> getCourseList(Integer schoolId,Integer year, Integer status){
        return mapper2.getCourseList(schoolId, status, year);
    }
    
    @Override
    public List<UserSummaryDTO> getUserSummary(Integer schoolId, Integer year){
        return mapper2.getUserSummary(schoolId, year);
    }
    
    @Override
    public List<CategoryDTO> getSkillTree(Integer schoolId){
        return mapper2.getSkillTree(schoolId);
    }
    
    @Override
    public Map<Integer, Integer> getLastestReview(List<Integer> userIds){
        Map<Integer, Integer> userEvaluationMap = new HashMap<>();
        if(userIds == null || userIds.size() < 1){
            return userEvaluationMap;
        }
        List<Map<String,Integer>> userLastReview = mapper2.getLastestReview(userIds);
        if(userLastReview == null || userLastReview.size() < 1){
            return userEvaluationMap;
        }
        for(Map<String, Integer> item : userLastReview){
            Integer userId = item.get("user_id");
            Integer evaluationId = item.get("id");
            userEvaluationMap.put(userId, evaluationId);
        }
        return userEvaluationMap;
    }
    
    @Override
    public List<SubCategoryDTO> getUnFinishedSkill(Integer schoolId, List<Integer> evaluationIds){
        return mapper2.getUnFinishedSkill(schoolId, evaluationIds);
    }
    
    @Override
    public List<Integer> getCourseYear(Integer schoolId){
        return mapper2.getCourseYear(schoolId);
    }
    
    @Override
    public List<OptionDTO> getAllTeacherOfSchool(Integer schoolId){
        return mapper2.getAllTeacherOfSchool(schoolId);
    }
    
    @Override
    public UserCourseHistoryDTO getUserInfo(Integer userId){
        return mapper2.getUserInfo(userId);
    }
    
    @Override
    public List<CourseDTO> getUserCourseHistory(Integer userId, Integer year){
        return mapper2.getUserCourseHistory(userId, year);
    }
    @Override
    public List<OptionDTO> getUserPic(Integer schoolId){
        return mapper2.getUserPic(schoolId);
    }
    
    @Override
    public List<Integer> getLastestReviewEvaluationId(Integer schoolId, Integer dutyId){
        return mapper2.getLastestReviewEvaluationId(schoolId, dutyId);
    }
    @Override
    public Integer getLastYear(Integer schoolId){
        return mapper2.getLastYear(schoolId);
    }
}
