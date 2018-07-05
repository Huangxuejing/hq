package com.taidii.staffdevelopment.dto.training;

import java.io.Serializable;
import java.util.List;

/**
 * 第一级技能
 */
public class CategoryDTO implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;
	
    private String name;
    
    private String code;
    
    private List<SubCategoryDTO> subCategorys;
    
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
    
    public List<SubCategoryDTO> getSubCategorys() {
        return subCategorys;
    }
    
    public void setSubCategorys(List<SubCategoryDTO> subCategorys) {
        this.subCategorys = subCategorys;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
}
