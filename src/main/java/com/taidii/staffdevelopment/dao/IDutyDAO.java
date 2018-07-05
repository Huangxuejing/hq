package com.taidii.staffdevelopment.dao;

import java.util.List;

import com.taidii.staffdevelopment.dto.settings.SkillLevelDto;
import com.taidii.staffdevelopment.dto.settings.StaffLevelTeachersDto;
import com.taidii.staffdevelopment.dto.settings.TeacherDto;
import com.taidii.staffdevelopment.entity.DevelopDuty;
import com.taidii.staffdevelopment.entity.DevelopDutyExample;

public interface IDutyDAO extends IDAO<DevelopDuty,DevelopDutyExample> {

    List<SkillLevelDto> fetchSkillLevelList();

    List<TeacherDto> fetchNotLevelTeacher(Integer schoolId);

    List<StaffLevelTeachersDto> fetchStaffLevelList(Integer schoolId);
    
    List<TeacherDto> fetchStaffLevelTeacherList(Integer schoolId,Integer levelId);

    List<Integer> fetchSkillLevelGrade();

    List<Integer> fetchYearList(Integer schoolId);
}
