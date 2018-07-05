package com.taidii.staffdevelopment.hq.dao.mapper.custom;


import com.taidii.staffdevelopment.dao.mapper.BaseMapper;
import com.taidii.staffdevelopment.hq.entity.AccountsTeacher;
import com.taidii.staffdevelopment.hq.entity.AccountsTeacherExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccountsTeacherMapper2 extends BaseMapper<AccountsTeacher,AccountsTeacherExample> {

    String getTeacherNameByteacherId(@Param("id") Integer id);
}