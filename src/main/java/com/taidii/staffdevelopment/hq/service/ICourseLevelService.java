package com.taidii.staffdevelopment.hq.service;

import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;

public interface ICourseLevelService {
	/**
	 * 
	 * @description:通過课程ID 获取课程等级信息
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 上午9:52:12
	 */
	List<OptionDTO> getCourseLevelByCourseId(Integer courseId);
}
