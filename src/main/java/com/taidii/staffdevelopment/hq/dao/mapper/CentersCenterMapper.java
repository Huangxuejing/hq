package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.CentersCenter;
import com.taidii.staffdevelopment.hq.entity.CentersCenterExample;
import com.taidii.staffdevelopment.hq.entity.CentersCenterWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CentersCenterMapper {
    long countByExample(CentersCenterExample example);

    int deleteByExample(CentersCenterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CentersCenterWithBLOBs record);

    int insertSelective(CentersCenterWithBLOBs record);

    List<CentersCenterWithBLOBs> selectByExampleWithBLOBs(CentersCenterExample example);

    List<CentersCenter> selectByExample(CentersCenterExample example);

    CentersCenterWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CentersCenterWithBLOBs record, @Param("example") CentersCenterExample example);

    int updateByExampleWithBLOBs(@Param("record") CentersCenterWithBLOBs record, @Param("example") CentersCenterExample example);

    int updateByExample(@Param("record") CentersCenter record, @Param("example") CentersCenterExample example);

    int updateByPrimaryKeySelective(CentersCenterWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CentersCenterWithBLOBs record);

    int updateByPrimaryKey(CentersCenter record);
}