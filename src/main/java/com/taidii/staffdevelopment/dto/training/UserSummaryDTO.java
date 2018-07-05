package com.taidii.staffdevelopment.dto.training;

import com.taidii.staffdevelopment.util.ExcelColumn;
import com.taidii.staffdevelopment.util.ExcelSheet;

/**
 * 员工培训个人总结
 */
public class UserSummaryDTO {
    
    private Integer id;
    
    @ExcelColumn("Staff")
    private String name;
    
    @ExcelColumn("Plan total hour")
    private Integer planHour;
    
    @ExcelColumn("Completed total hour")
    private Integer completeHour;
    
    @ExcelColumn("Course Fee")
    private Double fee;
    
    @ExcelColumn("Grant")
    private Double grant;
    
    @ExcelColumn("Absentee Payroll")
    private Double payroll;
    
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
    
    public Integer getPlanHour() {
        return planHour;
    }
    
    public void setPlanHour(Integer planHour) {
        this.planHour = planHour;
    }
    
    public Integer getCompleteHour() {
        return completeHour;
    }
    
    public void setCompleteHour(Integer completeHour) {
        this.completeHour = completeHour;
    }
    
    public Double getFee() {
        return fee;
    }
    
    public void setFee(Double fee) {
        this.fee = fee;
    }
    
    public Double getGrant() {
        return grant;
    }
    
    public void setGrant(Double grant) {
        this.grant = grant;
    }
    
    public Double getPayroll() {
        return payroll;
    }
    
    public void setPayroll(Double payroll) {
        this.payroll = payroll;
    }
}
