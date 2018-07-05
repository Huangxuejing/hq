package com.taidii.staffdevelopment.hq.dao;

import java.util.List;

import com.taidii.staffdevelopment.hq.entity.CentersCenter;
import com.taidii.staffdevelopment.hq.entity.HqHqaccount;

public interface ICenterDao {
	/**
	 * 
	 * @description:通过userId 查询该userId下的所有的AccountsPrincipal
	 * @param userID
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月19日 下午7:15:12
	 */
	public List<HqHqaccount> selectCentersByUserId(Integer userID);
	/**
	 * 
	 * @description:通过centerId查询出CentersCenter 对象
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月19日 下午7:23:45
	 */
	public List<CentersCenter> selectCentersByHqId(Integer HqId);
	/**
	 * 
	 * @description:通过 主键CentersID查询center信息
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午2:09:06
	 */
	public CentersCenter selectCentersByPrimaryId(Integer centerId);
	
}
