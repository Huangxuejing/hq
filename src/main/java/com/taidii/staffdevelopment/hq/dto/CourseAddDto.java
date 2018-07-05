package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;
import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;

public class CourseAddDto implements Serializable{
	private static final long serialVersionUID = 5734766268385117438L;
	/**
	 * 课程名称
	 */
	private String courseName;
	/**
	 * 课程等级
	 */
	private List<OptionDTO> courseLevels;
	/**
	 * 所有centerscenter hq下
	 */
	private List<OptionDTO> applyTo;
	/**
	 * center作用域下创建课程需要的老师
	 */
	private List<OptionDTO> teacher;
	/**
	 * center作用域下创建课程补课上限
	 */
	private Integer capcity;
	/**
	 * 是否应用于所有的课程
	 */
	private Integer apply;

	public List<OptionDTO> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<OptionDTO> teacher) {
		this.teacher = teacher;
	}
	public Integer getCapcity() {
		return capcity;
	}
	public void setCapcity(Integer capcity) {
		this.capcity = capcity;
	}
	public Integer getApply() {
		return apply;
	}
	public void setApply(Integer apply) {
		this.apply = apply;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public List<OptionDTO> getCourseLevels() {
		return courseLevels;
	}
	public void setCourseLevels(List<OptionDTO> courseLevels) {
		this.courseLevels = courseLevels;
	}
	public List<OptionDTO> getApplyTo() {
		return applyTo;
	}
	public void setApplyTo(List<OptionDTO> applyTo) {
		this.applyTo = applyTo;
	}
}
