package com.taidii.staffdevelopment.hq.controller;

import com.taidii.staffdevelopment.commons.ApiResponse;
import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.error.CommonError;
import com.taidii.staffdevelopment.hq.dto.ProductBundleDto;
import com.taidii.staffdevelopment.hq.entity.FinanceHqfinance;
import com.taidii.staffdevelopment.hq.service.IClassService;
import com.taidii.staffdevelopment.hq.service.IFinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @class: FinanceController
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/20
 */
@Controller
@RequestMapping("/hq")
public class FinanceController {

    @Autowired
    private IFinanceService financeService;

    @Autowired
    private IClassService classService;
    /**
     * 查询收费项目列表
     * @return
     */
    @GetMapping("/getItemList")
    @ResponseBody
    public ApiResponse getItemList(HttpServletRequest request){
        ApiResponse apiResponse = new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        if(null == loginUser){
            throw new BizException(CommonError.USER_AUTH_ERROR);
        }
        apiResponse.setData(classService.getItemList(loginUser));
        return apiResponse;
    }

    /**
     * 修改收费项目列表
     * @return
     */
    @GetMapping("/updateItemList/{id}")
    @ResponseBody
    public ApiResponse updateItemList(@PathVariable Integer id,
                                      @RequestParam Long amount){
        classService.updateItemList(id,amount);
        return new ApiResponse();
    }

    /**
     * 保存套餐产品
     * @param request
     * @param productBundleDto
     * @return
     */
    @PostMapping("/saveProductBundle")
    @ResponseBody
    public ApiResponse saveProductBundle(HttpServletRequest request,@RequestBody ProductBundleDto productBundleDto){
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        if(null == loginUser){
            throw new BizException(CommonError.USER_AUTH_ERROR);
        }
        financeService.saveProductBundle(productBundleDto,loginUser);
        return new ApiResponse();
    }

    /**
     * 删除套餐产品
     * @return
     */
    @DeleteMapping("/deleteProductBundle/{id}")
    @ResponseBody
    public ApiResponse deleteProductBundle(@PathVariable Integer id){
        financeService.deleteProductBundle(id);
        return new ApiResponse();
    }

    /**
     * 修改套餐产品
     * @param request
     * @param productBundleDto
     * @return
     */
    @PutMapping("/updateProductBundle")
    @ResponseBody
    public ApiResponse updateProductBundle(HttpServletRequest request,@RequestBody ProductBundleDto productBundleDto){
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        if(null == loginUser){
            throw new BizException(CommonError.USER_AUTH_ERROR);
        }
        financeService.updateProductBundle(productBundleDto,loginUser);
        return new ApiResponse();
    }

    /**
     * 查询套餐产品
     * @return
     */
    @GetMapping("/getProductBundle")
    @ResponseBody
    public ApiResponse getProductBundle(){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(financeService.getProductBundle());
        return apiResponse;
    }

    /**
     * 查询单个套餐产品
     * @param id
     * @return
     */
    @GetMapping("/getProductBundle/{id}")
    @ResponseBody
    public ApiResponse getProductBundleById(@PathVariable Integer id){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(financeService.getProductBundleById(id));
        return apiResponse;
    }

    /**
     * 查询财务设置 税
     * @param request
     * @return
     */
    @GetMapping("/getFinanceSet")
    @ResponseBody
    public ApiResponse getFinanceSet(HttpServletRequest request){
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        if(null == loginUser){
            throw new BizException(CommonError.USER_AUTH_ERROR);
        }
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(financeService.getFinanceSet(loginUser));
        return apiResponse;
    }

    /**
     * 修改财务税的配置
     * @param financeHqfinance
     * @param request
     * @return
     */
    @PutMapping("/updateFinanceSet")
    @ResponseBody
    public ApiResponse updateFinanceSet(@RequestBody FinanceHqfinance financeHqfinance,
                                        HttpServletRequest request){
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        if(null == loginUser){
            throw new BizException(CommonError.USER_AUTH_ERROR);
        }
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(financeService.updateFinanceSet(financeHqfinance,loginUser));
        return apiResponse;
    }

}
