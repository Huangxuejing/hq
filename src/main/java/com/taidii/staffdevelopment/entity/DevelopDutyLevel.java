package com.taidii.staffdevelopment.entity;

/**
 * @description:职务等级表
 * @projectName:staff-development
 * @className:DevelopDutyLevel.java
 * @author:wentao
 * @createTime:2018年6月12日 下午4:14:32
 * @version 1.0.1
 */
public class DevelopDutyLevel extends BaseEntity{

	private static final long serialVersionUID = -4811109170598138955L;
	private Integer dutyId;
    private Integer levels;
    private String name;

    public Integer getDutyId() {
        return dutyId;
    }

    public void setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

	public Integer getLevels() {
		return levels;
	}

	public void setLevels(Integer levels) {
		this.levels = levels;
	}
}