package com.taidii.staffdevelopment.enums;

/**
 *  角色类型
 */
public enum RoleTypeEnum {

    teacher("teacher", "Teacher"),
    leader("leader", "Leader");

    private String id;
    private String desc;

    RoleTypeEnum(String id, String desc){
        this.id =  id;
        this.desc = desc;
    }
    
    public String getId() {
        return id;
    }
    
    public String getDesc() {
        return desc;
    }
}
