package com.taidii.staffdevelopment.hq.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taidii.staffdevelopment.commons.ApiResponse;
import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.error.CommonError;
import com.taidii.staffdevelopment.hq.dto.ClassAddDTO;
import com.taidii.staffdevelopment.hq.dto.CourseAddDto;
import com.taidii.staffdevelopment.hq.service.IAddClassService;
import com.taidii.staffdevelopment.hq.service.IAddCourseService;
import com.taidii.staffdevelopment.hq.service.ICenterService;
import com.taidii.staffdevelopment.hq.service.IClassService;
import com.taidii.staffdevelopment.hq.service.ICourseLevelService;
import com.taidii.staffdevelopment.hq.service.IGetCourseService;
import com.taidii.staffdevelopment.hq.validate.ValidateCourseAddDtoService;

@Controller
@RequestMapping("/hq")
public class ClassScheduleController {
	private static String SUCCESS="success";
	private static String FAILURE="faild";
	@Autowired
	private ICenterService centerService;
	@Autowired
	private IAddCourseService addCourseService;
	@Autowired
	private IGetCourseService getCourseService;
	@Autowired
	private ICourseLevelService courseLevelService;
	@Autowired
	private IAddClassService addClassService;
	@Autowired
	private static final ObjectMapper MAPPER = new ObjectMapper();

	@Autowired
	private IClassService classService;
 	/**
	 * 
	 * @description:查询这个HQ下的所有的center
	 * @param request
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月19日 下午5:50:21
	 */
	@GetMapping("/getCenters")
	@ResponseBody
	public ApiResponse selectCenters(HttpServletRequest request){
		try{
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, FAILURE, "No power to login in");
			}
			Integer userId=loginUser.getId();
			//Integer userId=10;
			if(null==userId){
				return new ApiResponse(-1, FAILURE, "not find user in service caching");
			}
			List<OptionDTO> ods=new ArrayList<OptionDTO>();
			ods=centerService.getCenters(userId);
			return new ApiResponse(0, "ok", ods);
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:课程添加 type=-1 表示All 作用域下添加课程
	 * @param json
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月19日 下午8:34:36
	 */
	@PostMapping("/course/add/{type}/{centerId}")
	@ResponseBody
	public ApiResponse addCource(HttpServletRequest request,@RequestBody String json,@PathVariable("type") Integer type,
			@PathVariable("centerId") Integer centerId){
		try{
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, FAILURE, "No power to login in");
			}
			Integer userId=loginUser.getId();
			if(null==userId){
				return new ApiResponse(-1, FAILURE, "not find user in service caching");
			}
			//Integer userId=10;
			if(StringUtils.isEmpty(json.trim())){
				return new ApiResponse(-1, FAILURE, "The param of json not be empty");
			}
			MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			CourseAddDto cad = MAPPER.readValue(json, CourseAddDto.class);
			/**
			 * 验证CourseAddDto 类
			 */
			ValidateCourseAddDtoService.toValidateCourseAddDto(cad);
			//验证CourseAddDto
			String str=addCourseService.addCourse(cad,userId,type,centerId);
			if(SUCCESS.equals(str)){
				return new ApiResponse(0, "ok", SUCCESS);
			}
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
		return null;
	}

	
	/**
	 * 
	 * @description:根据center获取课程信息 如果center为-1   则查询的是这个HQ创建的课程
	 * @param request
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午11:11:52
	 */
	@GetMapping("/course/get/{centerId}")
	@ResponseBody
	public ApiResponse getCourseList(HttpServletRequest request,@PathVariable("centerId") Integer centerId){
		try{
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, FAILURE, "No power to login in");
			}
			Integer userId=loginUser.getId();
			//Integer userId=10;
			if(null==userId){
				return new ApiResponse(-1, FAILURE, "The session don't find User");
			}
			List<OptionDTO> odList=getCourseService.getAllCourse(centerId,userId);
			return new ApiResponse(-1, "ok", odList);
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:通过课程ID 删除课程
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午11:55:17
	 */
	@DeleteMapping("/course/del/{courseId}")
	@ResponseBody
	public ApiResponse delCourse(@PathVariable("courseId") Integer courseId){
		try{
			if(null==courseId || 0==courseId){
				return new ApiResponse(-1, FAILURE,"The Necessary param course not be empty");
			}
			addCourseService.deleteCourseByCourseId(courseId);
			return new ApiResponse(0, "ok", SUCCESS);
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:根据课程id，回显课程信息
	 * @return courseId 为-1 的话 表示 HQ作用域下的课程编辑
	 * @author:王涛
	 * @createTime:2018年6月20日 下午1:49:14
	 */
	@GetMapping("/course/info/{type}/{courseId}")
	@ResponseBody
	public ApiResponse getEnrichmentCourse(HttpServletRequest request,@PathVariable("courseId") Integer courseId,@PathVariable("type") Integer type){
		try{
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, FAILURE, "No power to login in");
			}
			Integer userId=loginUser.getId();
			//Integer userId=10;
			if(null==courseId || 0==courseId){
				return new ApiResponse(-1, FAILURE,"The necessary param course not be empty");
			}
			CourseAddDto course=getCourseService.getCourseInfo(courseId,type,userId);
			return new ApiResponse(0, "ok", course);
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:编辑保存
	 * @return type 为-1 的话 表示 HQ作用域下
	 * @author:王涛
	 * @createTime:2018年6月20日 下午1:49:14
	 */
	@PostMapping("/course/save/{type}/{courseId}/{centerId}")
	@ResponseBody
	public ApiResponse editSaveCourse(HttpServletRequest request,
			@PathVariable("centerId") Integer centerId,
			@PathVariable("courseId") Integer courseId,@PathVariable("type") Integer type,@RequestBody String json){
		try{
			if(null==courseId || 0==courseId){
				return new ApiResponse(-1, FAILURE,"course is empty,please check out");
			}
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, FAILURE, "No power to login in");
			}
			Integer userId=loginUser.getId();
			if(null==userId){
				return new ApiResponse(-1, FAILURE, "Not find user in service caching");
			}
			//Integer userId=10;
			if(StringUtils.isEmpty(json.trim())){
				return new ApiResponse(-1, FAILURE, "param is not empty");
			}
			MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			CourseAddDto cad = MAPPER.readValue(json, CourseAddDto.class);
			/**
			 * 验证CourseAddDto 类
			 */
			ValidateCourseAddDtoService.toValidateCourseAddDto(cad);
			//对原有数据进行删除
			addCourseService.deleteCourseByCourseId(courseId);
			//再进行保存
			String str=addCourseService.addCourse(cad,userId,type,centerId);
			if(SUCCESS.equals(str)){
				return new ApiResponse(0, "ok", SUCCESS);
			}
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
		return null;
	}
	
	/**
	 * 
	 * @description:添加班级 ,暂时未测试
	 * @param request
	 * @param json
	 * @param type 为-1 则是 hq 视角
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午7:55:05
	 */
	@PostMapping("/class/add/{type}/{courseId}/{centerId}")
	@ResponseBody
	public ApiResponse addClass(HttpServletRequest request,@RequestBody String json,@PathVariable("type") Integer type,
			@PathVariable("courseId") Integer courseId,@PathVariable("centerId") Integer centerId){
		try{
			System.out.println("---"+json);
			if(null==courseId || 0==courseId){
				return new ApiResponse(-1, FAILURE,"course is empty,please check out");
			}
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, FAILURE, "No power to login in");
			}
			Integer userId=loginUser.getId();
			if(null==userId){
				return new ApiResponse(-1, FAILURE, "not find user in service caching");
			}
			//Integer userId=10;
			if(StringUtils.isEmpty(json.trim())){
				return new ApiResponse(-1, FAILURE, "The param is not empty");
			}
			if(type!=-1){
				if(null==centerId || 0==centerId){
					return new ApiResponse(-1, FAILURE, "The center is not empty,please check out!");
				}
			}
			MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			ClassAddDTO cad=MAPPER.readValue(json, ClassAddDTO.class);
			/**
			 * 验证ClassAddDto 类
			 */
			ValidateCourseAddDtoService.toValidateClassAddDto(cad);
			addClassService.saveClass(cad,userId,type,courseId,centerId);
			return new ApiResponse(0, "ok", SUCCESS);
			
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:编辑班级的回显接口
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午10:14:00
	 */
	@GetMapping("/class/edit/{classId}/{type}")
	@ResponseBody
	public ApiResponse editGetClass(@PathVariable("type") Integer type,@PathVariable("classId") Integer classId){
		try{
			if(null==classId || 0==classId){
				return new ApiResponse(-1, FAILURE,"The necessary param class not be empty");
			}
			ClassAddDTO caDto=addClassService.editClass(classId,type);
			return new ApiResponse(0, "ok", caDto);
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}
	/**
	 * 
	 * @description:班级编辑保存接口
	 * @param type
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午1:52:42
	 */
	@PostMapping("/class/edit/save/{classId}")
	@ResponseBody
	public ApiResponse editGetClass(HttpServletRequest request,@PathVariable("classId") Integer classId,@RequestBody String json
			){
		try{
			if(null==classId || 0==classId){
				return new ApiResponse(-1, FAILURE,"The necessary param class not be empty");
			}
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, FAILURE, "No power to login in");
			}
			Integer userId=loginUser.getId();
			if(null==userId){
				return new ApiResponse(-1, FAILURE, "not find user in service caching");
			}
			if(null==json || "".equals(json.trim())){
				return new ApiResponse(-1, FAILURE, "The necessary param json not be empty");
			}
			MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			ClassAddDTO cad=MAPPER.readValue(json, ClassAddDTO.class);
			/**
			 * 验证ClassAddDto 类
			 */
			ValidateCourseAddDtoService.toValidateClassAddDto(cad);
			addClassService.editSaveClass(cad,userId,classId);
			return new ApiResponse(0, "ok", SUCCESS);
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:班级列表中的删除按钮
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午1:51:58
	 */
	@DeleteMapping("/class/del/{classId}")
	@ResponseBody
	public ApiResponse delClass(@PathVariable("classId") Integer classId){
		try{
			if(null==classId || 0==classId){
				return new ApiResponse(-1, FAILURE,"The necessary param class not be empty");
			}
			addClassService.deleteClass(classId,false);
			return new ApiResponse(0, "ok", "delete successed");
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}
	
	/**
	 * 
	 * @description:添加班級中的獲取課程級別接口
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 上午9:47:47
	 */
	@GetMapping("/class/course/level/{courseId}")
	@ResponseBody
	public ApiResponse getCourseLevel(@PathVariable("courseId") Integer courseId){
		try{
			if(null==courseId || 0==courseId){
				return new ApiResponse(-1, FAILURE,"The necessary param course not be empty");
			}
			List<OptionDTO> ods=courseLevelService.getCourseLevelByCourseId(courseId);
			return new ApiResponse(0, "ok", ods);
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}

	/**
	 * 查询班级列表
	 * @param type 0-center 1-all
	 * @param year 年份
	 * @param isStart 是否开课
	 * @param repeat 星期
	 * @param courseId 课程
	 * @param keyWord 关键词
	 * @return
	 */
	@GetMapping("/getClassList/{type}")
	@ResponseBody
	public ApiResponse getClassList(@PathVariable Integer type,
									@RequestParam(required = false) Integer year,
									@RequestParam(required = false) Integer isStart,
									@RequestParam(required = false) Integer repeat,
									@RequestParam Integer courseId,
									@RequestParam(required = false) Integer centreId,
									@RequestParam(required = false) String keyWord,
									HttpServletRequest request) throws ParseException {
		LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
		if(null == loginUser){
			throw new BizException(CommonError.USER_AUTH_ERROR);
		}
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(classService.getClassList(loginUser,type,year,isStart,repeat,keyWord,courseId,centreId));
		return apiResponse;
	}
	
	
	/**
	 * 查询班级下的学生
	 * @return
	 */
	@GetMapping("/getStudent/{classId}")
	@ResponseBody
	public ApiResponse getStudent(@PathVariable Integer classId){
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(classService.getStudentByClassId(classId));
		return apiResponse;
	}

	/**
	 * 查询班级排课信息
	 * @return
	 */
	@GetMapping("/getClassSchedule/{classId}/{type}")
	@ResponseBody
	public ApiResponse getClassSchedule(@PathVariable Integer classId,
										@PathVariable int type,
										HttpServletRequest request){
		LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
		if(null == loginUser){
			throw new BizException(CommonError.USER_AUTH_ERROR);
		}
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(classService.getClassSchedule(loginUser,classId,type));
		return apiResponse;
	}
	
	/**
	 * 
	 * @description:查询HQ 创建的class对应的centers
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年7月3日 上午9:13:52
	 */
	@GetMapping("/class/view/centers/{classId}")
	@ResponseBody
	public ApiResponse getViewHqCreatKlass(HttpServletRequest request,@PathVariable("classId") Integer classId){
		try{
			if(null==classId || 0==classId){
				return new ApiResponse(-1, FAILURE, "The necessary param class not be empty");
			}
			LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
			if(null==loginUser){
				return new ApiResponse(-1, FAILURE, "No power to login in");
			}
			Integer userId=loginUser.getId();
			if(null==userId){
				return new ApiResponse(-1, FAILURE, "not find user in service caching");
			}
			List<OptionDTO> centers=addClassService.selectHQCreatClassCenter(classId,userId);
			return new ApiResponse(0, "ok", centers);
		}catch(Exception e){
			return new ApiResponse(-1, FAILURE, e.getMessage());
		}
	}
}
