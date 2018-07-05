package com.taidii.staffdevelopment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.qiniu.storage.model.DefaultPutRet;
import com.taidii.staffdevelopment.commons.ApiResponse;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.dto.training.*;
import com.taidii.staffdevelopment.enums.CourseStatusEnum;
import com.taidii.staffdevelopment.error.CommonError;
import com.taidii.staffdevelopment.service.ITrainingService;
import com.taidii.staffdevelopment.util.UploadFileUtil;
import com.taidii.staffdevelopment.util.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/api/training")
public class TrainingController{

    @Autowired
    ITrainingService trainingService;
    
    //七牛下载
    private static String BASE_QINIU_URL = "http://owiju9mp2.bkt.clouddn.com/";
    
    /**
     * 获取全部二级技能
     * @author GongYu
     * @date 2018/6/30
     * @return list
     */
    @GetMapping("/subCategory")
    public ApiResponse getSubCategorys(HttpServletRequest request){
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int schoolId = loginUser.getCenterId();
        List<SubCategoryDTO> skills = trainingService.getAllSubCategory(schoolId);
        ar.setData(skills);
        return ar;
    }
    
    @GetMapping("/plan/list")
    public ApiResponse getTrainingPlan(HttpServletRequest request ,@RequestParam("year") Integer year){
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int schoolId = loginUser.getCenterId();
        List<CourseDTO> courses = trainingService.getCourseList(year, schoolId, CourseStatusEnum.PLANED.getId());
        ar.setData(courses);
        return ar;
    }
    
    @GetMapping("/list")
    public ApiResponse getTrainingList(HttpServletRequest request ,@RequestParam("year") Integer year){
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int schoolId = loginUser.getCenterId();
        List<CourseDTO> courses = trainingService.getCourseList(year, schoolId, CourseStatusEnum.CONFIRM.getId());
        ar.setData(courses);
        return ar;
    }
    
    @GetMapping("/training/need")
    public ApiResponse getTrainingNeed(HttpServletRequest request ,@RequestParam(value = "duty", required = false) Integer dutyId){
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int schoolId = loginUser.getCenterId();
        List<CategoryDTO> result = trainingService.getTrainingNeedList(schoolId, dutyId);
        ar.setData(result);
        return ar;
    }
    
    /**
     * 添加课程
     * @author GongYu
     * @date 2018/6/20
     * @return ar
     */
    @PostMapping("/course/add")
    public ApiResponse addCourse(HttpServletRequest request ,@RequestBody @Valid CourseDTO course, BindingResult result){
        if(result.hasErrors()){
            ValidateUtil.throwBeanValidationException(result, CommonError.REQUEST_PARAMETER_ERROR.getId());
        }
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int schoolId = loginUser.getCenterId();
        course.setSchoolId(schoolId);
        trainingService.addCourse(course);
        ar.setData("success");
        return ar;
    }
    
    @DeleteMapping("/course/delete")
    public ApiResponse deleteCourse(@RequestParam("id") Integer id){
        ApiResponse ar = new ApiResponse();
        trainingService.deleteCourse(id);
        ar.setData("success");
        return ar;
    }
    @PostMapping("/course/modify")
    public ApiResponse modifyCourse(HttpServletRequest request ,@RequestBody CourseDTO course){
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int schoolId = loginUser.getCenterId();
        course.setSchoolId(schoolId);
        trainingService.modifyCourse(course);
        ar.setData("success");
        return ar;
    }
    
    @PostMapping("/course/complete")
    public ApiResponse completeCourse(@RequestBody List<CourseConfirmDTO> confirm){
        ApiResponse ar = new ApiResponse();
        trainingService.completeCourse(confirm);
        ar.setData("success");
        return ar;
    }
    
    @GetMapping("/course/confirm/detail")
    public ApiResponse getCourseConfirmDetail(@RequestParam("courseId") Integer courseId){
        ApiResponse ar = new ApiResponse();
        List<CourseConfirmDTO> result =  trainingService.getCourseConfirmDetail(courseId);
        ar.setData(result);
        return ar;
    }
    
    @GetMapping("/summary")
    public ApiResponse getCourseSummary(HttpServletRequest request ,@RequestParam("year") Integer year){
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int schoolId = loginUser.getCenterId();
        List<UserSummaryDTO> result = trainingService.getUserSummary(schoolId, year);
        ar.setData(result);
        return ar;
    }
    
    @GetMapping("/year")
    public ApiResponse getYear(HttpServletRequest request){
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int schoolId = loginUser.getCenterId();
        List<Integer> result = trainingService.getCourseYear(schoolId);
        ar.setData(result);
        return ar;
    }
    
    @GetMapping("/duty")
    public ApiResponse getDuty(){
        ApiResponse ar = new ApiResponse();
        List<OptionDTO> result = trainingService.getDuty();
        ar.setData(result);
        return ar;
    }
    
    @GetMapping("/subDuty")
    public ApiResponse getSubDuty(){
        ApiResponse ar = new ApiResponse();
        List<OptionDTO> result = trainingService.getSubDuty();
        ar.setData(result);
        return ar;
    }
    
    @GetMapping("/all/teacher")
    public ApiResponse getAllTeacher(HttpServletRequest request){
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int schoolId = loginUser.getCenterId();
        List<OptionDTO> result = trainingService.getAllTeacherOfSchool(schoolId);
        ar.setData(result);
        return ar;
    }
    
    @GetMapping("/history")
    public ApiResponse getUserCourseHistory(@RequestParam("userId") Integer userId, @RequestParam("year") Integer year){
        ApiResponse ar = new ApiResponse();
        UserCourseHistoryDTO result = trainingService.getUserCourseHistory(userId,year);
        ar.setData(result);
        return ar;
    }
    
    @GetMapping("/course/user")
    public ApiResponse getUserCourseHistory(HttpServletRequest request ,@RequestParam("year") Integer year){
        ApiResponse ar = new ApiResponse();
        LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
        int userId = loginUser.getId();
        UserCourseHistoryDTO result = trainingService.getUserCourseHistory(userId,year);
        ar.setData(result);
        return ar;
    }
    
    @PostMapping("/attachment/upload")
    public ApiResponse updateAttachment(MultipartFile file, @RequestParam("userCourseId") Integer userCourseId, @RequestParam("index") Integer index){
        String fileName = file.getOriginalFilename();
        DefaultPutRet result = UploadFileUtil.uploadForInputStream(file);
        String url = BASE_QINIU_URL + result.hash + "?attname="+fileName;
        trainingService.updateAttachment(userCourseId, url);
        ApiResponse ar = new ApiResponse();
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("url", url);
        dataMap.put("index", index);
        ar.setData(dataMap);
        return ar;
    }
}