package com.taidii.staffdevelopment.hq.dto;

import java.util.List;

/**
 * @class: ClassListDto
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/26
 */
public class ClassListDto {
    private Integer id;
    private String name;
    private int studentNumber;//
    private String teacher;//
    private String startClass;
    private String room;
    private Long price;
    private String type;//
    private List<RepeatListDto> listDtos;//

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

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStartClass() {
        return startClass;
    }

    public void setStartClass(String startClass) {
        this.startClass = startClass;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<RepeatListDto> getListDtos() {
        return listDtos;
    }

    public void setListDtos(List<RepeatListDto> listDtos) {
        this.listDtos = listDtos;
    }
}
