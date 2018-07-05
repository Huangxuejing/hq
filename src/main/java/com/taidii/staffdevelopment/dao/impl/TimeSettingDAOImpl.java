package com.taidii.staffdevelopment.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taidii.staffdevelopment.dao.ITimeSettingDAO;
import com.taidii.staffdevelopment.dao.mapper.custom.DevelopTimeSettingMapper2;
import com.taidii.staffdevelopment.entity.DevelopTimeSetting;
import com.taidii.staffdevelopment.entity.DevelopTimeSettingExample;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;

@Repository("timeSettingDAO")
public class TimeSettingDAOImpl extends DAOImpl<DevelopTimeSetting, DevelopTimeSettingExample> implements ITimeSettingDAO {

	@Autowired
	private DevelopTimeSettingMapper2 developTimeSettingMapper2;
	
	@Override
	public List<DevelopTimeSetting> queryBy(Map<String, Object> params) {
		return developTimeSettingMapper2.queryBy(params);
	}
	
  /**
   * @param userId
   * @param date
   *
   * @description: 获取当前所在的period
   * @author:谭农春
   * @createTime: 2018/6/23 16:34
   */
  @Override
  public DevelopTimeSetting fetchCurrent(Integer userId, Date date) {
    return developTimeSettingMapper2.fetchCurrent(userId, date, IsDeleteEnum.NORMAL.getId());
  }
}
