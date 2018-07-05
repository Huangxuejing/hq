package com.taidii.staffdevelopment.hq.dao.impl;

import com.taidii.staffdevelopment.hq.dao.IFinanceSetDao;
import com.taidii.staffdevelopment.hq.dao.mapper.FinanceHqfinanceMapper;
import com.taidii.staffdevelopment.hq.entity.FinanceHqfinance;
import com.taidii.staffdevelopment.hq.entity.FinanceHqfinanceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @class: FinanceSetDaoImpl
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/22
 */
@Service
public class FinanceSetDaoImpl implements IFinanceSetDao {

    @Autowired
    FinanceHqfinanceMapper financeHqfinanceMapper;

    @Override
    public List<FinanceHqfinance> getFinanceSet(Integer hqId) {
        FinanceHqfinanceExample example = new FinanceHqfinanceExample();
        example.createCriteria().andHqIdEqualTo(hqId);
        List<FinanceHqfinance> hqfinanceList = financeHqfinanceMapper.selectByExample(example);
        return hqfinanceList;
    }

    @Override
    public void saveFinanceSet(FinanceHqfinance financeHqfinance) {
        financeHqfinanceMapper.insertSelective(financeHqfinance);
    }

    @Override
    public void updateFinanceSet(FinanceHqfinance financeHqfinance) {
        financeHqfinanceMapper.updateByPrimaryKeySelective(financeHqfinance);
    }
}
