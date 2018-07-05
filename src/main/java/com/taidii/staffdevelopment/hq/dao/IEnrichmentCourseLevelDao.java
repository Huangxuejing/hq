package com.taidii.staffdevelopment.hq.dao;

import java.util.List;

import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;

public interface IEnrichmentCourseLevelDao {
	/**
	 * 
	 * @description:通过courseId 查询出这个course的级别
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月27日 下午5:14:15
	 */
	List<EnrichmentCourselevel> selectCourseLevelByCourseId(Integer courseId);

}
