package com.taidii.staffdevelopment.dao.mapper.custom;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.taidii.staffdevelopment.dto.development.DevelopDTO;
import com.taidii.staffdevelopment.dto.development.YearEvaluationDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationTeacherListDTO;

@Mapper
public interface DevelopSelfEvaluationMapper2 {

	/**
	 * @description:获取用户自评年汇总
	 * @param map
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 上午10:32:09
	 */
	public List<Integer> getYearList(Map<String,Object> map);
	
	/**
	 * @description:获取最新学期
	 * @param map
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 上午10:32:09
	 */
	public Integer getLastPeriod(Map<String,Object> map);

	/**
	 * @description:  
	 *     历年自评情况
	 * @param userId
	 * 					-- 用户id
	 * @author:谭农春
	 * @createTime: 2018/6/19 14:02 
	 */
	
	public List<DevelopDTO> fetchSelfEvaluation(@Param("userId") Integer userId, @Param("status") String status, @Param("isDelete") Integer isDelete);

/**
 * @description:  
 *     自评统计情况
 * @param  -- userId
 * 				用户id
 * @author:谭农春
 * @createTime: 2018/6/19 14:03 
 */
	public List<YearEvaluationDTO> fetchSelfEvaluationYearDetails(@Param("userId") Integer userId, @Param("status") String status, @Param("isDelete") Integer isDelete);
	
	/**
	 * @description:获取老师自评情况
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月22日 下午2:19:21
	 */
	public List<SelfEvaluationTeacherListDTO> getList(Map<String,Object> params);
}
