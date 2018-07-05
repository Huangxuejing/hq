package com.taidii.staffdevelopment.dto.settings;

import java.io.Serializable;
import java.util.List;

public class StaffLevelTeachersDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String dutyName;
    private Integer level;
    private List<TeacherDto> teachers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<TeacherDto> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeacherDto> teachers) {
        this.teachers = teachers;
    }
}
