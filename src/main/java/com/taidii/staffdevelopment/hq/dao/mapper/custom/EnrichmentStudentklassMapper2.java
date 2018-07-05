package com.taidii.staffdevelopment.hq.dao.mapper.custom;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.hq.dto.StatusDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.taidii.staffdevelopment.dao.mapper.BaseMapper;
import com.taidii.staffdevelopment.hq.dto.EnrichmentKlassscheduletimeDto;
import com.taidii.staffdevelopment.hq.dto.StudentDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;
import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklass;
import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklassExample;

@Mapper
public interface EnrichmentStudentklassMapper2 extends BaseMapper<EnrichmentStudentklass,EnrichmentStudentklassExample> {
    List<StudentDto> getStudentByClassId(@Param("classId") Integer classId);
    
    /**
     * 
     * @description:查询出两个时间之类的EnrichmentKlassschedule
     * @param dateFrom
     * @param dateTo
     * @return
     * @author:王涛
     * @createTime:2018年6月25日 上午9:30:06
     */
	List<EnrichmentKlassschedule> selectEnrichmentKlassscheduleByDateFromAndDateTo(@Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo,
			@Param("centerId") Integer centerId);

	StatusDto getStudentStatus(@Param("classId") Integer classId,@Param("studentId") Integer studentId);
	
	List<EnrichmentKlassscheduletimeDto> selectByClassId(@Param("classId") Integer classId);
	/**
	 * 
	 * @description:查找这个中心教这个课程的所有的老师
	 * @param courseId
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月25日 下午5:22:37
	 */
	List<Integer> selectTeachersByCourseIdCenterId(@Param("courseId") Integer courseId,@Param("centerId") Integer centerId);

	int getStudentNumber(@Param("classId") Integer classId);
	
	
}