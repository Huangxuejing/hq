package com.taidii.staffdevelopment.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taidii.staffdevelopment.commons.ApiResponse;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dto.RatingDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.AddPlanDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.CommentDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SaveSelfAchievementsDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SaveSelfPlanDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SaveSelfSkillDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationDetailDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationDutyLevelDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPlanDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPoorListDTO;
import com.taidii.staffdevelopment.error.CommonError;
import com.taidii.staffdevelopment.service.ISelfEvaluationService;
import com.taidii.staffdevelopment.util.ValidateUtil;

/**
 * @description:教师自评controller
 * @projectName:staff-development
 * @className:StaffSelfEvaluationController.java
 * @author:wentao
 * @createTime:2018年6月12日 下午5:02:45
 * @version 1.0.1
 */
@RestController
@Validated
@RequestMapping(value="/self/evaluation")
public class StaffSelfEvaluationController {
	
	@SuppressWarnings("unused")
	private Logger logger = LoggerFactory.getLogger(StaffSelfEvaluationController.class);
	
	@Autowired
	private ISelfEvaluationService selfEvaluationService;
	
	/**
	 * @description:员工自评列表
	 * @param request
	 * @param year
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月12日 下午5:15:04
	 */
	@GetMapping("/list")
	public ApiResponse list(HttpServletRequest request,@RequestParam(required=false) Integer year) 
	{
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		SelfEvaluationPoorListDTO selfEvaluationPoorListDTO = selfEvaluationService.getSelfEvaluationList(year, loginUser.getId(),loginUser.getName());
		
		return new ApiResponse(selfEvaluationPoorListDTO);
	}
	
	/**
	 * @description:获取自评详情
	 * @param request
	 * @param id
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午4:52:58
	 */
	@GetMapping("/info")
	public ApiResponse getSelfEvaluationDetail(Integer id) {
		
		SelfEvaluationDetailDTO selfEvaluationDetailDTO = selfEvaluationService.getSelfEvaluationDetail(id);
		
		return new ApiResponse(selfEvaluationDetailDTO);
	}

	/**
	 * @description:获取计划列表
	 * @param id
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午4:52:58
	 */
	@GetMapping("/plan/list")
	public ApiResponse getSelfEvaluationPlanList(Integer id) {

		List<SelfEvaluationPlanDTO> list = selfEvaluationService.getSelfEvaluationPlan(id);

		return new ApiResponse(list);
	}
	
	/**
	 * @description:获取自评那年的分数列表
	 * @param id 自评id
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午4:48:53
	 */
	@GetMapping("/rating/list")
	public ApiResponse getRatingList(Integer id) {
		
		List<RatingDTO> list = selfEvaluationService.getSelfEvaluationRating(id);
		
		return new ApiResponse(list);
	}
	
	/**
	 * @description:获取年份筛选框
	 * @param request
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 上午10:49:09
	 */
	@GetMapping("/year/list")
	public ApiResponse getYearList(HttpServletRequest request) {
		
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		List<Integer> yearList= selfEvaluationService.getYearList(loginUser.getId(),loginUser.getRoleType(),loginUser.getCenterId());
		
		return new ApiResponse(yearList);
	}
	
	/**
	 * @description:获取最新的学期
	 * @param request
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月23日 上午10:23:45
	 */
	@GetMapping("/period")
	public ApiResponse getLastPeriod(HttpServletRequest request) {
		
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		Integer period = selfEvaluationService.getLastPeriod(loginUser.getId(), loginUser.getCenterId(), loginUser.getRoleType());
		
		return new ApiResponse(period);
	}
	
	/**
	 * @description:保存能力描述或评分
	 * @param saveSkillEvidenceDTO
	 * @param result
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 上午11:12:07
	 */
	@PostMapping("/save/skill")
	public ApiResponse saveSkillEvidence(HttpServletRequest request,@RequestBody @Valid SaveSelfSkillDTO saveSkillEvidenceDTO,BindingResult result) {
		
		if(result.hasErrors()) {
			ValidateUtil.throwBeanValidationException(result, CommonError.REQUEST_PARAMETER_ERROR.getId());
		}
		
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
	 	int id = selfEvaluationService.saveOrUpdateSelfEvaluationSkill(saveSkillEvidenceDTO,loginUser.getRoleType());
		
		return new ApiResponse(id);
	}
	
	/**
	 * @description:保存用户自评成就
	 * @param saveSelfAchievementsDTO
	 * @param result
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 上午11:41:42
	 */
	@PostMapping("/save/achieve")
	public ApiResponse saveStrengthOrAchievements(HttpServletRequest request,@RequestBody @Valid SaveSelfAchievementsDTO saveSelfAchievementsDTO,BindingResult result) {
		
		if(result.hasErrors()) {
			ValidateUtil.throwBeanValidationException(result, CommonError.REQUEST_PARAMETER_ERROR.getId());
		}
		
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		int id = selfEvaluationService.saveOrUpdateSelfEvaluationReflection(saveSelfAchievementsDTO,loginUser.getRoleType());
		
		return new ApiResponse(id);
	}
	
	/**
	 * @description:删除成就
	 * @param saveSelfAchievementsDTO
	 * @param result
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月21日 下午2:17:34
	 */
	@DeleteMapping("/delete/achieve/{selfEvaluationId}/{id}")
	public ApiResponse deleteStrengthOrAchievements(HttpServletRequest request,@PathVariable Integer selfEvaluationId,@PathVariable Integer id) {
		
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		selfEvaluationService.deleteSelfEvaluationReflection(selfEvaluationId, id,loginUser.getRoleType());
		
		return new ApiResponse();
	}
	
	
	/**
	 * @description:保存计划
	 * @param saveSelfPlanDTO
	 * @param result
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 下午1:56:44
	 */
	@PostMapping("/save/plan")
	public ApiResponse savePlan(HttpServletRequest request,@RequestBody @Valid SaveSelfPlanDTO saveSelfPlanDTO,BindingResult result) {
		
		if(result.hasErrors()) {
			ValidateUtil.throwBeanValidationException(result, CommonError.REQUEST_PARAMETER_ERROR.getId());
		}
		
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		int id = selfEvaluationService.saveOrUpdateSelfEvaluationPlan(saveSelfPlanDTO,loginUser.getRoleType());
		
		return new ApiResponse(id);
	}
	
	/**
	 * @description:新增计划
	 * @param list
	 * @param result
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月21日 下午1:43:57
	 */
	@PostMapping("/add/plan")
	public ApiResponse addPlan(HttpServletRequest request,@RequestBody @Valid AddPlanDTO addPlanDTO,BindingResult result) {
		if(result.hasErrors()) {
			ValidateUtil.throwBeanValidationException(result, CommonError.REQUEST_PARAMETER_ERROR.getId());
		}
		
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		selfEvaluationService.saveOrUpdatePlan(addPlanDTO,loginUser.getRoleType());
		
		return new ApiResponse();
	}

	/**
	 * 老师提交自评
	 * @param id
	 * @auther 衷文涛
     */
	@PutMapping("/submit/{id}")
	public ApiResponse subimtSelfEvaluation(HttpServletRequest request,@PathVariable Integer id) {

		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		selfEvaluationService.submitSelfEvaluation(id,loginUser.getRoleType());
		
		return new ApiResponse();
	}
	
	/**
	 * @description:保存评论
	 * @param commentDTO
	 * @param result
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月22日 上午10:32:26
	 */
	@PostMapping("/save/comment")
	public ApiResponse saveOrUpdateCommont(HttpServletRequest request,@RequestBody @Valid CommentDTO commentDTO,BindingResult result) {
		
		if(result.hasErrors()) {
			ValidateUtil.throwBeanValidationException(result, CommonError.REQUEST_PARAMETER_ERROR.getId());
		}
		
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		selfEvaluationService.saveSelfEvaluationComment(commentDTO, loginUser.getRoleType());
		
		return new ApiResponse();
	}
	
	/**
	 * @description:校长获取所有老师自评
	 * @param year
	 * @param period
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月22日 下午1:43:52
	 */
	@GetMapping("/all/list")
	public ApiResponse getAllList(HttpServletRequest request,@RequestParam Integer year,@RequestParam Integer period) {
		
		LoginUser loginUser = (LoginUser)request.getSession().getAttribute(Constants.USER_LOGIN_);
		
		List<SelfEvaluationDutyLevelDTO> list = selfEvaluationService.getAllSelfEvaluation(year, period, loginUser.getCenterId());
		
		return new ApiResponse(list);
	}
	
}
