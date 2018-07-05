package com.taidii.staffdevelopment.enums;

public enum SkillDepthEnum {
    DOMAIN(1, "domain"),
    CATEGORY(2,"category"),
    SKILL(3, "skill");

    private int id;
    private String desc;

    SkillDepthEnum(int id, String desc){
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
