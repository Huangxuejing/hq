package com.taidii.staffdevelopment.entity;

/**
 * @description:用户职位表
 * @projectName:staff-development
 * @className:DevelopUserDutyLevel.java
 * @author:wentao
 * @createTime:2018年6月12日 下午4:23:43
 * @version 1.0.1
 */
public class DevelopUserDutyLevel extends BaseEntity{

	private static final long serialVersionUID = 1L;
	private Integer userId;
    private Integer dutyLevelId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDutyLevelId() {
        return dutyLevelId;
    }

    public void setDutyLevelId(Integer dutyLevelId) {
        this.dutyLevelId = dutyLevelId;
    }
}