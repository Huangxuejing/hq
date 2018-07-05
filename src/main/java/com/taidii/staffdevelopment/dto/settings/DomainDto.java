package com.taidii.staffdevelopment.dto.settings;

import java.io.Serializable;
import java.util.List;

public class DomainDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
    private String name;
    private List<CategoryDto> categorys;

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

    public List<CategoryDto> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<CategoryDto> categorys) {
        this.categorys = categorys;
    }
}
