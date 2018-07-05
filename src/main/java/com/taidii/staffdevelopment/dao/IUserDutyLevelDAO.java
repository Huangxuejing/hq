package com.taidii.staffdevelopment.dao;

import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.dao.IDAO;
import com.taidii.staffdevelopment.entity.DevelopUserDutyLevel;
import com.taidii.staffdevelopment.entity.DevelopUserDutyLevelExample;

public interface IUserDutyLevelDAO extends IDAO<DevelopUserDutyLevel, DevelopUserDutyLevelExample>{

	/**
	 * @description:获取学校所有有职务的老师用户
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午9:36:03
	 */
	public List<DevelopUserDutyLevel> getSchoolAllUser(Map<String,Object> params);
}
