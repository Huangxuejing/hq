package com.taidii.staffdevelopment.commons;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.enums.RoleTypeEnum;

/**
 * @description:通用拦截器
 * @projectName:staff-development
 * @className:CommonInterceptor.java
 * @author:wentao
 * @createTime:2018年6月8日 下午4:25:49
 * @version 1.0.1
 */
public class CommonInterceptor implements HandlerInterceptor {

	@SuppressWarnings("unused")
	private final String TOKEN = "token";

	@SuppressWarnings("unused")
	@Autowired
	private RedisTemplateHelper redisTemplateHelper;

	/**
	 * @description:拦截请求
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 * @author: 衷文涛
	 * @createTime:2018年6月8日 下午4:26:13
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//-------测试代码 start -----------------------//
		LoginUser testUser = new LoginUser();
		testUser.setId(10);
		testUser.setName("");
		testUser.setCenterId(5);
		testUser.setRoleType(RoleTypeEnum.leader.getId());
		request.getSession().setAttribute(Constants.USER_LOGIN_, testUser);
		if(null!=testUser){
			return true;
		}

		String userId = request.getParameter(TOKEN);
		String token;
		if(userId == null) {
			token = getToken(request, TOKEN);
		}else {
			Cookie cookie = new Cookie(TOKEN, userId);
			response.addCookie(cookie);
			token = userId;
		}

		if(null!=token){
			// 判断缓存中是否有用户信息
			LoginUser userInfo = (LoginUser)redisTemplateHelper.getValue(token,LoginUser.class);
			if (userInfo == null) {
				return false;
			}
			request.getSession().setAttribute(Constants.USER_LOGIN_, userInfo);
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

	@SuppressWarnings("unused")
	private String getToken(HttpServletRequest request,String str) {
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (str.equals(cookie.getName())) {
				return cookie.getValue();
			}
		}
		return null;
	}
}
