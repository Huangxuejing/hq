package com.taidii.staffdevelopment.hq.service;

import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.hq.dto.ProductBundleDto;
import com.taidii.staffdevelopment.hq.entity.FinanceHqfinance;

import java.util.List;

/**
 * @class: IFinanceService
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/21
 */
public interface IFinanceService {
    /**
     * 保存套餐
     *
     * @param productBundleDto
     * @param loginUser
     */
    void saveProductBundle(ProductBundleDto productBundleDto, LoginUser loginUser);

    /**
     * 修改套餐
     *
     * @param productBundleDto
     */
    void updateProductBundle(ProductBundleDto productBundleDto,LoginUser loginUser);

    /**
     * 删除套餐
     * @param id
     */
    void deleteProductBundle(Integer id);

    /**
     * 查询套餐
     */
    List<ProductBundleDto> getProductBundle();

    /**
     * 查询单个套餐
     * @param id
     * @return
     */
    ProductBundleDto getProductBundleById(Integer id);

    /**
     * 查询财务设置数据
     * @param loginUser
     * @return
     */
    FinanceHqfinance getFinanceSet(LoginUser loginUser);

    FinanceHqfinance updateFinanceSet(FinanceHqfinance financeHqfinance,LoginUser loginUser);
}
