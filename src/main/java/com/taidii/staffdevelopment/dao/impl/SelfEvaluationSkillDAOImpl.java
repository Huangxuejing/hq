package com.taidii.staffdevelopment.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taidii.staffdevelopment.dao.ISelfEvaluationSkillDAO;
import com.taidii.staffdevelopment.dao.mapper.custom.DevelopSelfEvaluationSkillMapper2;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationSkillDTO;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationSkill;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationSkillExample;

@Repository("selfEvaluationSkillDAO")
public class SelfEvaluationSkillDAOImpl extends DAOImpl<DevelopSelfEvaluationSkill, DevelopSelfEvaluationSkillExample> implements ISelfEvaluationSkillDAO{

	@Autowired
	private DevelopSelfEvaluationSkillMapper2 developSelfEvaluationSkillMapper2;
	
	@Override
	public List<SelfEvaluationSkillDTO> getSelfEvaluationSkillTree(Map<String, Object> params) {
		return developSelfEvaluationSkillMapper2.getSelfEvaluationSkillTree(params);
	}

}
