package com.taidii.staffdevelopment.controller;

import com.taidii.staffdevelopment.commons.ApiResponse;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dto.settings.*;
import com.taidii.staffdevelopment.entity.DevelopRating;
import com.taidii.staffdevelopment.enums.DutyLevelSkillTypeEnum;
import com.taidii.staffdevelopment.service.ISettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class SettingsController {

    @Autowired
    private ISettingsService settingsService;

    @GetMapping("api/development/rating/list/{year}/{term}")
    @ResponseBody
    public ApiResponse searchScoreLevel(@PathVariable("year") Integer year,
                                        HttpServletRequest request,
                                        @PathVariable("term") Integer term){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        List<DevelopRating> list=settingsService.selectDevelopRatingList(schoolId,year,term);
        apiResponse.setData(list);
        return apiResponse;
    }
    @PostMapping("/api/development/rating/save/{term}")
    @ResponseBody
    public ApiResponse addScoreLevel(@RequestBody DevelopRating developRating,
                                     @PathVariable("term") Integer term,
                                     HttpServletRequest request){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        developRating.setSchoolId(schoolId);
        settingsService.saveDevelopRating(developRating,term);
        apiResponse.setData("success!");
        return apiResponse;
    }
    @DeleteMapping("/api/development/rating/delete/{id}")
    @ResponseBody
    public ApiResponse deleteScoreLevel(@PathVariable("id") Integer id){
        ApiResponse apiResponse=new ApiResponse();
        settingsService.deleteDevelopRating(id);
        apiResponse.setData("success!");
        return apiResponse;
    }

    /**
     * skilllevelList
     * @return
     */
    @GetMapping("/api/development/skill/level/list")
    @ResponseBody
    public ApiResponse fetchSkillLevelList(){
        ApiResponse apiResponse=new ApiResponse();
        SkillLevelGradeDto skillLevelGradeDto=new SkillLevelGradeDto();
        List<SkillLevelDto> list=settingsService.fetchSkillLevel();
        List<Integer> grades=settingsService.fetchSkillLevelGrade();
        skillLevelGradeDto.setGrades(grades);
        skillLevelGradeDto.setSkillLevels(list);
        apiResponse.setData(skillLevelGradeDto);
        return apiResponse;
    }

    /**
     * 获取学校的stafflevel列表
     * @param
     * @return
     */
    @GetMapping("/api/development/staff/level/list")
    @ResponseBody
    public ApiResponse fetchStaffLevelTeacherList(HttpServletRequest request){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        List<StaffLevelTeachersDto> list=settingsService.fetchStaffLevelTeacherList(schoolId);
        apiResponse.setData(list);
        return apiResponse;
    }

    /**
     * 获取没有被分配等级的老师
     * @param
     * @return
     */
    @GetMapping("/api/development/staff/level/teacher/list")
    @ResponseBody
    public ApiResponse fetchStaffNotLevelTeacherList(HttpServletRequest request){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        List<TeacherDto> list=settingsService.fetchNotLevelTeacher(schoolId);
        apiResponse.setData(list);
        return apiResponse;
    }

    /**
     * 保存老师
     * @param teacherDto
     * @param levelId
     * @return
     */
    @PostMapping("/api/development/staff/level/tacher/save/{levelId}")
    @ResponseBody
    public ApiResponse addStaffLevelTeacherSave(@RequestBody TeacherDto teacherDto,
                                                @PathVariable("levelId") Integer levelId){
        ApiResponse apiResponse=new ApiResponse();
        settingsService.saveStaffTeacher(levelId,teacherDto.getId());
        apiResponse.setData("success!");
        return apiResponse;
    }

    /**
     * 保存Category
     * @param domain
     * @return
     */
    @PostMapping("/api/development/framework/category/save/{levelId}/{year}/{term}")
    @ResponseBody
    public ApiResponse saveFrameworkCategory(@RequestBody DomainDto domain,
                                             @PathVariable("levelId") Integer levelId,
                                             @PathVariable("term") Integer term,
                                             HttpServletRequest request,
                                             @PathVariable("year") Integer year){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        Integer type=DutyLevelSkillTypeEnum.CUSTOM.getId();
        settingsService.saveCategorys(domain,type,levelId,year,schoolId,term);
        apiResponse.setData("success!");
        return apiResponse;
    }

    /**
     * 保存Domain
     * @param domains
     * @return
     */
    @PostMapping("/api/development/framework/domain/save/{levelId}/{year}/{term}")
    @ResponseBody
    public ApiResponse saveFrameworkDomain(@RequestBody List<DomainDto> domains,
                                           @PathVariable("levelId") Integer levelId,
                                           @PathVariable("term") Integer term,
                                           HttpServletRequest request,
                                           @PathVariable("year") Integer year){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        Integer type=DutyLevelSkillTypeEnum.CUSTOM.getId();
        settingsService.saveDomain(domains,type,levelId,year,schoolId,term);
        apiResponse.setData("success!");
        return apiResponse;
    }
    /**
     * 保存skill Guidings
     * @param domains
     * @return
     */
    @PostMapping("/api/development/framework/skill/save/{type}/{levelId}/{year}/{term}")
    @ResponseBody
    public ApiResponse saveFrameworkSkills(@RequestBody List<DomainDto> domains,
                                           @PathVariable("type") Integer type,
                                           @PathVariable("levelId") Integer levelId,
                                           @PathVariable("term") Integer term,
                                           HttpServletRequest request,
                                           @PathVariable("year") Integer year){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        settingsService.saveSkillGuidings(domains,type,levelId,year,schoolId,term);
        apiResponse.setData("success!");
        return apiResponse;
    }
    /**
     * 获取skill framework的集合树
     * @return
     */
    @GetMapping("/api/development/framework/skill/list/{levelId}/{year}/{term}")
    @ResponseBody
    public ApiResponse fetchFrameworkSkillList(@PathVariable("levelId") Integer levelId,
                                               @PathVariable("term") Integer term,
                                               HttpServletRequest request,
                                               @PathVariable("year") Integer year){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        FrameworkSkillDto frameworkSkillDto=new FrameworkSkillDto();
        List<DomainDto> basicSkills=settingsService.fetchFrameworkSkillList(DutyLevelSkillTypeEnum.BASIC.getId(),levelId,0,0,term);
        List<DomainDto> customSkills=settingsService.fetchFrameworkSkillList(DutyLevelSkillTypeEnum.CUSTOM.getId(),levelId,year,schoolId,term);
        frameworkSkillDto.setBasicSkills(basicSkills);
        frameworkSkillDto.setCustomSkills(customSkills);
        /*Date date=new Date();
        SimpleDateFormat formatYear=new SimpleDateFormat("yyyy");
        Integer nowYear=Integer.parseInt(formatYear.format(date));*/
        apiResponse.setData(frameworkSkillDto);
        return apiResponse;
    }

    /**
     * 保存时间设置
     * @param request
     * @param year
     * @return
     */
    @PostMapping("/api/development/session/time/save/{year}")
    @ResponseBody
    public ApiResponse saveFrameworkSkills(HttpServletRequest request,
                                           @RequestBody TimeSettingDto timeDto,
                                           @PathVariable("year") Integer year){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        if(!CollectionUtils.isEmpty(timeDto.getTimes())){
            try{
                settingsService.saveTimeSetting(timeDto.getTimes(),year,schoolId);
            }catch(ParseException e){

            }
        }
        apiResponse.setData("success!");
        return apiResponse;
    }
    /**
     * 时间设置回显
     * @param request
     * @param year
     * @return
     */
    @GetMapping("/api/development/session/time/setting/list/{year}")
    @ResponseBody
    public ApiResponse saveFrameworkSkills(HttpServletRequest request,
                                           @PathVariable("year") Integer year){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        TimeSettingDto timeSettingDto=settingsService.fetchSettingTime(year,schoolId);
        apiResponse.setData(timeSettingDto);
        return apiResponse;
    }

    /**
     * 年份列表
     *
     */
    @GetMapping("/api/development/session/time/year/list")
    @ResponseBody
    public ApiResponse saveFrameworkSkills(HttpServletRequest request){
        ApiResponse apiResponse=new ApiResponse();
        LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
        Integer schoolId=loginUser.getCenterId();
        List<Integer> list=settingsService.fetchYearList(schoolId);
        apiResponse.setData(list);
        return apiResponse;
    }
}
