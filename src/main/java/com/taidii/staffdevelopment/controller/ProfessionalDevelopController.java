package com.taidii.staffdevelopment.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taidii.staffdevelopment.commons.ApiResponse;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dto.development.RoadMapDTO;
import com.taidii.staffdevelopment.dto.development.RoadUpdateContentDTO;
import com.taidii.staffdevelopment.dto.development.SKillDetailDTO;
import com.taidii.staffdevelopment.dto.development.TeacherInfoDTO;
import com.taidii.staffdevelopment.dto.development.TrainDTO;
import com.taidii.staffdevelopment.service.IProfessionalDevelopService;
import com.taidii.staffdevelopment.service.ITrainingService;

/**
 * @version 1.0
 * @description:
 *    教师提升
 * @projectName: com.taidii.staffdevelopment.controller
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/13 13:54
 */
@RestController
@RequestMapping("/api/development")
public class ProfessionalDevelopController {
 @Autowired
 private IProfessionalDevelopService professionalDevelopService;
 @Autowired
 private ITrainingService trainingService;

 /**
  * 员工发展RoadMap
  * @param userId
  *    --老师对应的用户id(auth_user.id)
  *   roaddetail
  * @return
   */
 @GetMapping("roadmap")
 public RoadMapDTO developRoadMap(@RequestParam(value = "userId",required = false) Integer userId, HttpServletRequest request){
    RoadMapDTO roadMapDTO = new RoadMapDTO();
    LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
    if(userId.equals(0)){
       userId = loginUser.getId();
     }
    roadMapDTO = professionalDevelopService.fetchRoadMap(userId);
    //角色type
    roadMapDTO.setRoleType(loginUser.getRoleType());
    return  roadMapDTO;
 }

  /**
   * 加载员工信息以及训练汇总时间
   * @param userId
   *    --老师对应的用户id(auth_user.id)
   *   roaddetail
   * @return
   */
  @GetMapping("train")
  public ApiResponse trainInfo(@RequestParam(value = "userId") Integer userId,
                               @RequestParam(value = "evaluationId") Integer evaluationId,HttpServletRequest request){
    ApiResponse response = new ApiResponse();
    TeacherInfoDTO dto = professionalDevelopService.fetchTeacherInfo(userId,evaluationId);
    LoginUser loginUser = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
    if(null!= loginUser){
      dto.setRoleType(loginUser.getRoleType());
    }
    response.setData(dto);
    return  response;
  }

 /**
  *  老师职业提升
  * @param userId
  *    --老师对应的用户id(auth_user.id)
  *   roaddetail
  * @return
  */
 @GetMapping("promotion")
 public ApiResponse promotion(@RequestParam(value = "teacherId") Integer userId,
                              @RequestParam(value = "promotion") String promotion){
  ApiResponse response = new ApiResponse();
   String name= professionalDevelopService.promotion(userId,promotion);
  response.setMsg("success");
  // 新职务
  response.setData(name);
  return  response;
 }


 /**
  * 员工提升
  * @param evaluationId
  *
  * @return
  */
 @GetMapping("roaddetail")
 public ApiResponse developRoadMapDetail(@RequestParam(value = "evaluationId",required = false) Integer evaluationId,@RequestParam(value = "userId") Integer userId){
   ApiResponse apiresponse = new ApiResponse();
  // fetch improve plan
   List<SKillDetailDTO> detailDTOList = professionalDevelopService.fetchDetails(evaluationId,userId);
   apiresponse.setData(detailDTOList);
   return  apiresponse;
 }

  /**
   *  标记为已完成
   * @param selfEvaluationPlanId
   *          -- 自我评估提升
   * @return
   */
  @GetMapping("markstatus")
  public ApiResponse markAsComplete(@RequestParam(value = "selfEvaluationPlanId",required = false) Integer selfEvaluationPlanId){
   ApiResponse apiResponse = new ApiResponse();
   String date = professionalDevelopService.markAsComplete(selfEvaluationPlanId);
   // 同步日期
   apiResponse.setData(date);
   return apiResponse;
  }

  /**
   *  RoadMap 添加训练课程
   * @param trainDTO
   *    --训练课程的内容
   * @return
   */
  @PostMapping("roadmap/train/save")
  public ApiResponse trainSave(@RequestBody TrainDTO trainDTO,HttpServletRequest request){
    ApiResponse response = new ApiResponse();
    //添加当前用户所在的学校
    LoginUser user = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
    if(null !=user){
      trainDTO.setCentreId(user.getCenterId());
    }
    trainingService.addRoadMapCourse(trainDTO);
    return  response;
  }


  /**
   *  RoadMap Detail  保存详情
   * @param plans
   *    --训练课程的内容
   * @return
   */
  @PostMapping("roadmap/detail/save")
  public ApiResponse detailSave(@RequestBody List<RoadUpdateContentDTO>  plans){
    ApiResponse response = new ApiResponse();
    professionalDevelopService.roadUpdateContent(plans);
    return  response;
  }
}

