package com.taidii.staffdevelopment.enums;
/**
 *  标记计划是否已完成
 * @author   wentao
 * @version
 * @see
 */
public enum MarkStatusEnum {

    UNFINISH(0, "未完成"),
    FINISH(1, "已完成");

    final private int id;
    final private String name;

    MarkStatusEnum(int id, String name) {
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

