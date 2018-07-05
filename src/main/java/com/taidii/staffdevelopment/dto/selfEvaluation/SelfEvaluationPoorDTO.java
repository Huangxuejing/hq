package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

/**
 * @description:自评列表dto
 * @projectName:staff-development
 * @className:SelfEvaluationPoorDTO.java
 * @author:wentao
 * @createTime:2018年6月13日 上午11:16:21
 * @version 1.0.1
 */
public class SelfEvaluationPoorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;			//自评id
	private Integer year;		//自评所属年份
	private String period;		//自评时期（）
	private String lastUpdate;//最后更新时间
	private Integer status;		//状态
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
