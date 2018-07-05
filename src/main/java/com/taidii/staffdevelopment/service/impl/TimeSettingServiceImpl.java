package com.taidii.staffdevelopment.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dao.ITimeSettingDAO;
import com.taidii.staffdevelopment.entity.DevelopTimeSetting;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;
import com.taidii.staffdevelopment.service.ITimeSettingService;

@Service
public class TimeSettingServiceImpl implements ITimeSettingService {

	@Autowired
	private ITimeSettingDAO timeSettingDAO;

	@Override
	public List<DevelopTimeSetting> getNeedUpgrade(String date) {
		
		Map<String,Object> params = new HashMap<>();
		params.put("startTime", date);
		params.put("isDelete", IsDeleteEnum.NORMAL.getId());
		
		return timeSettingDAO.queryBy(params);
	}

	@Override
	public List<DevelopTimeSetting> getNeedOverdue(String date) {
		
		Map<String,Object> params = new HashMap<>();
		params.put("endTime", date);
		params.put("isDelete", IsDeleteEnum.NORMAL.getId());
		
		return timeSettingDAO.queryBy(params);
	}

	@Override
	public List<DevelopTimeSetting> getTeacherNeedOverdue(String date) {
		Map<String,Object> params = new HashMap<>();
		params.put("teacherEndTime", date);
		params.put("isDelete", IsDeleteEnum.NORMAL.getId());
		
		return timeSettingDAO.queryBy(params);
	}
	
}
