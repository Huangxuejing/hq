package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

public class SelfEvaluationTeacherNameDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;					//自评id
	private String teacherName;	//老师名称
	private String url;					//老师头像
	private Integer status;				//自评状态
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
