package com.taidii.staffdevelopment.dao;

import com.taidii.staffdevelopment.dto.development.SKillDetailDTO;
import com.taidii.staffdevelopment.dto.development.SkillTrainDTO;
import com.taidii.staffdevelopment.dto.development.TeacherInfoDTO;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dao
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/19 11:31
 */
public interface IProfessionalDevelopDAO {

 public TeacherInfoDTO fetchNameAndDutyName(Integer userId);

 public List<SKillDetailDTO> fetchImprovePlan(Integer evaluationId);

 public List<SKillDetailDTO> fetchParentSkill(List<Integer> secondIds);

 /**
  *  获取训练计划总课时
  * @param evaluationId
  * @return
   */
 public  Integer summaryTrainHours(Integer evaluationId);

 /**
  *  二级Skill与训练课程时间
  * @param evaluationId
  * @return
   */
 public List<SkillTrainDTO> fetchSkillTrain(Integer evaluationId);

 /**
  *  获取用户最后一次评估的id
  * @param userId
  * @return
   */
  public  Integer fetchLastId(Integer userId);
}
