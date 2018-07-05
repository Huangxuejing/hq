package com.taidii.staffdevelopment.hq.dao;

import java.util.List;

import com.taidii.staffdevelopment.hq.entity.EnrichmentTeachercourse;

public interface IEnrichmentTeacherCourseDao {
	/**
	 * 
	 * @description:查询出这个中心教这个课程的所有的老师
	 * @param courseId
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月25日 下午5:18:39
	 */
	List<Integer> selectTeachersByCourseIdCenterId(Integer courseId,Integer centerId);
	/**
	 * 
	 * @description:EnrichmentTeachercourse 入库操作
	 * @param teacherCourseList
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月26日 上午10:03:36
	 */
	Integer insertEnrichmentTeachercourse(List<EnrichmentTeachercourse> teacherCourseList);
	/**
	 * 
	 * @description:通过课程ID 获取teacherID
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月26日 下午4:55:48
	 */
	List<EnrichmentTeachercourse> selectTeachersByCourseId(Integer courseId);
	/**
	 * 
	 * @description: 删除teacherCourse
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月27日 上午11:26:18
	 */
	Integer deleteTeacherCourseByCourseId(Integer courseId);
}
