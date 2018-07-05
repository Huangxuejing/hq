package com.taidii.staffdevelopment.dto.development;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dto.development
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/13 14:58
 */
public class DevelopDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String year;
	private String dutyName;
	// 年度评估表
	private List<YearEvaluationDTO> yearEvaluations = new ArrayList<YearEvaluationDTO>();

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDutyName() {
		return dutyName;
	}

	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}

	public List<YearEvaluationDTO> getYearEvaluations() {
		return yearEvaluations;
	}

	public void setYearEvaluations(List<YearEvaluationDTO> yearEvaluations) {
		this.yearEvaluations = yearEvaluations;
	}
}
