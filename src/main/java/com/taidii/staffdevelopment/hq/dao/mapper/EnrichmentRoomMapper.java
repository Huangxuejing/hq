package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentRoomMapper {
    long countByExample(EnrichmentRoomExample example);

    int deleteByExample(EnrichmentRoomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentRoom record);

    int insertSelective(EnrichmentRoom record);

    List<EnrichmentRoom> selectByExample(EnrichmentRoomExample example);

    EnrichmentRoom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentRoom record, @Param("example") EnrichmentRoomExample example);

    int updateByExample(@Param("record") EnrichmentRoom record, @Param("example") EnrichmentRoomExample example);

    int updateByPrimaryKeySelective(EnrichmentRoom record);

    int updateByPrimaryKey(EnrichmentRoom record);
}