package com.taidii.staffdevelopment.entity;

/**'
 * @description:职务等级能力表
 * @projectName:staff-development
 * @className:DevelopDutyLevelSkill.java
 * @author:wentao
 * @createTime:2018年6月12日 下午4:15:46
 * @version 1.0.1
 */
public class DevelopDutyLevelSkill extends BaseEntity{
	private static final long serialVersionUID = 1L;
	private Integer type;
    private String name;
    private Integer depth;
    private Integer year;
    private String term;
    private Integer schoolId;
    private Integer parentId;
    private Integer lastYearSelfId;
    private String code;

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getLastYearSelfId() {
		return lastYearSelfId;
	}

	public void setLastYearSelfId(Integer lastYearSelfId) {
		this.lastYearSelfId = lastYearSelfId;
	}
}