package com.taidii.staffdevelopment.error;

public enum TrainingError implements ICommonError {
    
    COURSE_NOT_FIND(10000, "Course Not Found"),
    USER_NOT_FOUND(10001,"User Not Found")
    ;
    
    final private int id;
    final private String msg;
    
    TrainingError(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }
    
    public int getId() {
        return id;
    }
    
    public String getMsg() {
        return msg;
    }
}
