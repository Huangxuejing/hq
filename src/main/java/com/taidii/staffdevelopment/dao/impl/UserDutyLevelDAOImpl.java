package com.taidii.staffdevelopment.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taidii.staffdevelopment.dao.IUserDutyLevelDAO;
import com.taidii.staffdevelopment.dao.mapper.custom.DevelopUserDutyLevelMapper2;
import com.taidii.staffdevelopment.entity.DevelopUserDutyLevel;
import com.taidii.staffdevelopment.entity.DevelopUserDutyLevelExample;

@Repository("userDutyLevelDAO")
public class UserDutyLevelDAOImpl extends DAOImpl<DevelopUserDutyLevel, DevelopUserDutyLevelExample> implements IUserDutyLevelDAO{

	@Autowired
	private DevelopUserDutyLevelMapper2 developUserDutyLevelMapper2;
	
	@Override
	public List<DevelopUserDutyLevel> getSchoolAllUser(Map<String, Object> params) {
		return developUserDutyLevelMapper2.getSchoolAllUser(params);
	}
}
