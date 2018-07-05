package com.taidii.staffdevelopment.hq.dao.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FinanceInvoiceMapper2 {
	/**
	 * 获取未偿还总额
	 * @param ids
	 * @return
	 */
	Double getBalanceByCenterIds(@Param(value="ids")List<Integer> ids);
	
	/**
	 * 当月获取未偿还总额
	 * @param ids
	 * @return
	 */
	Double getMonthBalanceByCenterIds(@Param(value="ids")List<Integer> ids);
}