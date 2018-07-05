package com.taidii.staffdevelopment.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.taidii.staffdevelopment.dao.ISelfEvaluationDAO;
import com.taidii.staffdevelopment.dao.mapper.custom.DevelopSelfEvaluationMapper2;
import com.taidii.staffdevelopment.dto.development.DevelopDTO;
import com.taidii.staffdevelopment.dto.development.YearEvaluationDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationTeacherListDTO;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluation;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationExample;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;
import com.taidii.staffdevelopment.enums.SelfEvaluationStatusEnum;

@Repository("selfEvaluationDAO")
public class SelfEvaluationDAOImpl extends DAOImpl<DevelopSelfEvaluation, DevelopSelfEvaluationExample> implements ISelfEvaluationDAO{

	@Autowired
	private DevelopSelfEvaluationMapper2 developSelfEvaluationMapper2;

	@Override
	public List<Integer> getYearList(Map<String, Object> map) {
		return developSelfEvaluationMapper2.getYearList(map);
	}

	/**
	 * @param userId
	 *
	 * @description:
	 * @author:谭农春
	 * @createTime: 2018/6/19 13:48
	 */
	@Override
	public List<DevelopDTO> fetchSelfEvaluation(Integer userId) {
    StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(SelfEvaluationStatusEnum.REVIEWED.getId());
		// teacher submit & school review
		String status = stringBuilder.toString();
		List<DevelopDTO> developDTOList =developSelfEvaluationMapper2.fetchSelfEvaluation(userId,status, IsDeleteEnum.NORMAL.getId());
		// 自评列表
		List<DevelopDTO> develops = new ArrayList<DevelopDTO>();
		// 是否存在
		List<String> exists = new ArrayList<String>();
		if(!CollectionUtils.isEmpty(developDTOList)){
			for(DevelopDTO dto:developDTOList){
				// 去重
				if(!exists.contains(dto.getYear())){
					exists.add(dto.getYear());
					develops.add(dto);
				}
			}
		}
		return develops;
	}

	/**
	 * @param userId
	 *     -- 用户id
	 *
	 * @description: -- 获取用户id明细
	 * @author:谭农春
	 * @createTime: 2018/6/19 13:50
	 */
	@Override
	public List<YearEvaluationDTO> fetchSelfEvaluationYearDetails(Integer userId) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(SelfEvaluationStatusEnum.REVIEWED.getId());
		// teacher submit & school review
		String status = stringBuilder.toString();
		// 自评列表
		return developSelfEvaluationMapper2.fetchSelfEvaluationYearDetails(userId, status, IsDeleteEnum.NORMAL.getId());
	}

	@Override
	public List<SelfEvaluationTeacherListDTO> getList(Map<String, Object> params) {
		return developSelfEvaluationMapper2.getList(params);
	}

	@Override
	public Integer getLastPeriod(Map<String, Object> map) {
		return developSelfEvaluationMapper2.getLastPeriod(map);
	}
}
