package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.ICenterDao;
import com.taidii.staffdevelopment.hq.dao.mapper.CentersCenterMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.HqHqaccountMapper;
import com.taidii.staffdevelopment.hq.entity.CentersCenter;
import com.taidii.staffdevelopment.hq.entity.CentersCenterExample;
import com.taidii.staffdevelopment.hq.entity.HqHqaccount;
import com.taidii.staffdevelopment.hq.entity.HqHqaccountExample;

@Service
public class CenterDaoImpl implements ICenterDao{
	@Autowired
	HqHqaccountMapper hqHqaccountMapper;
	
	@Autowired
	CentersCenterMapper centersCenterMapper;
	
	@Override
	public List<HqHqaccount> selectCentersByUserId(Integer userID) {
		HqHqaccountExample ap=new HqHqaccountExample();
		ap.createCriteria().andUserIdEqualTo(userID);
		return hqHqaccountMapper.selectByExample(ap);
	}

	@Override
	public List<CentersCenter> selectCentersByHqId(Integer hqId) {
		CentersCenterExample ccExample=new CentersCenterExample();
		ccExample.createCriteria().andHqIdEqualTo(hqId);
		return centersCenterMapper.selectByExample(ccExample);
	}

	@Override
	public CentersCenter selectCentersByPrimaryId(Integer centerId) {
		return centersCenterMapper.selectByPrimaryKey(centerId);
	}

}
