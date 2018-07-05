package com.taidii.staffdevelopment.hq.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dao.ICourseDao;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;
import com.taidii.staffdevelopment.hq.service.ICourseLevelService;
import com.taidii.staffdevelopment.util.ListUtils;

@Service
public class CourseLevelServiceImpl implements ICourseLevelService{
	@Autowired
	ICourseDao courseDao;
	
	@Override
	public List<OptionDTO> getCourseLevelByCourseId(Integer courseId) {
		List<OptionDTO> ods=new ArrayList<OptionDTO>();
		List<EnrichmentCourselevel> eclList=courseDao.selectCourseLevelByCourseId(courseId);
		if(ListUtils.isNotEmpty(eclList)){
			for(EnrichmentCourselevel l:eclList){
				OptionDTO o=new OptionDTO();
				o.setId(l.getId());
				o.setName(l.getName());
				ods.add(o);
			}
		}
		return ods;
	}

}
