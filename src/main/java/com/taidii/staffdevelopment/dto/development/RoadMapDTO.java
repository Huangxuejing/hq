package com.taidii.staffdevelopment.dto.development;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dto.development
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/13 15:24
 */
public class RoadMapDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 老师id
	 */
	private Integer id;
	/**
	 * 老师的名称
	 */
	private String teacherName;
	/**
	 * 老师当前的级别
	 */
	private String currentLevel;

	/**
	 * review date
	 */
	private String moreReviewDate;
	/**
	 *  老师还是校长
	 */
  private String roleType;

	private List<DevelopDTO> develops = new ArrayList<DevelopDTO>();

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(String currentLevel) {
		this.currentLevel = currentLevel;
	}

	public List<DevelopDTO> getDevelops() {
		return develops;
	}

	public void setDevelops(List<DevelopDTO> develops) {
		this.develops = develops;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMoreReviewDate() {
		return moreReviewDate;
	}

	public void setMoreReviewDate(String moreReviewDate) {
		this.moreReviewDate = moreReviewDate;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
}
