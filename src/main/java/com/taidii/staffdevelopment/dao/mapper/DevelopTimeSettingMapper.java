package com.taidii.staffdevelopment.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.taidii.staffdevelopment.entity.DevelopTimeSetting;
import com.taidii.staffdevelopment.entity.DevelopTimeSettingExample;

@Mapper
public interface DevelopTimeSettingMapper extends BaseMapper<DevelopTimeSetting, DevelopTimeSettingExample>{
   
}