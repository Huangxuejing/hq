package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;
import java.util.List;

/**
 * @description:自评详情
 * @projectName:staff-development
 * @className:SelfEvaluationDetailDTO.java
 * @author:wentao
 * @createTime:2018年6月13日 上午11:44:46
 * @version 1.0.1
 */
public class SelfEvaluationDetailDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;								//自评id
	private String createTime;					//自评创建时间
	private String lastUpdate;					//自评最后修改时间
	private String userName;						//用户名称
	private String dutyLevelName;			//用户当时职务
	private Integer year;							//自评所属年
	private String period;							//自评所属时段
	private String status;							//自评状态
	private String evaluatorComment;		//自评 审核人评论
	
	private List<SelfEvaluationSkillDTO> skillList;							//基础能力
	
	private List<SelfEvaluationEventDTO> reflection;							//相关成就或特长
	
	private List<SelfEvaluationPlanDTO>  planList;				//未来计划

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDutyLevelName() {
		return dutyLevelName;
	}
	public void setDutyLevelName(String dutyLevelName) {
		this.dutyLevelName = dutyLevelName;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEvaluatorComment() {
		return evaluatorComment;
	}
	public void setEvaluatorComment(String evaluatorComment) {
		this.evaluatorComment = evaluatorComment;
	}
	public List<SelfEvaluationEventDTO> getReflection() {
		return reflection;
	}
	public void setReflection(List<SelfEvaluationEventDTO> reflection) {
		this.reflection = reflection;
	}

	public List<SelfEvaluationPlanDTO> getPlanList() {
		return planList;
	}

	public void setPlanList(List<SelfEvaluationPlanDTO> planList) {
		this.planList = planList;
	}
	public List<SelfEvaluationSkillDTO> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<SelfEvaluationSkillDTO> skillList) {
		this.skillList = skillList;
	}
}
