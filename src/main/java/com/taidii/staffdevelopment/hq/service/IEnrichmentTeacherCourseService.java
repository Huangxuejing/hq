package com.taidii.staffdevelopment.hq.service;

import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;

public interface IEnrichmentTeacherCourseService {
	/**
	 * 
	 * @description:查询这个center下的所有的老师
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月26日 上午10:16:43
	 */
	List<OptionDTO> getAllTeacherByCenterId(Integer centerId);

}
