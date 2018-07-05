package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IEnrichmentTeacherCourseDao;
import com.taidii.staffdevelopment.hq.dao.mapper.AccountsTeacherMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentTeachercourseMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.EnrichmentStudentklassMapper2;
import com.taidii.staffdevelopment.hq.entity.EnrichmentTeachercourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentTeachercourseExample;
@Service
public class EnrichmentTeacherCourseDaoImpl implements IEnrichmentTeacherCourseDao{
	@Autowired
	EnrichmentStudentklassMapper2 enrichmentStudentklassMapper2;
	@Autowired
	EnrichmentTeachercourseMapper enrichmentTeachercourseMapper;
	@Autowired
	AccountsTeacherMapper accountsTeacherMapper;
	@Override
	public List<Integer> selectTeachersByCourseIdCenterId(Integer courseId,Integer centerId) {
		List<Integer> teacherids=new ArrayList<Integer>();
		teacherids=enrichmentStudentklassMapper2.selectTeachersByCourseIdCenterId(courseId,centerId);
		return teacherids;
	}

	@Override
	public Integer insertEnrichmentTeachercourse(List<EnrichmentTeachercourse> teacherCourseList) {
		int num=0;
		for(EnrichmentTeachercourse tc:teacherCourseList){
			int count=enrichmentTeachercourseMapper.insertSelective(tc);
			num+=count;
		}
		return num;
	}

	@Override
	public List<EnrichmentTeachercourse> selectTeachersByCourseId(Integer courseId) {
		EnrichmentTeachercourseExample d=new EnrichmentTeachercourseExample();
		d.createCriteria().andCourseIdEqualTo(courseId);
		return enrichmentTeachercourseMapper.selectByExample(d);
	}
	
	@Override
	public Integer deleteTeacherCourseByCourseId(Integer courseId) {
		EnrichmentTeachercourseExample d=new EnrichmentTeachercourseExample();
		d.createCriteria().andCourseIdEqualTo(courseId);
		return enrichmentTeachercourseMapper.deleteByExample(d);
	}
}
