package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;
import java.util.List;

/**
 * @description:自评列表对象
 * @projectName:staff-development
 * @className:SelfEvaluationPoorListDTO.java
 * @author:wentao
 * @createTime:2018年6月13日 上午8:38:32
 * @version 1.0.1
 */
public class SelfEvaluationPoorListDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userName;								//用户名称
	private String dutyLevelName;					//当前职务等级
	private List<SelfEvaluationPoorDTO> list;	//自评列表
	
	public String getDutyLevelName() {
		return dutyLevelName;
	}
	public void setDutyLevelName(String dutyLevelName) {
		this.dutyLevelName = dutyLevelName;
	}
	public List<SelfEvaluationPoorDTO> getList() {
		return list;
	}
	public void setList(List<SelfEvaluationPoorDTO> list) {
		this.list = list;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
