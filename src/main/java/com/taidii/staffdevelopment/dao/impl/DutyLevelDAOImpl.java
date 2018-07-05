package com.taidii.staffdevelopment.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.taidii.staffdevelopment.dao.IDutyLevelDAO;
import com.taidii.staffdevelopment.entity.DevelopDutyLevel;
import com.taidii.staffdevelopment.entity.DevelopDutyLevelExample;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;

@Repository("dutyLevelDAO")
public class DutyLevelDAOImpl extends DAOImpl<DevelopDutyLevel, DevelopDutyLevelExample> implements IDutyLevelDAO{

	@Override
	public Map<Integer, DevelopDutyLevel> getDutyLevelMap() {
		
		DevelopDutyLevelExample example = new DevelopDutyLevelExample();
		example.createCriteria().andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId());
		List<DevelopDutyLevel> list = mapper.selectByExample(example);
		
		Map<Integer,DevelopDutyLevel> map = new HashMap<>();
		if(!CollectionUtils.isEmpty(list)) {
			for(DevelopDutyLevel dutyLevel : list) {
				map.put(dutyLevel.getId(), dutyLevel);
			}
		}
		
		return map;
	}
}
