package com.taidii.staffdevelopment.service;

import com.taidii.staffdevelopment.dto.development.RoadMapDTO;
import com.taidii.staffdevelopment.dto.development.RoadUpdateContentDTO;
import com.taidii.staffdevelopment.dto.development.SKillDetailDTO;
import com.taidii.staffdevelopment.dto.development.TeacherInfoDTO;

import java.util.List;

/**
 * @version 1.0
 * @description:
 *
 * @projectName: com.taidii.staffdevelopment.service
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/13 15:04
 */
public interface IProfessionalDevelopService {

  /**
   * @description:  
   *    
   * @param teacherId
   *          -- 老师对应的用户id
   * @author:谭农春
   * @createTime: 2018/6/13 15:05 
   */
 public RoadMapDTO fetchRoadMap(Integer teacherId);

  /**
   *  职业提升
   * @param userId
   *        -- 提升的用户id
   * @param promotion
   *        -- 职务名称
   */
  public  String promotion(Integer userId, String promotion);

  /**
   *  标记为已完成
   * @param selfEvaluationPlanId
   * @return
   * @ @author tannc
   * @create-time 2018-06-20 15:48:49
   */
  public String markAsComplete(Integer selfEvaluationPlanId);
   
 /**
  * @description:  
  *     获取评估详情
  * @param evaluationId
  *         -- 自评id
  * @param userId
  * @author:谭农春
  * @createTime: 2018/6/20 16:29 
  */
  public List<SKillDetailDTO> fetchDetails(Integer evaluationId, Integer userId);
   
 /**
  * @description:  
  *     通过用户id获取用户信息以及训练总工时
  * @param   userId
  *        -- 用户id
  * @author:谭农春
  * @createTime: 2018/6/21 11:44 
  */
 
  public TeacherInfoDTO fetchTeacherInfo(Integer userId,Integer evaluationId);
  
 /**
  * @description:  
  *     更RoadMap
  * @param plans
  *         -- 计划的更新内容
  * @author:谭农春
  * @createTime: 2018/6/22 11:26 
  */
 
  public  void roadUpdateContent(List<RoadUpdateContentDTO> plans);
}
