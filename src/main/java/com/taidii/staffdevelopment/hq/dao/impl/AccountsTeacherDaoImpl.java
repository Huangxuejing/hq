package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.taidii.staffdevelopment.hq.dao.mapper.custom.AccountsTeacherMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IAccountsTeacherDao;
import com.taidii.staffdevelopment.hq.dao.mapper.AccountsTeacherMapper;
import com.taidii.staffdevelopment.hq.entity.AccountsTeacher;
import com.taidii.staffdevelopment.hq.entity.AccountsTeacherExample;
@Service
public class AccountsTeacherDaoImpl implements IAccountsTeacherDao{

	@Autowired
	AccountsTeacherMapper accountsTeacherMapper;

	@Autowired
	AccountsTeacherMapper2 accountsTeacherMapper2;
	
	@Override
	public List<Integer> getAccountsTeacher(List<Integer> ids) {
		List<Integer> userIds = new ArrayList<>();
		if(ids.size()>0) {
			AccountsTeacherExample e = new AccountsTeacherExample();
			e.createCriteria().andCenterIdIn(ids).andDeleteflagEqualTo(0);
			List<AccountsTeacher> accounts = accountsTeacherMapper.selectByExample(e);
			if(accounts.size()>0) {
				for(AccountsTeacher a:accounts) {
					userIds.add(a.getId());
				}
			}
		}
		return userIds;
	}

	@Override
	public AccountsTeacher selectAccountTeacherByPrimaryId(Integer teacherId) {
		return accountsTeacherMapper.selectByPrimaryKey(teacherId);
	}

	@Override
	public List<AccountsTeacher> selectAccountTeacherByCenterId(Integer centerId) {
		AccountsTeacherExample e = new AccountsTeacherExample();
		e.createCriteria().andCenterIdEqualTo(centerId).andDeleteflagEqualTo(0).andResignationDateIsNull();
		return accountsTeacherMapper.selectByExample(e);
	}

	@Override
	public String getTeacherNameByteacherId(Integer id) {
		return accountsTeacherMapper2.getTeacherNameByteacherId(id);
	}

}
