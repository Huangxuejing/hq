package com.taidii.staffdevelopment.dao;

import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.dto.RatingDTO;
import com.taidii.staffdevelopment.entity.DevelopRating;
import com.taidii.staffdevelopment.entity.DevelopRatingExample;

public interface IRatingDAO extends IDAO<DevelopRating, DevelopRatingExample>{

	/**
	 * @description:获取评分列表
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午5:26:43
	 */
	public List<RatingDTO> queryBy(Map<String,Object> params);
	
}
