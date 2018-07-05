package com.taidii.staffdevelopment.hq.dao;

import java.util.List;

public interface IFinanceInvoiceDao {
	/**
	 * 获取还清总额
	 * @param ids
	 * @return
	 */
	Double getBalanceByIds(List<Integer> ids);
	
	/**
	 * 获取当月还清总额
	 * @param ids
	 * @return
	 */
	Double getMonthBalanceByCenterIds(List<Integer> ids);
	
}
