package com.taidii.staffdevelopment.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.entity.DevelopTimeSetting;
import com.taidii.staffdevelopment.entity.DevelopTimeSettingExample;

public interface ITimeSettingDAO extends IDAO<DevelopTimeSetting, DevelopTimeSettingExample> {

	/**
	 * @description:通过条件查询时间设置
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午8:45:36
	 */
	public List<DevelopTimeSetting> queryBy(Map<String, Object> params);

	/**
	 * @description: 获取当前所在的period
	 * @author:谭农春
	 * @createTime: 2018/6/23 16:34
	 */
	public DevelopTimeSetting fetchCurrent(Integer userId, Date date);
}
