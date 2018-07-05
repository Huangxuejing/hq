package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;
import java.util.List;

public class SelfEvaluationDutyLevelDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer num;
	private Integer dutyLevelId;
	private String dutyLevelName;
	private Integer completeCount;
	private Integer totalCount;
	private List<SelfEvaluationTeacherNameDTO> list;
	
	public Integer getDutyLevelId() {
		return dutyLevelId;
	}
	public void setDutyLevelId(Integer dutyLevelId) {
		this.dutyLevelId = dutyLevelId;
	}
	public Integer getCompleteCount() {
		return completeCount;
	}
	public void setCompleteCount(Integer completeCount) {
		this.completeCount = completeCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public List<SelfEvaluationTeacherNameDTO> getList() {
		return list;
	}
	public void setList(List<SelfEvaluationTeacherNameDTO> list) {
		this.list = list;
	}
	public String getDutyLevelName() {
		return dutyLevelName;
	}
	public void setDutyLevelName(String dutyLevelName) {
		this.dutyLevelName = dutyLevelName;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
}
