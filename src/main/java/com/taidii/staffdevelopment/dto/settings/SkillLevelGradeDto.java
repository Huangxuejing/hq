package com.taidii.staffdevelopment.dto.settings;

import java.io.Serializable;
import java.util.List;

public class SkillLevelGradeDto implements Serializable {

    private List<Integer> grades;

    private List<SkillLevelDto> skillLevels;

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public List<SkillLevelDto> getSkillLevels() {
        return skillLevels;
    }

    public void setSkillLevels(List<SkillLevelDto> skillLevels) {
        this.skillLevels = skillLevels;
    }
}
