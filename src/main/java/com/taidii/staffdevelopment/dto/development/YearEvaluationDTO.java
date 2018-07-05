package com.taidii.staffdevelopment.dto.development;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.taidii.staffdevelopment.util.DateUtils;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dto.development
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/13 15:35
 */
public class YearEvaluationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 年份
	 */
	private String year;
	/**
	 * 时期（1：年中，2：年末）
	 */
	private Integer period;
	/**
	 * 完成数
	 */
	private Integer finishNum;

	private Integer total;
	/**
	 * 分数
	 */
	private Float score;

	/**
	 * 状态 完成-1 未完成-0
	 */
	private Integer status;
	/**
	 * 评估id
	 */
	private Integer evaluationId;
	/**
	 * 最后修改时间
	 */
	private Date lastModify;
	/**
	 * mm/dd/yyyy
	 */
	private String lastModifyDesc;
	/**
	 * 描述
	 */
	private String desc;

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Integer getFinishNum() {
		return finishNum;
	}

	public void setFinishNum(Integer finishNum) {
		this.finishNum = finishNum;
	}

	public Float getScore() {
		return  score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(Integer evaluationId) {
		this.evaluationId = evaluationId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Date getLastModify() {
		return lastModify;
	}

	public void setLastModify(Date lastModify) {
		this.lastModify = lastModify;
		this.lastModifyDesc = DateUtils.mmddyyy(lastModify);

	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getLastModifyDesc() {
		return lastModifyDesc;
	}

	public void setLastModifyDesc(String lastModifyDesc) {
		this.lastModifyDesc = lastModifyDesc;
	}
}
