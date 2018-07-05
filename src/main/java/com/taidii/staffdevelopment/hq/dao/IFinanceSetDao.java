package com.taidii.staffdevelopment.hq.dao;

import com.taidii.staffdevelopment.hq.entity.FinanceHqfinance;

import java.util.List;

/**
 * @class: IFinanceSetDao
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/22
 */
public interface IFinanceSetDao {

    List<FinanceHqfinance> getFinanceSet(Integer hqId);

    void saveFinanceSet(FinanceHqfinance financeHqfinance);

    void updateFinanceSet(FinanceHqfinance financeHqfinance);
}
