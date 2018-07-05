package com.taidii.staffdevelopment.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taidii.staffdevelopment.dao.IRatingDAO;
import com.taidii.staffdevelopment.dao.mapper.custom.DevelopRatingMapper2;
import com.taidii.staffdevelopment.dto.RatingDTO;
import com.taidii.staffdevelopment.entity.DevelopRating;
import com.taidii.staffdevelopment.entity.DevelopRatingExample;

@Repository("ratingDAO")
public class RatingDAOImpl extends DAOImpl<DevelopRating, DevelopRatingExample> implements IRatingDAO {

	@Autowired
	private DevelopRatingMapper2 developRatingMapper2;
	
	@Override
	public List<RatingDTO> queryBy(Map<String, Object> params) {
		return developRatingMapper2.queryBy(params);
	}

}
