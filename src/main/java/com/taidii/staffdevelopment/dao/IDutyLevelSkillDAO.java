package com.taidii.staffdevelopment.dao;

import com.taidii.staffdevelopment.entity.DevelopDutyLevelSkill;
import com.taidii.staffdevelopment.entity.DevelopDutyLevelSkillExample;

public interface IDutyLevelSkillDAO extends IDAO<DevelopDutyLevelSkill, DevelopDutyLevelSkillExample>{

	/**
	 * @description:通过去年skillid获取最新的skill
	 * @param lastYearSkillId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午11:09:41
	 */
	public DevelopDutyLevelSkill getSkillByLastYearSkillId(Integer lastYearSkillId);
	
}
