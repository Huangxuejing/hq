package com.taidii.staffdevelopment.dao;

import java.util.Map;

import com.taidii.staffdevelopment.entity.DevelopDutyLevel;
import com.taidii.staffdevelopment.entity.DevelopDutyLevelExample;

public interface IDutyLevelDAO extends IDAO<DevelopDutyLevel, DevelopDutyLevelExample>{

	/**
	 * @description:获取所有职务map
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午9:53:45
	 */
	public Map<Integer,DevelopDutyLevel> getDutyLevelMap();
	
}
