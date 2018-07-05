package com.taidii.staffdevelopment.hq.dao;

import java.util.List;

import com.taidii.staffdevelopment.hq.entity.AccountsTeacher;

public interface IAccountsTeacherDao {

	List<Integer> getAccountsTeacher(List<Integer> ids);
	/**
	 * 
	 * @description:通过主键ID 查询出AccountTeacher
	 * @param teacherId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午11:25:53
	 */
	AccountsTeacher selectAccountTeacherByPrimaryId(Integer teacherId);
	/**
	 * 
	 * @description:通过centerID 查询所有的AccountsTeacher
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月26日 上午10:21:31
	 */
	List<AccountsTeacher> selectAccountTeacherByCenterId(Integer centerId);

	/**
	 * 查询老师名称
	 * @param id
	 * @return
	 */
	String getTeacherNameByteacherId(Integer id);
}
