package com.taidii.staffdevelopment.hq.controller;

import com.taidii.staffdevelopment.commons.ApiResponse;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dto.HomePageCountDTO;
import com.taidii.staffdevelopment.hq.service.IHomePageCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @class: HomeController
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/19
 */
@Controller
@RequestMapping("/hq")
public class HomeController {

    @Autowired
    private IHomePageCountService iHomePageCountService;

    /**
     *
     * @description:统计首页的数据
     * @param request
     * @return
     * @author:孟娜
     * @createTime:2018年6月19日 下午7:16:21
     */
    @GetMapping("/getHomePageCount")
    @ResponseBody
    public ApiResponse getHomePage(HttpServletRequest request){
        HomePageCountDTO homePageCountDTO=new HomePageCountDTO();
        ApiResponse api = new ApiResponse();
        try{
            LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
            if(null==loginUser){
                return new ApiResponse(-1, "fail", "非法登录");
            }
            Integer userId=loginUser.getId();
            if(null==userId){
                return new ApiResponse(-1, "fail", "用户ID必须缓存进session");
            }
            homePageCountDTO = iHomePageCountService.getHomePage(userId);
            api.setData(homePageCountDTO);
        }catch(Exception e){
            return new ApiResponse(-1, "fail", e.getMessage());
        }

        return api;
    }
}
