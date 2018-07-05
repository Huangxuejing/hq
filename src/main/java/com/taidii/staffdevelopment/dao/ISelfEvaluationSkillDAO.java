package com.taidii.staffdevelopment.dao;

import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationSkillDTO;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationSkill;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationSkillExample;

public interface ISelfEvaluationSkillDAO extends IDAO<DevelopSelfEvaluationSkill, DevelopSelfEvaluationSkillExample>{

	/**
	 * @description:获取老师自评能力树
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午2:48:41
	 */
	public List<SelfEvaluationSkillDTO> getSelfEvaluationSkillTree(Map<String,Object> params);
	
}
