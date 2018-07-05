package com.taidii.staffdevelopment.hq.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dao.IAccountsTeacherDao;
import com.taidii.staffdevelopment.hq.dao.IAuthUserDao;
import com.taidii.staffdevelopment.hq.entity.AccountsTeacher;
import com.taidii.staffdevelopment.hq.entity.AuthUser;
import com.taidii.staffdevelopment.hq.service.IEnrichmentTeacherCourseService;
import com.taidii.staffdevelopment.util.ListUtils;

@Service
public class EnrichmentTeacherCourseServiceImpl implements IEnrichmentTeacherCourseService{
	@Autowired
	IAccountsTeacherDao accountTeacherDao;
	@Autowired
	IAuthUserDao authUserDao;
	
	@Override
	public List<OptionDTO> getAllTeacherByCenterId(Integer centerId) {
		List<OptionDTO> op=new ArrayList<OptionDTO>();
		//通过center 查询出这个center下的所有的userId
		List<AccountsTeacher> atList=new ArrayList<AccountsTeacher>();
		atList=accountTeacherDao.selectAccountTeacherByCenterId(centerId);
		//通过userID 查询所有的名字
		if(ListUtils.isNotEmpty(atList)){
			for(AccountsTeacher at:atList){
				OptionDTO o=new OptionDTO();
				o.setId(at.getId());
				AuthUser au=authUserDao.selectAuthUserByPrimaryKey(at.getUserId());
				o.setName(au.getFirstName()+" "+au.getLastName());
				op.add(o);
			}
		}
		return op;
	}

}
