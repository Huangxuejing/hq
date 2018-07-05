package com.taidii.staffdevelopment.hq.service;

import com.taidii.staffdevelopment.hq.dto.CourseAddDto;

public interface IAddCourseService {
	/**
	 * 
	 * @description:添加课程
	 * @param cad
	 * @param userId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月19日 下午8:46:25
	 */
	public String addCourse(CourseAddDto cad,Integer userId,Integer type,Integer centerId)throws Exception;
	/**
	 * 
	 * @description:通过courseID 删除课程
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午11:46:13
	 */
	public void deleteCourseByCourseId(Integer courseId)throws Exception;
}
