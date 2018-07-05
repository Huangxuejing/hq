package com.taidii.staffdevelopment.hq.dao;

import com.taidii.staffdevelopment.hq.entity.AuthUser;

public interface IAuthUserDao {
	/**
	 * 
	 * @description:通过主键ID 查询用户信息
	 * @param id
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午11:28:44
	 */
	public AuthUser selectAuthUserByPrimaryKey(Integer id);
}
