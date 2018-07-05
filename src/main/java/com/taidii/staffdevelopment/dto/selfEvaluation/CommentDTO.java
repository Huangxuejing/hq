package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * @description:评论
 * @projectName:staff-development
 * @className:CommentDTO.java
 * @author:wentao
 * @createTime:2018年6月22日 上午10:29:37
 * @version 1.0.1
 */
public class CommentDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	@NotNull
	private Integer selfEvaluationId;	//自评id
	@Length(max=500)
	private String comment;				//评论
	
	public Integer getSelfEvaluationId() {
		return selfEvaluationId;
	}
	public void setSelfEvaluationId(Integer selfEvaluationId) {
		this.selfEvaluationId = selfEvaluationId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
