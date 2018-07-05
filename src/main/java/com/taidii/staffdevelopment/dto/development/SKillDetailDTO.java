package com.taidii.staffdevelopment.dto.development;

import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationPlan;
import com.taidii.staffdevelopment.enums.EditableEnum;
import com.taidii.staffdevelopment.util.DateUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dto.development
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/20 16:08
 */
public class SKillDetailDTO extends DevelopSelfEvaluationPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Skill Name
	 */
	private String skillName;

	/**
	 * 父级id
	 */
	private Integer parentId;
	/**
	 * 深度
	 */
	private Integer depth;
	/**
	 * 标记完成时间
	 */
	private String markCompleteDateDesc;
	private String moreReviewDatetemp;

  /**
	 *  是否可以编辑
	 */
	private Integer editable = EditableEnum.NO.getId();


	/**
	 * 训练日期
	 */
	private List<SkillTrainDTO> traingDate = new ArrayList<>();

	private List<SKillDetailDTO> childs = new ArrayList<>();

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public List<SKillDetailDTO> getChilds() {
		return childs;
	}

	public void setChilds(List<SKillDetailDTO> childs) {
		this.childs = childs;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public List<SkillTrainDTO> getTraingDate() {
		return traingDate;
	}

	public void setTraingDate(List<SkillTrainDTO> traingDate) {
		this.traingDate = traingDate;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public String getMarkCompleteDateDesc() {
		return DateUtils.mmddyyy(this.getMarkCompleteDate());
	}

	public void setMarkCompleteDateDesc(String markCompleteDateDesc) {
		this.markCompleteDateDesc = markCompleteDateDesc;
	}

	public String getMoreReviewDatetemp() {
		return moreReviewDatetemp;
	}

	public void setMoreReviewDatetemp(String moreReviewDatetemp) {
		this.moreReviewDatetemp = moreReviewDatetemp;
	}

	public Integer getEditable() {
		return editable;
	}

	public void setEditable(Integer editable) {
		this.editable = editable;
	}
}
