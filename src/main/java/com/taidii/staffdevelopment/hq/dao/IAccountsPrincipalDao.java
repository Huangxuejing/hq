package com.taidii.staffdevelopment.hq.dao;

import java.util.List;

public interface IAccountsPrincipalDao {
	
	public List<Integer> getAccountsPrincipal(List<Integer> ids);
	
	public Integer getCenterIdByUserId(Integer userId);
}
