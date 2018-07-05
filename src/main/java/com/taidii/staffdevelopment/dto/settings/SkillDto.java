package com.taidii.staffdevelopment.dto.settings;

import java.io.Serializable;

public class SkillDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String name;
    private String guidingQuestions;

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

    public String getGuidingQuestions() {
        return guidingQuestions;
    }

    public void setGuidingQuestions(String guidingQuestions) {
        this.guidingQuestions = guidingQuestions;
    }
}
