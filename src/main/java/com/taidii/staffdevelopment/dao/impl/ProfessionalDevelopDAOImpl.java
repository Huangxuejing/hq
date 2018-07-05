package com.taidii.staffdevelopment.dao.impl;
import com.taidii.staffdevelopment.dao.IProfessionalDevelopDAO;
import com.taidii.staffdevelopment.dao.mapper.custom.ProfessionalDevelopMapper2;
import com.taidii.staffdevelopment.dto.development.SKillDetailDTO;
import com.taidii.staffdevelopment.dto.development.SkillTrainDTO;
import com.taidii.staffdevelopment.dto.development.TeacherInfoDTO;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;
import com.taidii.staffdevelopment.enums.SelfEvaluationStatusEnum;
import com.taidii.staffdevelopment.enums.UserCourseStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dao.impl
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/19 16:23
 */
@Service
public class ProfessionalDevelopDAOImpl implements IProfessionalDevelopDAO {

  @Autowired
  private ProfessionalDevelopMapper2 professionalDevelopMapper2;

  @Override
  public TeacherInfoDTO fetchNameAndDutyName(Integer userId) {
    return professionalDevelopMapper2.fetchNameAndDutyName( userId);
  }

  @Override
  public List<SKillDetailDTO> fetchImprovePlan(Integer evaluationId) {
    return professionalDevelopMapper2.fetchImprovePlan(evaluationId);
  }

  @Override
  public List<SKillDetailDTO> fetchParentSkill(List<Integer> secondIds) {
    if(!CollectionUtils.isEmpty(secondIds)){
      return professionalDevelopMapper2.fetchParentSkill(secondIds);
    }
    return null;
  }

  /**
   * 获取训练计划总课时
   *
   * @param evaluationId
   *
   * @return
   */
  @Override
  public Integer summaryTrainHours(Integer evaluationId) {
     return professionalDevelopMapper2.summaryTrainHours(evaluationId);
  }

  /**
   * 获取训练计划总课时
   *
   * @param evaluationId
   *
   * @return
   */
  @Override
  public List<SkillTrainDTO> fetchSkillTrain(Integer evaluationId) {
    return professionalDevelopMapper2.fetchSkillTrain(evaluationId,IsDeleteEnum.NORMAL.getId());
  }

  /**
   * 获取用户最后一次评估的id
   *
   * @param userId
   *
   * @return
   */
  @Override
  public Integer fetchLastId(Integer userId) {
    return professionalDevelopMapper2.fetchLastId(userId, IsDeleteEnum.NORMAL.getId(), SelfEvaluationStatusEnum.REVIEWED.getId());
  }
}