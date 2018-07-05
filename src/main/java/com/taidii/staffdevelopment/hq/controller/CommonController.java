package com.taidii.staffdevelopment.hq.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.taidii.staffdevelopment.hq.service.IClassService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taidii.staffdevelopment.commons.ApiResponse;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dto.CenterTimeDto;
import com.taidii.staffdevelopment.hq.dto.TimeDto2;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;
import com.taidii.staffdevelopment.hq.service.ICenterTimeService;
import com.taidii.staffdevelopment.hq.service.IEnrichmentRoomService;
import com.taidii.staffdevelopment.hq.service.IEnrichmentTeacherCourseService;

@Controller
@RequestMapping("/hq")
public class CommonController {
	@Autowired
	private ICenterTimeService centerTimeService;
	@Autowired
	private IEnrichmentRoomService enrichmentRoomService;
	@Autowired
	private IEnrichmentTeacherCourseService enrichmentTeacherCourseService;
	@Autowired
	private IClassService classService;
	@Autowired
	private static final ObjectMapper MAPPER = new ObjectMapper();
	/**
	 * 
	 * @description:添加班级中的时间接口
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 上午11:19:56
	 */
	@GetMapping("/class/time/{centerId}")
	@ResponseBody
	public ApiResponse getTime(HttpServletRequest request,@PathVariable("centerId") Integer centerId){
		try{
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, "faild", "NO power to login in");
			}
			Integer userId=loginUser.getId();
			//Integer userId=10;
			if(null==userId){
				return new ApiResponse(-1, "faild", "not find user in service caching");
			}
			List<CenterTimeDto> timeList=new ArrayList<CenterTimeDto>();
			timeList=centerTimeService.getTimeOnAddCourse(centerId,userId);
			return new ApiResponse(0, "ok", timeList);
		}catch(Exception e){
			return new ApiResponse(-1, "faild", e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:通过centerID 获取这个center下的所有的教室
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午3:51:10
	 */
	@GetMapping("/class/room/{centerId}")
	@ResponseBody
	public ApiResponse getRoom(@PathVariable("centerId") Integer centerId){
		try{
			if(null==centerId || 0==centerId){
				return new ApiResponse(-1, "ok", "The ne");
			}
			List<EnrichmentRoom> optionList=enrichmentRoomService.getRoomByCenterId(centerId);
			return new ApiResponse(0, "ok", optionList);
		}catch(Exception e){
			return new ApiResponse(-1, "faild", e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:判断这个这个时间段之类是否有使用这个教室
	 * @return
	 * @author:王涛
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 * @createTime:2018年6月22日 下午5:52:01
	 */
	@PostMapping("/class/used/room/{roomId}/{centerId}")
	@ResponseBody
	public ApiResponse judgeIsUsedRoom(@RequestBody String timeJson,@PathVariable("roomId") Integer roomId,
			@PathVariable("centerId") Integer centerId){
		try{
			String str="";
			if(null==timeJson || "".equals(timeJson)){
				return new ApiResponse(-1, "faild", "The Necessary param timejson not be empty");
			}
			if(null==roomId || 0==roomId){
				return new ApiResponse(-1, "faild", "The Necessary param room not be empty");
			}
			MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			TimeDto2 times=MAPPER.readValue(timeJson,TimeDto2.class);
			if(null==times){
				return new ApiResponse(-1, "faild", "The Necessary param class time not be empty");
			}
			str=centerTimeService.checkOutRoom(times,roomId,centerId);
			//str=success 就是可以使用这个班级
			return new ApiResponse(0, "ok", str);
		}catch(Exception e){
			return new ApiResponse(-1, "faild", e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:返回这个center的所有的空闲老师
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月25日 下午3:29:17
	 */
	@PostMapping("/class/used/teacher/{courseId}/{centerId}")
	@ResponseBody
	public ApiResponse getTeachers(HttpServletRequest request,
			@RequestBody String timeJson,@PathVariable("courseId") Integer courseId,@PathVariable("centerId") Integer centerId){
		try{
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, "faild", "NO power to login in");
			}
			Integer userId=loginUser.getId();
			//Integer userId=10;
			if(null==userId){
				return new ApiResponse(-1, "faild", "not find user in service caching");
			}
			if(null==timeJson || "".equals(timeJson)){
				return new ApiResponse(-1, "faild", "The Necessary param class time not be empty");
			}
			if(null==courseId || 0==courseId){
				return new ApiResponse(-1, "faild", "The Necessary param course not be empty");
			}
			if(null==centerId || 0==centerId){
				return new ApiResponse(-1, "faild", "The Necessary param center not be empty");
			}
			MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			TimeDto2 times=MAPPER.readValue(timeJson,TimeDto2.class);
			if(null==times){
				return new ApiResponse(-1, "faild", "The Necessary param not be empty");
			}
			List<OptionDTO> ods =centerTimeService.checkOutTeacher(times,courseId,centerId,userId);
			//str=success 就是可以使用这个班级
			return new ApiResponse(0, "ok", ods);
		}catch(Exception e){
			return new ApiResponse(-1, "faild", e.getMessage());
		}
	}
	/**
	 * 
	 * @description:查询这个center下的所有的老师
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月26日 上午10:11:20
	 */
	@GetMapping("/course/all/teacher/{centerId}")
	@ResponseBody
	public ApiResponse getAllTeacherUnderCenter(@PathVariable("centerId") Integer centerId){
		try{
			if(null==centerId || 0==centerId){
				return new ApiResponse(-1, "faild", "The Necessary param center not be empty");
			}
			List<OptionDTO> olist=enrichmentTeacherCourseService.getAllTeacherByCenterId(centerId);
			return new ApiResponse(0, "ok", olist);
		}catch(Exception e){
			return new ApiResponse(-1, "faild", e.getMessage());
		}
		
	}

	@GetMapping("/getyear")
	@ResponseBody
	public ApiResponse getStartYear(){
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(classService.getStartYear());
		return apiResponse;
	}
}
