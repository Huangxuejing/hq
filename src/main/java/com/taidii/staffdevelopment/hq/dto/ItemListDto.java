package com.taidii.staffdevelopment.hq.dto;

import io.swagger.models.auth.In;

import java.io.Serializable;

/**
 * @class: ItemListDto
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/25
 */
public class ItemListDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String level;
    private String course;
    private Long amount;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
