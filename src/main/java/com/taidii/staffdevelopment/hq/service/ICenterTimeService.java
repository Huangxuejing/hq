package com.taidii.staffdevelopment.hq.service;

import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dto.CenterTimeDto;
import com.taidii.staffdevelopment.hq.dto.TimeDto2;

public interface ICenterTimeService {

	List<CenterTimeDto> getTimeOnAddCourse(Integer centerId,Integer userId)throws Exception;
	
	/**
	 * 
	 * @description:检查是否这个教室被使用
	 * @param times
	 * @param dateFrom
	 * @param dateTo
	 * @return
	 * @author:王涛
	 * @param roomId 
	 * @createTime:2018年6月25日 上午9:15:43
	 */
	String checkOutRoom(TimeDto2 times, Integer id,Integer centerId) throws Exception;
	
	/**
	 * 
	 * @description:返回老师
	 * @param times
	 * @param teacherId
	 * @param string
	 * @return
	 * @author:王涛
	 * @param times 
	 * @throws Exception 
	 * @createTime:2018年6月25日 下午3:36:50
	 */
	List<OptionDTO> checkOutTeacher(TimeDto2 times, Integer courseId,Integer centerId,Integer userID) throws Exception;
}
