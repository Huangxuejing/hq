package com.taidii.staffdevelopment.error;

public enum UpgradeError implements ICommonError{
	DATA_NOT_UPGRADE(30000, "Data not upgrade"),
    ;
    
    final private int id;
    final private String msg;
    
    UpgradeError(int id, String msg) {
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
