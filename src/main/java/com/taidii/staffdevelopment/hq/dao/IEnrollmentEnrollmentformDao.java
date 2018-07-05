package com.taidii.staffdevelopment.hq.dao;

import java.util.Date;
import java.util.List;


public interface IEnrollmentEnrollmentformDao {
	/**
	 * 获取不同状态的学生
	 * @param ids
	 * @return
	 */
    Integer getStatusStudent(List<Integer> ids,Integer status,String date);
    
    /**
	 * 获取在册学生
	 * @param ids
	 * @return
	 */
    List<Integer> getNowTotalStudent(List<Integer> ids);
    
    /**
     * 获取签到的学生数量
     * @param ids
     * @param date
     * @return
     */
    Integer getAttendanceStudent(List<Integer> ids,Date date);
    
}
