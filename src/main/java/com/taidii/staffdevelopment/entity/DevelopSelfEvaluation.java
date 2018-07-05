package com.taidii.staffdevelopment.entity;

/**
 * @description:自评表
 * @projectName:staff-development
 * @className:DevelopSelfEvaluation.java
 * @author:wentao
 * @createTime:2018年6月13日 下午2:09:36
 * @version 1.0.1
 */
public class DevelopSelfEvaluation extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	private Integer schoolId;						//学校id
    private Integer userId;							//用户id
    private Integer dutyLevelId;					//职务id
    private String dutyLevelName;			//职务名称
    private Integer period;							//时期（1:Mid-Year ，2:Annual）
    private Integer year;							//年份
    private Integer status;							//状态（1：Pending，2：Draft，3：Submit，4：Reviewed）
    private String evaluatorComment;		//校长评论

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDutyLevelId() {
        return dutyLevelId;
    }

    public void setDutyLevelId(Integer dutyLevelId) {
        this.dutyLevelId = dutyLevelId;
    }

    public String getDutyLevelName() {
        return dutyLevelName;
    }

    public void setDutyLevelName(String dutyLevelName) {
        this.dutyLevelName = dutyLevelName == null ? null : dutyLevelName.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEvaluatorComment() {
        return evaluatorComment;
    }

    public void setEvaluatorComment(String evaluatorComment) {
        this.evaluatorComment = evaluatorComment == null ? null : evaluatorComment.trim();
    }

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}