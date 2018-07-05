package com.taidii.staffdevelopment.hq.dto;

import java.util.List;

/**
 * @class: CourseLevelDto
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/21
 */
public class CourseLevelDto {
    private Integer courseId;
    private String courseName;
    private List<LevelDto> levelDtos;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<LevelDto> getLevelDtos() {
        return levelDtos;
    }

    public void setLevelDtos(List<LevelDto> levelDtos) {
        this.levelDtos = levelDtos;
    }
}
