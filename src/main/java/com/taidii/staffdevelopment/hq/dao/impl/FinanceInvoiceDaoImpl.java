package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IFinanceInvoiceDao;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.FinanceInvoiceMapper2;
@Service
public class FinanceInvoiceDaoImpl implements IFinanceInvoiceDao{

	@Autowired
	private FinanceInvoiceMapper2 financeInvoiceMapper2;
	
	@Override
	public Double getBalanceByIds(List<Integer> ids) {
		Double balance = 0.00;
		if(ids.size()>0) {
			balance=financeInvoiceMapper2.getBalanceByCenterIds(ids);
		}
		return balance;
	}

	@Override
	public Double getMonthBalanceByCenterIds(List<Integer> ids) {
		Double balance = 0.00;
		if(ids.size()>0) {
			balance=financeInvoiceMapper2.getMonthBalanceByCenterIds(ids);
		}
		return balance;
	}

}
