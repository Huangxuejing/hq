package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @class: StudentDto
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/19
 */
public class StudentDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;//标识
    private String name;//姓名
    private String gender;//性别
    private Long number;//电话
    private String enrolmentDate;//入园时间
    private int leftLessons;//剩余课时
    private String status;//状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getEnrolmentDate() {
        return enrolmentDate;
    }

    public void setEnrolmentDate(String enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    public int getLeftLessons() {
        return leftLessons;
    }

    public void setLeftLessons(int leftLessons) {
        this.leftLessons = leftLessons;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
