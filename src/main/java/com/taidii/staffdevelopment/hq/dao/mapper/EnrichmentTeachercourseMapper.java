package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentTeachercourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentTeachercourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentTeachercourseMapper {
    long countByExample(EnrichmentTeachercourseExample example);

    int deleteByExample(EnrichmentTeachercourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentTeachercourse record);

    int insertSelective(EnrichmentTeachercourse record);

    List<EnrichmentTeachercourse> selectByExample(EnrichmentTeachercourseExample example);

    EnrichmentTeachercourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentTeachercourse record, @Param("example") EnrichmentTeachercourseExample example);

    int updateByExample(@Param("record") EnrichmentTeachercourse record, @Param("example") EnrichmentTeachercourseExample example);

    int updateByPrimaryKeySelective(EnrichmentTeachercourse record);

    int updateByPrimaryKey(EnrichmentTeachercourse record);
}