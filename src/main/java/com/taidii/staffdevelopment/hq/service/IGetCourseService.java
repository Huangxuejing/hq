package com.taidii.staffdevelopment.hq.service;

import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dto.CourseAddDto;

public interface IGetCourseService {
	/**
	 * 
	 * @description:课程列表
	 * @param centerId
	 * @param userId
	 * @return
	 * @throws Exception
	 * @author:王涛
	 * @createTime:2018年6月20日 下午1:52:46
	 */
	List<OptionDTO> getAllCourse(Integer centerId, Integer userId)throws Exception;
	/**
	 * 
	 * @description:根据课程ID 获取这个课程的信息
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @param userId 
	 * @createTime:2018年6月20日 下午1:52:28
	 */
	CourseAddDto getCourseInfo(Integer courseId,Integer type, Integer userId);
}
