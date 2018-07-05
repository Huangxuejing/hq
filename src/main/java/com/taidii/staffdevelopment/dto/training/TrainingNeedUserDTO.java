package com.taidii.staffdevelopment.dto.training;

import java.io.Serializable;

/**
 * 需要提高技能的人员
 * @author GongYu
 * @date 2018/6/19
 */
public class TrainingNeedUserDTO implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;
    private String name;
    private String pic;
    private Integer status;
    private Integer evaluationId;
    
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
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public Integer getEvaluationId() {
        return evaluationId;
    }
    
    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }
}
