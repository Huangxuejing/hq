package com.taidii.staffdevelopment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dao.IDutyLevelDAO;
import com.taidii.staffdevelopment.dao.IUserDutyLevelDAO;
import com.taidii.staffdevelopment.entity.DevelopDutyLevel;
import com.taidii.staffdevelopment.entity.DevelopUserDutyLevel;
import com.taidii.staffdevelopment.entity.DevelopUserDutyLevelExample;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;
import com.taidii.staffdevelopment.service.IDutyLevelService;

@Service
public class DutyLevelServiceImpl implements IDutyLevelService{

	@Autowired
	private IUserDutyLevelDAO userDutyLevelDAO;
	
	@Autowired
	private IDutyLevelDAO dutyLevelDAO;

	@Override
	public DevelopDutyLevel getDutyLevelByUserId(Integer userId) {
		
		if(userId != null) 
		{
			DevelopUserDutyLevelExample developUserDutyLevelExample = new DevelopUserDutyLevelExample();
			developUserDutyLevelExample.createCriteria()
				.andUserIdEqualTo(userId)
				.andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
			
			List<DevelopUserDutyLevel> list = userDutyLevelDAO.selectByExample(developUserDutyLevelExample);
			
			if(list != null && list.size() == 1) {
				return dutyLevelDAO.selectByPrimaryKey(list.get(0).getDutyLevelId());
			}
		}
		
		return null;
	}
	
	
	
}
