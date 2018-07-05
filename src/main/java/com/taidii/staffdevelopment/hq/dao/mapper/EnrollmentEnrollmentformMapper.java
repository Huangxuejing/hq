package com.taidii.staffdevelopment.hq.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.taidii.staffdevelopment.hq.entity.EnrollmentEnrollmentform;
import com.taidii.staffdevelopment.hq.entity.EnrollmentEnrollmentformExample;
import com.taidii.staffdevelopment.hq.entity.EnrollmentEnrollmentformWithBLOBs;

public interface EnrollmentEnrollmentformMapper {
    long countByExample(EnrollmentEnrollmentformExample example);

    int deleteByExample(EnrollmentEnrollmentformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrollmentEnrollmentformWithBLOBs record);

    int insertSelective(EnrollmentEnrollmentformWithBLOBs record);

    List<EnrollmentEnrollmentformWithBLOBs> selectByExampleWithBLOBs(EnrollmentEnrollmentformExample example);

    List<EnrollmentEnrollmentform> selectByExample(EnrollmentEnrollmentformExample example);

    EnrollmentEnrollmentformWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrollmentEnrollmentformWithBLOBs record, @Param("example") EnrollmentEnrollmentformExample example);

    int updateByExampleWithBLOBs(@Param("record") EnrollmentEnrollmentformWithBLOBs record, @Param("example") EnrollmentEnrollmentformExample example);

    int updateByExample(@Param("record") EnrollmentEnrollmentform record, @Param("example") EnrollmentEnrollmentformExample example);

    int updateByPrimaryKeySelective(EnrollmentEnrollmentformWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EnrollmentEnrollmentformWithBLOBs record);

    int updateByPrimaryKey(EnrollmentEnrollmentform record);
}