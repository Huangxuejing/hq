package com.taidii.staffdevelopment.entity;

/**
 * @description:评分表
 * @projectName:staff-development
 * @className:DevelopRating.java
 * @author:wentao
 * @createTime:2018年6月12日 下午4:16:50
 * @version 1.0.1
 */
public class DevelopRating extends BaseEntity{

	private static final long serialVersionUID = 1L;
	private Integer score;
    private String name;
    private String rateKeys;
    private Integer year;
    private Integer schoolId;
    private Integer period;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRateKeys() {
        return rateKeys;
    }
    public void setRateKeys(String rateKeys) {
        this.rateKeys = rateKeys;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}
}