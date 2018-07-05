package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.HqHqaccount;
import com.taidii.staffdevelopment.hq.entity.HqHqaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HqHqaccountMapper {
    long countByExample(HqHqaccountExample example);

    int deleteByExample(HqHqaccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HqHqaccount record);

    int insertSelective(HqHqaccount record);

    List<HqHqaccount> selectByExample(HqHqaccountExample example);

    HqHqaccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HqHqaccount record, @Param("example") HqHqaccountExample example);

    int updateByExample(@Param("record") HqHqaccount record, @Param("example") HqHqaccountExample example);

    int updateByPrimaryKeySelective(HqHqaccount record);

    int updateByPrimaryKey(HqHqaccount record);
}