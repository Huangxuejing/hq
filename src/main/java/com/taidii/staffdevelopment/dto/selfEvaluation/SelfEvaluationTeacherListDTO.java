package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

/**
 * @description:校长查看自评的DTO
 * @projectName:staff-development
 * @className:SelfEvaluationTeacherListDTO.java
 * @author:wentao
 * @createTime:2018年6月22日 下午2:12:56
 * @version 1.0.1
 */
public class SelfEvaluationTeacherListDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;							//	自评id
	private Integer dutyLevelId;				//职务id
	private String dutyLevelName;		//职务名称
	private Integer status;						//自评状态
	private String teacherName;			//自评名称
	private String url;							//自评url
	private Integer dutyId;						//职务id
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Integer getDutyId() {
		return dutyId;
	}
	public void setDutyId(Integer dutyId) {
		this.dutyId = dutyId;
	}
}
