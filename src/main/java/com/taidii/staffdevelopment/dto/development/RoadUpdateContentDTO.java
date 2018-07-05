package com.taidii.staffdevelopment.dto.development;

import java.io.Serializable;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dto.development
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/22 11:23
 */
public class RoadUpdateContentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String areaOfImprovement;
	private String actionPlan;
	private String evidence;
	private String moreReviewDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaOfImprovement() {
		return areaOfImprovement;
	}

	public void setAreaOfImprovement(String areaOfImprovement) {
		this.areaOfImprovement = areaOfImprovement;
	}

	public String getActionPlan() {
		return actionPlan;
	}

	public void setActionPlan(String actionPlan) {
		this.actionPlan = actionPlan;
	}

	public String getEvidence() {
		return evidence;
	}

	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}

	public String getMoreReviewDate() {
		return moreReviewDate;
	}

	public void setMoreReviewDate(String moreReviewDate) {
		this.moreReviewDate = moreReviewDate;
	}
}
