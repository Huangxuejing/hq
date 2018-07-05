package com.taidii.staffdevelopment.enums;
/**
 * 是否可以编辑的枚举类
 * @author   wentao
 * @version
 * @see
 */
public enum EditableEnum {
    NO(0, "不能编辑"),
    YES(1, "可以编辑");

    final private int id;
    final private String name;

    EditableEnum(int id, String name) {
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

