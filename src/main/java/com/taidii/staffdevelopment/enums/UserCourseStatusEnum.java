package com.taidii.staffdevelopment.enums;

public enum UserCourseStatusEnum {
    /**
     * INITIALIZATION 初始值
     * ABSENCE 缺席
     * ATTENDANCE 参加
     */
    INITIALIZATION(0, "initialization"),
    ABSENCE(1, "absence"),
    ATTENDANCE(2, "attendance");
    
    
    private int id;
    private String desc;
    
    UserCourseStatusEnum(int id, String desc){
        this.id =  id;
        this.desc = desc;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDesc() {
        return desc;
    }
}
