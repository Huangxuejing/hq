package com.taidii.staffdevelopment.hq.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IAuthUserDao;
import com.taidii.staffdevelopment.hq.dao.mapper.AuthUserMapper;
import com.taidii.staffdevelopment.hq.entity.AuthUser;

@Service
public class AuthUserDaoImpl implements IAuthUserDao{
	@Autowired
	AuthUserMapper authUserMapper;
	
	@Override
	public AuthUser selectAuthUserByPrimaryKey(Integer id) {
		return authUserMapper.selectByPrimaryKey(id);
	}
}
