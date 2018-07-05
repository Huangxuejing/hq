package com.taidii.staffdevelopment.error;

/**
 * @description:
 * @projectName:staff-development
 * @className:DutyLevelError.java
 * @author:wentao
 * @createTime:2018年6月14日 上午11:09:05
 * @version 1.0.1
 */
public enum DutyError implements ICommonError{

	DUTY_NOT_CONTAIN_SKILL(12001, "The duty does not contain this skill"),
	;
	
	final private int id;
    final private String msg;

    DutyError(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getMsg() {
		return msg;
	}
}
