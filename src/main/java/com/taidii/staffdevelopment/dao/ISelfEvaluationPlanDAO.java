package com.taidii.staffdevelopment.dao;

import java.util.List;

import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPlanDetailDTO;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationPlan;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationPlanExample;

public interface ISelfEvaluationPlanDAO extends IDAO<DevelopSelfEvaluationPlan, DevelopSelfEvaluationPlanExample>{

	/**
	 * @description:通过用户自评id获取用户自评详情
	 * @param selfEvaluationId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午4:06:25
	 */
	public List<SelfEvaluationPlanDetailDTO> getSelfEvaluationPlanDetail(Integer selfEvaluationId,Integer isDelete);
	
	/**
	 * @description:判断是否在往年培训过
	 * @param userId
	 * @param dutyLevelSkillId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月21日 上午11:42:21
	 */
	public boolean checkUserHaveCompletePlan(Integer userId,Integer dutyLevelSkillId);
}
