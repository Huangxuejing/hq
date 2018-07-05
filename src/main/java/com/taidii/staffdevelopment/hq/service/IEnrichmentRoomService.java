package com.taidii.staffdevelopment.hq.service;

import java.util.List;

import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;

public interface IEnrichmentRoomService {
	/**
	 * 
	 * @description:通过分部ID 查询出这个分部的所有的教室
	 * @param centerId 学校ID
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午4:09:15
	 */
	List<EnrichmentRoom> getRoomByCenterId(Integer centerId);

}
