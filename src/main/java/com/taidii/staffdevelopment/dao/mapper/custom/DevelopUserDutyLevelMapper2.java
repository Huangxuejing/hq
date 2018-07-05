package com.taidii.staffdevelopment.dao.mapper.custom;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.taidii.staffdevelopment.entity.DevelopUserDutyLevel;

@Mapper
public interface DevelopUserDutyLevelMapper2{
    
	/**
	 * @description:通过学校id获取一个学校所有有职务的学生
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午9:34:58
	 */
	public List<DevelopUserDutyLevel> getSchoolAllUser(Map<String,Object> params);
	
}