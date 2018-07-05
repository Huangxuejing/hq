package com.taidii.staffdevelopment.service;

import com.taidii.staffdevelopment.entity.DevelopDutyLevel;

public interface IDutyLevelService {

	/**
	 * @description:通过用户id获取用户职位
	 * @param userId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 上午9:07:06
	 */
	public DevelopDutyLevel getDutyLevelByUserId(Integer userId);
}
