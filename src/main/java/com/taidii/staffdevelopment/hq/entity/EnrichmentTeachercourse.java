package com.taidii.staffdevelopment.hq.entity;

public class EnrichmentTeachercourse {
	
    private Integer id;
    /**
     * Account_teacher 的主键ID
     */
    private Integer teacherId;

    private Integer courseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}