package com.taidii.staffdevelopment.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMapper <T, Texample> {
	long countByExample(Texample example);

    int deleteByExample(Texample example);

    int deleteByPrimaryKey(Integer id);

    List<T> selectByExample(Texample example);

    int updateByExample(@Param("record") T record, @Param("example") Texample example);

    int updateByPrimaryKey(T record);
    
    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Texample example);

    int updateByPrimaryKeySelective(T record);
}
