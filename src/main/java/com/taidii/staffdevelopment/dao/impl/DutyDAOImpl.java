package com.taidii.staffdevelopment.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taidii.staffdevelopment.dao.IDutyDAO;
import com.taidii.staffdevelopment.dao.mapper.custom.DevelopRatingMapper2;
import com.taidii.staffdevelopment.dto.settings.SkillLevelDto;
import com.taidii.staffdevelopment.dto.settings.StaffLevelTeachersDto;
import com.taidii.staffdevelopment.dto.settings.TeacherDto;
import com.taidii.staffdevelopment.entity.DevelopDuty;
import com.taidii.staffdevelopment.entity.DevelopDutyExample;

@Repository("dutyDAO")
public class DutyDAOImpl extends DAOImpl<DevelopDuty,DevelopDutyExample> implements IDutyDAO {

    @Autowired
    private DevelopRatingMapper2 developRatingMapper2;

    @Override
    public List<SkillLevelDto> fetchSkillLevelList() {
        return developRatingMapper2.fetchSkillLevelList();
    }

    @Override
    public List<TeacherDto> fetchNotLevelTeacher(Integer schoolId) {
        return developRatingMapper2.fetchNotLevelTeacher(schoolId);
    }

    @Override
    public List<StaffLevelTeachersDto> fetchStaffLevelList(Integer schoolId) {
        return developRatingMapper2.fetchStaffLevelList(schoolId);
    }

    @Override
    public List<TeacherDto> fetchStaffLevelTeacherList(Integer schoolId, Integer levelId) {
        return developRatingMapper2.fetchStaffLevelTeacherList(schoolId,levelId);
    }

    @Override
    public List<Integer> fetchSkillLevelGrade() {
        return developRatingMapper2.fetchSkillLevelGrade();
    }

    @Override
    public List<Integer> fetchYearList(Integer schoolId) {
        return developRatingMapper2.fetchYearList(schoolId);
    }
}
