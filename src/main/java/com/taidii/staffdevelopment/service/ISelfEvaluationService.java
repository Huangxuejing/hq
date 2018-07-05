package com.taidii.staffdevelopment.service;

import java.util.List;

import com.taidii.staffdevelopment.dto.RatingDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.*;
import com.taidii.staffdevelopment.entity.DevelopTimeSetting;

public interface ISelfEvaluationService {

	/**
	 * @description:获取用户自评列表
	 * @param year
	 * @param userId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月12日 下午5:17:30
	 */
	public SelfEvaluationPoorListDTO getSelfEvaluationList(Integer year,Integer userId,String name);
	
	/**
	 * @description:获取自己自评年汇总
	 * @param userId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 上午10:22:24
	 */
	public List<Integer> getYearList(Integer userId,String roleType,Integer schoolId);
	
	/**
	 * @description:通过自评id获取自评详情
	 * @param id
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 上午11:47:09
	 */
	public SelfEvaluationDetailDTO getSelfEvaluationDetail(Integer id);
	
	/**
	 * @description:通过自评获取对应时间的评分
	 * @param id
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月13日 下午5:00:05
	 */
	public List<RatingDTO> getSelfEvaluationRating(Integer id);
	
	/**
	 * @description:更新或保存自评能力
	 * @param saveSkillEvidenceDTO
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 上午9:24:04
	 */
	public int saveOrUpdateSelfEvaluationSkill(SaveSelfSkillDTO saveSkillEvidenceDTO,String roleType);
	
	/**
	 * @description:保存用户成就或特长
	 * @param saveSelfAchievementsDTO
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 上午11:28:38
	 */
	public int saveOrUpdateSelfEvaluationReflection(SaveSelfAchievementsDTO saveSelfAchievementsDTO,String roleTpe);
	
	/**
	 * @description:删除用户成就
	 * @param selfEvaluationId
	 * @param id
	 * @author: 衷文涛
	 * @createTime:2018年6月21日 下午2:20:48
	 */
	public void deleteSelfEvaluationReflection(Integer selfEvaluationId,Integer id,String roleType);
	
	/**
	 * @description:新增或删除计划
	 * @param addPlanDTO
	 * @author: 衷文涛
	 * @createTime:2018年6月21日 下午1:45:38
	 */
	public void saveOrUpdatePlan(AddPlanDTO addPlanDTO,String roleType);
	
	/**
	 * @description:用户保存计划
	 * @param saveSelfPlanDTO
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 下午1:57:49
	 */
	public int saveOrUpdateSelfEvaluationPlan(SaveSelfPlanDTO saveSelfPlanDTO,String roleType);

	/**
	 * 获取用户自评所有计划
	 * @param selfEvaluationId
	 * @return
     */
	public List<SelfEvaluationPlanDTO> getSelfEvaluationPlan(Integer selfEvaluationId);

	/**
	 * @description:提交用户自评
	 * @param id
	 * @author: 衷文涛
	 * @createTime:2018年6月14日 下午2:23:00
	 */
	public void submitSelfEvaluation(Integer id,String roleType);
	
	/**
	 * @description:保存校长评论
	 * @param commentDTO
	 * @author: 衷文涛
	 * @createTime:2018年6月22日 上午10:33:15
	 */
	public void saveSelfEvaluationComment(CommentDTO commentDTO,String roleType);
	
	/**
	 * @description:获取老师自评结果列表
	 * @param year
	 * @param period
	 * @param schoolId
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月22日 下午2:57:25
	 */
	public List<SelfEvaluationDutyLevelDTO> getAllSelfEvaluation(Integer year,Integer period,Integer schoolId);
	
	/**
	 * @description:获取最新学期
	 * @param userId
	 * @param schoolId
	 * @param roleType
	 * @return
	 * @author: 衷文涛
	 * @createTime:2018年6月23日 上午10:13:08
	 */
	public Integer getLastPeriod(Integer userId,Integer schoolId,String roleType);
	
	/**
	 * @description:过期自评
	 * @param developTimeSettingList
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午11:41:33
	 */
	public void overdueSelfEvaluation(List<DevelopTimeSetting>developTimeSettingList);
	
	/**
	 * @description:过期老师自评
	 * @param developTimeSettingList
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午11:41:33
	 */
	public void overdueTeacherSelfEvaluation(List<DevelopTimeSetting>developTimeSettingList);
	
	/**
	 * @description:根据学校时间设置，推送自评
	 * @param developTimeSettingList
	 * @author: 衷文涛
	 * @createTime:2018年6月25日 上午9:23:22
	 */
	public void pushSelfEvaluation(List<DevelopTimeSetting>developTimeSettingList);
}
