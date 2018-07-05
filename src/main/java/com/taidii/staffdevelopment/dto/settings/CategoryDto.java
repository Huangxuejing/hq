package com.taidii.staffdevelopment.dto.settings;

import java.io.Serializable;
import java.util.List;

public class CategoryDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
    private String name;
    private List<SkillDto> skills;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SkillDto> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillDto> skills) {
        this.skills = skills;
    }
}
