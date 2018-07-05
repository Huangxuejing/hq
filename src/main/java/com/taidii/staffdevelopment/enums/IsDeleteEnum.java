package com.taidii.staffdevelopment.enums;
/**
 * 通用删除枚举
 * @author   wentao
 * @version
 * @see
 */
public enum IsDeleteEnum {
    NORMAL(0, "正常"),
    DELETEED(1, "已删除");

    final private int id;
    final private String name;

    IsDeleteEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

