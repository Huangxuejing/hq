package com.taidii.staffdevelopment.hq.dao.mapper;



import com.taidii.staffdevelopment.dao.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.taidii.staffdevelopment.hq.entity.AccountsTeacher;
import com.taidii.staffdevelopment.hq.entity.AccountsTeacherExample;

@Mapper
public interface AccountsTeacherMapper extends BaseMapper<AccountsTeacher,AccountsTeacherExample> {
}