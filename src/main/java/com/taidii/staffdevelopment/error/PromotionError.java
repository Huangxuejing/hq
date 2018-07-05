package com.taidii.staffdevelopment.error;

/**
 * @version 1.0
 * @description:
 *     职务提升错误
 * @projectName: com.taidii.staffdevelopment.error
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/20 11:31
 */
public enum  PromotionError  implements ICommonError{

  NO_SET_SKILL_LEVEL(10000, "Please Set Teacher's Skill Level"),
  SAME_SKILL_LEVEL(10001, "The Same Skills,please select new skill level"),
  NO_EVALUATION_TIME(10002, "Not within evaluation time"),
  ;

  final private int id;
  final private String msg;

  PromotionError(int id, String msg) {
    this.id = id;
    this.msg = msg;
  }

  @Override
  public int getId() {
    return id;
  }
  @Override
  public String getMsg() {
    return msg;
  }
}
