package com.taidii.staffdevelopment.dto.development;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.taidii.staffdevelopment.util.DateUtils;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dto.development
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/21 17:03
 */
public class SkillTrainDTO implements Serializable {
	private static final long serialVersionUID = 1L;
// 二级 Skill
  private Integer dutyLevelSkillId;
  // 用户参与课程时间
  private Date gmtModify;
  private String gmtModifyDesc;
  // 是计划还是正式的课程
   private Integer status ;

  public Integer getDutyLevelSkillId() {
    return dutyLevelSkillId;
  }

  public void setDutyLevelSkillId(Integer dutyLevelSkillId) {
    this.dutyLevelSkillId = dutyLevelSkillId;
  }

  /**
   *  最后的修改时间
   * @return
   */
  @JsonFormat(pattern = "dd/MM/yyyy", timezone = "GMT+8", locale = "en")
  public Date getGmtModify() {
    return gmtModify;
  }

  public void setGmtModify(Date gmtModify) {
    this.gmtModify = gmtModify;
  }

  public String getGmtModifyDesc() {
    return DateUtils.mmddyyy(gmtModify);
  }

  public void setGmtModifyDesc(String gmtModifyDesc) {
    this.gmtModifyDesc = gmtModifyDesc;
  }

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }
}
