package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;

public class ClassAddDTO implements Serializable{

	private static final long serialVersionUID = -1752424461305250450L;
	/**
	 * 课程，存储的是课程id(id),课程名称(name)
	 */
	private OptionDTO course;
	/**
	 * 课程的等级，课程等级id(id)，等级名称(name)
	 */
	private OptionDTO courseLevel;
	/**
	 * 班级名称
	 */
	private String className;
	/**
	 * 付费方式0 按期   1 按课时  2 按学期  3 按月 
	 */
	private Integer payType;
	/**
	 * TuitionStandard 学费标准
	 */
	private BigDecimal tuitionStandard;
	/**
	 * 开始时间
	 */
	private Date dateFrom;
	
	/**
	 * 结束时间
	 */
	private Date dateTo;
	/**
	 * 报名时间是否待定，true待定  false 不待定
	 */
	private Boolean datePending; 
	/**
	 * 上课时间设置
	 */
	private List<TimeDto> classStart;
	/**
	 * 课时
	 */
	private Integer totalLesson;
	/**
	 * 教室 id room_id   name:教室名称
	 */
	private OptionDTO room;
	/**
	 * 班级人数
	 */
	private Integer capaCity;
	/**
	 * id:teacher_id name:teachername
	 */
	private OptionDTO teacher;
	/**
	 * 助教
	 */
	private OptionDTO asistantTeacher;
	public OptionDTO getCourse() {
		return course;
	}
	public void setCourse(OptionDTO course) {
		this.course = course;
	}
	public OptionDTO getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(OptionDTO courseLevel) {
		this.courseLevel = courseLevel;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	
	public BigDecimal getTuitionStandard() {
		return tuitionStandard;
	}
	public void setTuitionStandard(BigDecimal tuitionStandard) {
		this.tuitionStandard = tuitionStandard;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public List<TimeDto> getClassStart() {
		return classStart;
	}
	public void setClassStart(List<TimeDto> classStart) {
		this.classStart = classStart;
	}
	public Integer getTotalLesson() {
		return totalLesson;
	}
	public void setTotalLesson(Integer totalLesson) {
		this.totalLesson = totalLesson;
	}
	public OptionDTO getRoom() {
		return room;
	}
	public void setRoom(OptionDTO room) {
		this.room = room;
	}
	public Integer getCapaCity() {
		return capaCity;
	}
	public void setCapaCity(Integer capaCity) {
		this.capaCity = capaCity;
	}
	public OptionDTO getTeacher() {
		return teacher;
	}
	public void setTeacher(OptionDTO teacher) {
		this.teacher = teacher;
	}
	public OptionDTO getAsistantTeacher() {
		return asistantTeacher;
	}
	public void setAsistantTeacher(OptionDTO asistantTeacher) {
		this.asistantTeacher = asistantTeacher;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Boolean getDatePending() {
		return datePending;
	}
	public void setDatePending(Boolean datePending) {
		this.datePending = datePending;
	}
}
