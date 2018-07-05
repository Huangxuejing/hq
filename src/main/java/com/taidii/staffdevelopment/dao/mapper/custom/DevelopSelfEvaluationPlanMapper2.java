package com.taidii.staffdevelopment.dao.mapper.custom;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPlanDetailDTO;

@Mapper
public interface DevelopSelfEvaluationPlanMapper2 {
    
	/**
	 * @description:通过自评id获取自评计划列表
	 * @param selfEvaluationPlanId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午4:00:30
	 */
	public List<SelfEvaluationPlanDetailDTO> getPlanDetail(@Param("selfEvaluationId")Integer selfEvaluationId,@Param("isDelete")Integer isDelete);
	
	/**
	 * @description:通过用户id和职务id获取已完成计划总数
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月21日 上午11:44:39
	 */
	public Long getCompletePlanByMap(Map<String,Object> params);
}