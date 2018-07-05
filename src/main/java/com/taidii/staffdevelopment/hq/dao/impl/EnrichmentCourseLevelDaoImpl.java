package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IEnrichmentCourseLevelDao;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentCourselevelMapper;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevelExample;
@Service
public class EnrichmentCourseLevelDaoImpl implements IEnrichmentCourseLevelDao{
	@Autowired
	EnrichmentCourselevelMapper enrichmentCourselevelMapper;

	@Override
	public List<EnrichmentCourselevel> selectCourseLevelByCourseId(Integer courseId) {
		EnrichmentCourselevelExample e=new EnrichmentCourselevelExample();
		e.createCriteria().andCourseIdEqualTo(courseId);
		return enrichmentCourselevelMapper.selectByExample(e);
	}

}
