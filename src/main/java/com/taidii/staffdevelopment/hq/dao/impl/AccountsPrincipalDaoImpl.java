package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IAccountsPrincipalDao;
import com.taidii.staffdevelopment.hq.dao.mapper.AccountsPrincipalMapper;
import com.taidii.staffdevelopment.hq.entity.AccountsPrincipal;
import com.taidii.staffdevelopment.hq.entity.AccountsPrincipalExample;
@Service
public class AccountsPrincipalDaoImpl implements IAccountsPrincipalDao{

	@Autowired
	AccountsPrincipalMapper accountsPrincipalMapper;
	
	@Override
	public List<Integer> getAccountsPrincipal(List<Integer> ids) {
		List<Integer> userIds = new ArrayList<>();
		if(ids.size()>0) {
			AccountsPrincipalExample e = new AccountsPrincipalExample();
			e.createCriteria().andCenterIdIn(ids);
			List<AccountsPrincipal> accounts = accountsPrincipalMapper.selectByExample(e);
			if(accounts.size()>0) {
				for(AccountsPrincipal a:accounts) {
					userIds.add(a.getUserId());
				}
			}
		}
		return userIds;
	}

	@Override
	public Integer getCenterIdByUserId(Integer userId) {
		AccountsPrincipalExample a=new AccountsPrincipalExample();
		a.createCriteria().andUserIdEqualTo(userId);
		return accountsPrincipalMapper.selectByExample(a).get(0).getCenterId();
	}

}
