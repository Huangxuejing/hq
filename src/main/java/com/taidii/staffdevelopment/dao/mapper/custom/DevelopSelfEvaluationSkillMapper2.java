package com.taidii.staffdevelopment.dao.mapper.custom;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationSkillDTO;

@Mapper
public interface DevelopSelfEvaluationSkillMapper2 {
    
	/**
	 * @description:获取自评能力树
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午2:52:55
	 */
	public List<SelfEvaluationSkillDTO> getSelfEvaluationSkillTree(Map<String,Object> params);
}