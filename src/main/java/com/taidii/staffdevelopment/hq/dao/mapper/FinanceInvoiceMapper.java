package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.FinanceInvoice;
import com.taidii.staffdevelopment.hq.entity.FinanceInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceInvoiceMapper {
    long countByExample(FinanceInvoiceExample example);

    int deleteByExample(FinanceInvoiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FinanceInvoice record);

    int insertSelective(FinanceInvoice record);

    List<FinanceInvoice> selectByExample(FinanceInvoiceExample example);

    FinanceInvoice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FinanceInvoice record, @Param("example") FinanceInvoiceExample example);

    int updateByExample(@Param("record") FinanceInvoice record, @Param("example") FinanceInvoiceExample example);

    int updateByPrimaryKeySelective(FinanceInvoice record);

    int updateByPrimaryKey(FinanceInvoice record);
}