package com.taidii.staffdevelopment.dao.mapper.custom;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.taidii.staffdevelopment.entity.DevelopTimeSetting;

@Mapper
public interface DevelopTimeSettingMapper2 {

	/**
	 * @description:通过条件查询时间设置
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午8:43:01
	 */
	public List<DevelopTimeSetting> queryBy(Map<String, Object> params);

	/**
	 * @param userId
	 * @param date
	 *
	 * @param isDelete
	 *            是否删除
	 * @description: 获取当前所在的period
	 * @author:谭农春
	 * @createTime: 2018/6/23 16:34
	 */
	public DevelopTimeSetting fetchCurrent(@Param("userId") Integer userId, @Param("date") Date date,
			@Param("isDelete") Integer isDelete);
}