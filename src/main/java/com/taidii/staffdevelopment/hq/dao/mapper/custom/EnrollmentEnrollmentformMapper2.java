package com.taidii.staffdevelopment.hq.dao.mapper.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrollmentEnrollmentformMapper2 {
	/**
	 * 获取在册学生
	 * @param ids
	 * @return
	 */
    List<Integer> getNowTotalStudent(@Param(value="ids") List<Integer> ids);
    
    /**
	 * 获取本月新入学的学生人数
	 * @param ids
	 * @return
	 */
    Integer getNewEnrollStudent(@Param(value="ids") List<Integer> ids);
    
    /**
	 * 获取离圆 人数**
	 * @param ids
	 * @return
	 */
    Integer getWithdrStudent(@Param(value="ids") List<Integer> ids);
}