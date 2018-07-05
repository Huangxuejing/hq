package com.taidii.staffdevelopment.dao.mapper.custom;

import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.dto.settings.SkillLevelDto;
import com.taidii.staffdevelopment.dto.settings.StaffLevelTeachersDto;
import com.taidii.staffdevelopment.dto.settings.TeacherDto;
import org.apache.ibatis.annotations.Mapper;

import com.taidii.staffdevelopment.dto.RatingDTO;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DevelopRatingMapper2{
	
	/**
	 * @description:通过条件查询分数，以分数数序排序
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午5:11:48
	 */
	public List<RatingDTO> queryBy(Map<String,Object> params);

	List<SkillLevelDto> fetchSkillLevelList();

	List<TeacherDto> fetchNotLevelTeacher(@Param("schoolId") Integer schoolId);

	List<StaffLevelTeachersDto> fetchStaffLevelList(@Param("schoolId") Integer schoolId);

	List<TeacherDto> fetchStaffLevelTeacherList(@Param("schoolId") Integer schoolId,@Param("levelId") Integer levelId);

	List<Integer> fetchSkillLevelGrade();

	List<Integer> fetchYearList(@Param("schoolId") Integer schoolId);

}