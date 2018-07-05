package com.taidii.staffdevelopment.entity;

import java.util.Date;

public class DevelopTimeSetting extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	private Integer year;			//年份
    private Integer period;			//学期
    private Integer schoolId;		//学校id
    private Date startTime;		//自评开始时间
    private Date endTime;			//自评结束时间
    private Date teacherEndTime;			//自评结束时间
    private Date executionTime;		//最后执行时间
    private Integer executionNum;	//执行次数

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

	public Date getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}

	public Integer getExecutionNum() {
		return executionNum;
	}

	public void setExecutionNum(Integer executionNum) {
		this.executionNum = executionNum;
	}

	public Date getTeacherEndTime() {
		return teacherEndTime;
	}

	public void setTeacherEndTime(Date teacherEndTime) {
		this.teacherEndTime = teacherEndTime;
	}
}