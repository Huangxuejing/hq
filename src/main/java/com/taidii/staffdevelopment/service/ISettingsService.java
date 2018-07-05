package com.taidii.staffdevelopment.service;

import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.dto.settings.*;
import com.taidii.staffdevelopment.entity.DevelopRating;
import com.taidii.staffdevelopment.entity.DevelopTimeSetting;

import java.text.ParseException;
import java.util.List;

public interface ISettingsService {

     void saveDevelopRating(DevelopRating developRating,Integer term) throws BizException;
     void deleteDevelopRating(Integer id) throws BizException;
     List<DevelopRating> selectDevelopRatingList(Integer schoolId,Integer year,Integer term);

     List<SkillLevelDto> fetchSkillLevel();

     List<TeacherDto> fetchNotLevelTeacher(Integer schoolId);

     List<StaffLevelTeachersDto> fetchStaffLevelTeacherList(Integer schoolId);

     void saveStaffTeacher(Integer levelId,Integer userId);

     
     void saveDomain(List<DomainDto> domains,Integer type,Integer levelId,Integer year,Integer schoolId,Integer term) throws BizException;

    
     void saveCategorys(DomainDto domainDto,Integer type,Integer levelId,Integer year,Integer schoolId,Integer term) throws BizException;

    
     void saveSkillGuidings(List<DomainDto> domains,Integer type,Integer levelId,Integer year,Integer schoolId,Integer term) throws BizException;

    
     List<DomainDto> fetchFrameworkSkillList(Integer type,Integer levelId,Integer year,Integer schoolId,Integer term);
     
     /**
      * @description:升级分数
      * @param list
      * @author: 衷文涛
      * @createTime:2018年6月27日 上午9:29:23
      */
     public void upgradeScore(List<DevelopTimeSetting> list);
     
     /**
      * @description:升级职务能力 和guilding
      * @param list
      * @author: 衷文涛
      * @createTime:2018年6月27日 上午9:30:31
      */
     public void upgradeDutyLevelSkill(List<DevelopTimeSetting> list);

     void saveTimeSetting(List<SessionTimeDto> timeDtos,Integer year,Integer schoolId) throws ParseException,BizException;

     TimeSettingDto fetchSettingTime(Integer year,Integer schoolId);

     List<Integer> fetchSkillLevelGrade();

     List<Integer> fetchYearList(Integer schoolId);
}
