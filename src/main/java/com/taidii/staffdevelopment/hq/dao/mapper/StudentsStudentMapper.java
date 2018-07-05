package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.dao.mapper.BaseMapper;
import com.taidii.staffdevelopment.hq.entity.StudentsStudent;
import com.taidii.staffdevelopment.hq.entity.StudentsStudentExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentsStudentMapper extends BaseMapper<StudentsStudent,StudentsStudentExample> {
}