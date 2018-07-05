package com.taidii.staffdevelopment.entity;

/**
 * @description:职务表
 * @projectName:staff-development
 * @className:DevelopDuty.java
 * @author:wentao
 * @createTime:2018年6月12日 下午4:13:41
 * @version 1.0.1
 */
public class DevelopDuty extends BaseEntity{
	private static final long serialVersionUID = -4511603498893379908L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}