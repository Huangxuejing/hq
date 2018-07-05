package com.taidii.staffdevelopment.hq.dao;

import java.util.List;

import com.taidii.staffdevelopment.hq.entity.EnrichmentCourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;

public interface ICourseDao {
	/**
	 * 
	 * @description:新增课程入库
	 * @param ec
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午9:12:25
	 */
	int insertEcrichmentCourse(EnrichmentCourse ec);
	
	/**
	 * 
	 * @description:EnrichmentCourselevel 入库
	 * @param eclCourselevels
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午11:28:10
	 */
	int insertEcrichmentCourseLevel(List<EnrichmentCourselevel> eclCourselevels);
	/**
	 * 
	 * @description:HQ创建课程
	 * @param ech
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午3:12:53
	 */
	int insertEcrichmentCourseHq(EnrichmentCourseHq ech);

	/**
	 * 
	 * @description:通过hqid获取课程
	 * @param hqId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午11:28:19
	 */
	List<EnrichmentCourseHq> selectCourseByHqId(Integer hqId);
	/**
	 * 
	 * @description:通过centerId查询出所有的课程
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午11:33:50
	 */
	List<EnrichmentCourse> selectCourseByCenterId(Integer centerId);
	/**
	 * 
	 * @description:通过主键ID 删除课程
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午11:48:20
	 */
	Integer delByCourseId(Integer courseId);
	/**
	 * 
	 * @description:通过课程ID 删除该课程的等级
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午11:52:18
	 */
	Integer delLevelByCourseId(Integer courseId);
	/**
	 * 
	 * @description:通过主键ID 查询出该课程的信息
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午1:55:45
	 */
	EnrichmentCourse selectCourseByPrimaryId(Integer courseId);
	/**
	 * 
	 * @description:通过课程ID 查询出这个课程的等级情况
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午2:00:13
	 */
	List<EnrichmentCourselevel> selectCourseLevelByCourseId(Integer courseId);
	/**
	 * 
	 * @description:删除enrichment_course_hq
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午4:50:26
	 */
	Integer delCourseHqByCourseId(Integer courseId);
	/**
	 * 
	 * @description:HQ 创建的所有的课程
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午5:03:43
	 */
	List<EnrichmentCourseHq> selectCourseHqByCourseId(Integer courseId);
	
	/**
	 * 
	 * @description:courseID 和 centerID 查询EnrichmentCourse
	 * @param courseId
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午6:12:57
	 */
	List<EnrichmentCourse> selectCourseByExample(Integer courseId);
	/**
	 * 
	 * @description: 根据hqId 和 centerId 查询出所有的课程
	 * @param hqId HQ
	 * @param centerId 学校
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 下午4:17:17
	 */
	List<EnrichmentCourseHq> selectCourseByHqIdAndCenterId(Integer hqId,Integer centerId);
	/**
	 * 
	 * @description:根据主键ID 查询课程等级
	 * @param levelId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午10:50:30
	 */
	EnrichmentCourselevel selectCourseLevelByPrimaryId(Integer levelId);
	
	
}
