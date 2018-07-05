package com.taidii.staffdevelopment.dao.mapper.custom;

import com.taidii.staffdevelopment.dto.development.SKillDetailDTO;
import com.taidii.staffdevelopment.dto.development.SkillTrainDTO;
import com.taidii.staffdevelopment.dto.development.TeacherInfoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dao.mapper.custom
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/20 15:13
 */
@Mapper
public interface ProfessionalDevelopMapper2 {
  /**
   *  通过用户id 获取用户名称和用户的职务级别
   * @param userId
   * @return
   * @ @author tannc
   * @create-time 2018-06-20 15:15:44
   */
  public  TeacherInfoDTO fetchNameAndDutyName(@Param("userId") Integer userId);

  public List<SKillDetailDTO> fetchImprovePlan(@Param("evaluationId")  Integer evaluationId);

  public  List<SKillDetailDTO> fetchParentSkill( @Param("ids") List<Integer> ids);

  public Integer summaryTrainHours( @Param("evaluationId")  Integer evaluationId);
  /**
   * @description:  
   *    获取训练的时间
   * @author:谭农春
   * @createTime: 2018/6/21 17:10 
   */
  public List<SkillTrainDTO> fetchSkillTrain(@Param("evaluationId") Integer evaluationId ,@Param("isDelete") Integer isDelete);

  public Integer fetchLastId(@Param("userId") Integer userId, @Param("isDelete") Integer isDelete, @Param("status") Integer status);
}
