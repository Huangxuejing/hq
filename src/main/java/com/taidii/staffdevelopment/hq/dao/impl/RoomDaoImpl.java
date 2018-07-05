package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IRoomDao;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentRoomMapper;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoomExample;
@Service
public class RoomDaoImpl implements IRoomDao{
	
	@Autowired
	EnrichmentRoomMapper enrichmentRoomMapper;
	
	@Override
	public List<EnrichmentRoom> selectRoomByCenterId(Integer centerId) {
		EnrichmentRoomExample room=new EnrichmentRoomExample();
		room.createCriteria().andCenterIdEqualTo(centerId);
		return enrichmentRoomMapper.selectByExample(room);
	}

	@Override
	public List<EnrichmentRoom> selectRoomByCenterIdAndRoomName(Integer centerId,String classRoom) {
		EnrichmentRoomExample room=new EnrichmentRoomExample();
		room.createCriteria().andCenterIdEqualTo(centerId).andNameEqualTo(classRoom);
		return enrichmentRoomMapper.selectByExample(room);
	}

	@Override
	public String getRoomNameByRoomId(Integer id) {
		EnrichmentRoom enrichmentRoom = enrichmentRoomMapper.selectByPrimaryKey(id);
		return enrichmentRoom.getName();
	}

}
