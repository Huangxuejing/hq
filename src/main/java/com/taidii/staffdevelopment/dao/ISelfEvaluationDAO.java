package com.taidii.staffdevelopment.dao;

import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.dto.development.DevelopDTO;
import com.taidii.staffdevelopment.dto.development.YearEvaluationDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationTeacherListDTO;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluation;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationExample;

public interface ISelfEvaluationDAO extends IDAO<DevelopSelfEvaluation, DevelopSelfEvaluationExample>{

	/**
	 * @description:获取年列表
	 * @param map
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 上午10:43:24
	 */
	public List<Integer> getYearList(Map<String,Object> map);
 
	/**
	 * @description:
	 * @param  --userid
	 *  -- 获取自评列表明细
	 * @author:谭农春
	 * @createTime: 2018/6/19 13:48 
	 */
  public 	List<DevelopDTO> fetchSelfEvaluation(Integer userId);

 /**
  * @description:  
  *    -- 获取用户id明细
  * @param userid
	* 				-- 用户id
  * @author:谭农春
  * @createTime: 2018/6/19 13:50 
  */
	public  List<YearEvaluationDTO> fetchSelfEvaluationYearDetails(Integer userid);

	/**
	 * @description:获取老师自评
	 * @param params
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月22日 下午2:27:04
	 */
	public List<SelfEvaluationTeacherListDTO> getList(Map<String,Object> params);
	
	/**
	 * @description:获取最新学期
	 * @param map
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月23日 上午10:17:22
	 */
	public Integer getLastPeriod(Map<String,Object> map);
}
