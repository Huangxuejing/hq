package com.taidii.staffdevelopment.dto.training;

import java.io.Serializable;
import java.util.List;

/**
 * 第二级技能
 */
public class SubCategoryDTO implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;
	
    private String name;
    
    private String code;
    
    private List<TrainingNeedUserDTO> teachers;
    
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
    
    public List<TrainingNeedUserDTO> getTeachers() {
        return teachers;
    }
    
    public void setTeachers(List<TrainingNeedUserDTO> teachers) {
        this.teachers = teachers;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
}
