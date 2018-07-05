package com.taidii.staffdevelopment.hq.service;

import com.taidii.staffdevelopment.dto.HomePageCountDTO;

public interface IHomePageCountService {
	/**
	 * 获取首页统计信息
	 * @param userId
	 * @return
	 */
	HomePageCountDTO getHomePage(Integer userId);
}
