package com.taidii.staffdevelopment.hq.controller;

import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.taidii.staffdevelopment.commons.ApiResponse;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.hq.dto.ExcelDto;
import com.taidii.staffdevelopment.hq.service.IExcelService;
import com.taidii.staffdevelopment.util.ImportExcelUtil;
import com.taidii.staffdevelopment.util.ListUtils;

@Controller
@RequestMapping("/hq/import/excel")
public class ImportExcelController {
	@Autowired
	IExcelService excelService;
	
	@PostMapping("/upload/{centerId}/{courseId}")
	@ResponseBody
	public ApiResponse uploadExcel(HttpServletRequest request,
			@PathVariable("centerId") Integer centerId,
			@PathVariable("courseId") Integer courseId){
		//Long biginTime=0L;
		//Long endTime=0L;
		 try{
			// biginTime=System.currentTimeMillis();
			 LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			 if(null==loginUser){
				 return new ApiResponse(-1, "fail", "No power to login in");
			 }
			 Integer userId=loginUser.getId();
			 //Integer userId=10;
			 if(null==userId){
				 return new ApiResponse(-1, "fail", "not find user in service caching");
			 }
			 if(null==centerId || 0==centerId){
				 return new ApiResponse(-1, "faild", "The Necessary param [center] not be empty");
			 }
			 if(null==courseId || 0==courseId){
				 return new ApiResponse(-1, "faild", "The Necessary param [course] not be empty");
			 }
			 MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;    
		     //System.out.println("通过传统方式form表单提交方式导入excel文件！");
		     InputStream in =null;  
		     List<List<Object>> listob = null;  
		     MultipartFile file = multipartRequest.getFile("file");
		     if(file.isEmpty()){
		         throw new Exception("file does not exist!"); 
		     }
		     in = file.getInputStream();  
		     listob = new ImportExcelUtil().getBankListByExcel(in,file.getOriginalFilename());  
		     in.close();
		     if(ListUtils.isNotEmpty(listob)){
		      //解析Execl 赋值给对象以后
		       List<ExcelDto> excelList=excelService.setExcelDto(listob);
		       //解析完成以后准备导入到数据库，并进行各验证
		       if(ListUtils.isNotEmpty(excelList)){
		    	   String str=excelService.insertExcel(excelList,centerId,courseId,userId);
		    	   if(str.equals("success")){
//		    		  endTime=System.currentTimeMillis();
//		    		  System.out.println(endTime-biginTime);
		    		   return new ApiResponse(0, "ok", "import success！");
		    	   }
		       }else{
		    	   return new ApiResponse(-1, "faild", "import faild");
		       }
		     }
		 }catch(Exception e){
			 e.printStackTrace();
			 return new ApiResponse(-1, "faild", e.getMessage());
		 }
		 return new ApiResponse(-1, "faild", "The File was import faild");
	 }
}
