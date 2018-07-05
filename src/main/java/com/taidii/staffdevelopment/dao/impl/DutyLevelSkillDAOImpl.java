package com.taidii.staffdevelopment.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.taidii.staffdevelopment.dao.IDutyLevelSkillDAO;
import com.taidii.staffdevelopment.entity.DevelopDutyLevelSkill;
import com.taidii.staffdevelopment.entity.DevelopDutyLevelSkillExample;

@Repository("dutyLevelSkillDAO")
public class DutyLevelSkillDAOImpl extends DAOImpl<DevelopDutyLevelSkill, DevelopDutyLevelSkillExample> implements IDutyLevelSkillDAO{

	@Override
	public DevelopDutyLevelSkill getSkillByLastYearSkillId(Integer lastYearSkillId) {
		DevelopDutyLevelSkillExample example = new DevelopDutyLevelSkillExample();
		example.createCriteria().andLastYearSelfIdEqualTo(lastYearSkillId);
		List<DevelopDutyLevelSkill> list = mapper.selectByExample(example);
		if(CollectionUtils.isEmpty(list)) {
			return null;
		}
		return list.get(0);
	}

}
