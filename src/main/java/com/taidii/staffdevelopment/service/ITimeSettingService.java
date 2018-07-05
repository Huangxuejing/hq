package com.taidii.staffdevelopment.service;

import java.util.List;

import com.taidii.staffdevelopment.entity.DevelopTimeSetting;

public interface ITimeSettingService {

	/**
	 * @description:获取所有需要升级的时间
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月23日 下午4:07:18
	 */
	public List<DevelopTimeSetting> getNeedUpgrade(String date);
	
	/**
	 * @description:获取老师结束自评的时间
	 * @param date
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午11:39:52
	 */
	public List<DevelopTimeSetting> getTeacherNeedOverdue(String date);
	
	/**
	 * @description:获取结束自评的时间
	 * @param date
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午11:39:52
	 */
	public List<DevelopTimeSetting> getNeedOverdue(String date);
}
