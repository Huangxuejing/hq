package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dto.selfEvaluation
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/22 16:24
 */
public class ExportPDFDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String title = "Mid-Year Appraisal";
	private String teacherName = "Name：xxx";
	private String level = "Job Level: Educarer 2";
	// 最后评估时间
	private String lastAppraisal = "Period of Appraial: Jan 2017-Dec 2017";

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLastAppraisal() {
		return lastAppraisal;
	}

	public void setLastAppraisal(String lastAppraisal) {
		this.lastAppraisal = lastAppraisal;
	}
}
