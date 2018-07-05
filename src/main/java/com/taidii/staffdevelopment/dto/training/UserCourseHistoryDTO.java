package com.taidii.staffdevelopment.dto.training;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 教师上课历史详情
 */
public class UserCourseHistoryDTO implements Serializable{

    private Integer id;
    
    private String name;
    
    private String pic;
    
    @JsonFormat(pattern = "d'th' MMM.yyyy",timezone = "GMT+8", locale = "en")
    private Date birth;
    
    private String designation;
    
    private String classes;
    
    private List<CourseDTO> history;
    
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
    
    public String getPic() {
        return pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }
    
    public Date getBirth() {
        return birth;
    }
    
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String getClasses() {
        return classes;
    }
    
    public void setClasses(String classes) {
        this.classes = classes;
    }
    
    public List<CourseDTO> getHistory() {
        return history;
    }
    
    public void setHistory(List<CourseDTO> history) {
        this.history = history;
    }
}
