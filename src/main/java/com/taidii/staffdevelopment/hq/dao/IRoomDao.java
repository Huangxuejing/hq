package com.taidii.staffdevelopment.hq.dao;

import java.util.List;

import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;

public interface IRoomDao {
	/**
	 * 
	 * @description:通过centerID 查询这个center下的所有的教室
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午4:26:49
	 */
	List<EnrichmentRoom> selectRoomByCenterId(Integer centerId);
	/**
	 * 
	 * @description:通过roomName(一个center下  roomName不得重复)，center查询room对象
	 * @param centerId
	 * @param classRoom
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月28日 上午9:23:43
	 */
	List<EnrichmentRoom> selectRoomByCenterIdAndRoomName(Integer centerId,String classRoom);

	String getRoomNameByRoomId(Integer id);
}
