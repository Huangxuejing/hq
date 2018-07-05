package com.taidii.staffdevelopment.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taidii.staffdevelopment.dao.ISelfEvaluationPlanDAO;
import com.taidii.staffdevelopment.dao.mapper.custom.DevelopSelfEvaluationPlanMapper2;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPlanDetailDTO;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationPlan;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationPlanExample;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;
import com.taidii.staffdevelopment.enums.MarkStatusEnum;

@Repository("selfEvaluationPlanDAO")
public class SelfEvaluationPlanDAOImpl extends DAOImpl<DevelopSelfEvaluationPlan, DevelopSelfEvaluationPlanExample> implements ISelfEvaluationPlanDAO{

	@Autowired
	private DevelopSelfEvaluationPlanMapper2 developSelfEvaluationPlanMapper2;
	@Override
	public List<SelfEvaluationPlanDetailDTO> getSelfEvaluationPlanDetail(Integer selfEvaluationId,Integer isDelete) {
		return developSelfEvaluationPlanMapper2.getPlanDetail(selfEvaluationId,isDelete);
	}
	
	@Override
	public boolean checkUserHaveCompletePlan(Integer userId, Integer dutyLevelSkillId) {
		
		Map<String,Object> params = new HashMap<>();
		params.put("isDelete", IsDeleteEnum.NORMAL.getId());
		params.put("status", MarkStatusEnum.FINISH.getId());
		params.put("userId", userId);
		params.put("dutyLevelSkillId", dutyLevelSkillId);
		
		Long count = developSelfEvaluationPlanMapper2.getCompletePlanByMap(params);
		if(count != null && count != 0) {
			return true;
		}
		return false;
	}

}
