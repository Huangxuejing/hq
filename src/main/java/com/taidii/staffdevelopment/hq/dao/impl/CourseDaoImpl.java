package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.ICourseDao;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentCourseHqMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentCourseMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentCourselevelMapper;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseExample;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseHqExample;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevelExample;
import com.taidii.staffdevelopment.util.ListUtils;
@Service
public class CourseDaoImpl implements ICourseDao{
	@Autowired
	EnrichmentCourseMapper enrichmentCourseMapper;
	@Autowired
	EnrichmentCourselevelMapper enrichmentCourselevelMapper;
	@Autowired
	EnrichmentCourseHqMapper enrichmentCourseHqMapper;
	@Override
	public int insertEcrichmentCourse(EnrichmentCourse ec) {
		return enrichmentCourseMapper.insertSelective(ec);
	}

	@Override
	public int insertEcrichmentCourseLevel(List<EnrichmentCourselevel> eclCourselevels) {
		int num=0;
		if(ListUtils.isNotEmpty(eclCourselevels)){
			for(EnrichmentCourselevel e:eclCourselevels){
				int count=enrichmentCourselevelMapper.insertSelective(e);
				num+=count;
			}
		}
		return num;
	}

	@Override
	public List<EnrichmentCourseHq> selectCourseByHqId(Integer hqId) {
		EnrichmentCourseHqExample e=new EnrichmentCourseHqExample();
		e.createCriteria().andHqIdEqualTo(hqId);
		return enrichmentCourseHqMapper.selectByExample(e);
	}

	@Override
	public List<EnrichmentCourse> selectCourseByCenterId(Integer centerId) {
		EnrichmentCourseExample e=new EnrichmentCourseExample();
		e.createCriteria().andCenterIdEqualTo(centerId).andTypeEqualTo(0);
		return enrichmentCourseMapper.selectByExample(e);
	}

	@Override
	public Integer delByCourseId(Integer courseId) {
		return enrichmentCourseMapper.deleteByPrimaryKey(courseId);
	}

	@Override
	public Integer delLevelByCourseId(Integer courseId) {
		EnrichmentCourselevelExample el=new EnrichmentCourselevelExample();
		el.createCriteria().andCourseIdEqualTo(courseId);
		return enrichmentCourselevelMapper.deleteByExample(el);
	}

	@Override
	public EnrichmentCourse selectCourseByPrimaryId(Integer courseId) {
		return enrichmentCourseMapper.selectByPrimaryKey(courseId);
	}

	@Override
	public List<EnrichmentCourselevel> selectCourseLevelByCourseId(Integer courseId) {
		EnrichmentCourselevelExample e=new EnrichmentCourselevelExample();
		e.createCriteria().andCourseIdEqualTo(courseId);
		return enrichmentCourselevelMapper.selectByExample(e);
	}

	@Override
	public int insertEcrichmentCourseHq(EnrichmentCourseHq ech) {
		return enrichmentCourseHqMapper.insertSelective(ech);
	}

	@Override
	public Integer delCourseHqByCourseId(Integer courseId) {
		EnrichmentCourseHqExample el=new EnrichmentCourseHqExample();
		el.createCriteria().andCourseIdEqualTo(courseId);
		return enrichmentCourseHqMapper.deleteByExample(el);
	}

	@Override
	public List<EnrichmentCourseHq> selectCourseHqByCourseId(Integer courseId) {
		EnrichmentCourseHqExample el=new EnrichmentCourseHqExample();
		el.createCriteria().andCourseIdEqualTo(courseId);
		return enrichmentCourseHqMapper.selectByExample(el);
	}

	@Override
	public List<EnrichmentCourse> selectCourseByExample(Integer courseId) {
		EnrichmentCourseExample e=new EnrichmentCourseExample();
		e.createCriteria().andIdEqualTo(courseId);
		return enrichmentCourseMapper.selectByExample(e);
	}

	@Override
	public List<EnrichmentCourseHq> selectCourseByHqIdAndCenterId(Integer hqId,Integer centerId) {
		EnrichmentCourseHqExample el=new EnrichmentCourseHqExample();
		el.createCriteria().andHqIdEqualTo(hqId).andCenterIdEqualTo(centerId);
		return enrichmentCourseHqMapper.selectByExample(el);
	}

	@Override
	public EnrichmentCourselevel selectCourseLevelByPrimaryId(Integer levelId) {
		return enrichmentCourselevelMapper.selectByPrimaryKey(levelId);
	}
}
