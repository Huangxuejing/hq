package com.taidii.staffdevelopment.dto.settings;


import java.io.Serializable;

public class SkillLevelDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
    private String name;
    private Integer dutyLevelId;
    private String dutyLevelName;

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

    public Integer getDutyLevelId() {
        return dutyLevelId;
    }

    public void setDutyLevelId(Integer dutyLevelId) {
        this.dutyLevelId = dutyLevelId;
    }

    public String getDutyLevelName() {
        return dutyLevelName;
    }

    public void setDutyLevelName(String dutyLevelName) {
        this.dutyLevelName = dutyLevelName;
    }
}
