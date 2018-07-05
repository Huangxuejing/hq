package com.taidii.staffdevelopment.hq.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IRoomDao;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;
import com.taidii.staffdevelopment.hq.service.IEnrichmentRoomService;

@Service
public class EnrichmentRoomServiceImpl implements IEnrichmentRoomService{
	@Autowired
	private IRoomDao roomDao;
	/**
	 * 
	 * @description:查找这个center下的所有的教室room
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午4:26:12
	 */
	@Override
	public List<EnrichmentRoom> getRoomByCenterId(Integer centerId) {
		List<EnrichmentRoom> rooms=new ArrayList<EnrichmentRoom>();
		rooms=roomDao.selectRoomByCenterId(centerId);
		return rooms;
	}

}
