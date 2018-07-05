package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklassapply;
import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklassapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentStudentklassapplyMapper {
    long countByExample(EnrichmentStudentklassapplyExample example);

    int deleteByExample(EnrichmentStudentklassapplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentStudentklassapply record);

    int insertSelective(EnrichmentStudentklassapply record);

    List<EnrichmentStudentklassapply> selectByExample(EnrichmentStudentklassapplyExample example);

    EnrichmentStudentklassapply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentStudentklassapply record, @Param("example") EnrichmentStudentklassapplyExample example);

    int updateByExample(@Param("record") EnrichmentStudentklassapply record, @Param("example") EnrichmentStudentklassapplyExample example);

    int updateByPrimaryKeySelective(EnrichmentStudentklassapply record);

    int updateByPrimaryKey(EnrichmentStudentklassapply record);
}