package com.taidii.staffdevelopment.error;

/**
 * @class: ProductbundleError
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/22
 */
public enum ProductbundleError implements ICommonError{
    NO_HQ(10000, "no permission"),
    SAVE_FAIL(10000, "save fail"),
    NO_SELECT_COURSEORLEVEL(10000, "no select course and level"),
    NO_PRODUCTBUNDLE(10000, "product bundle not exist "),
    NO_EXIST_CLASS(10000, "class not exist")
    ;

    final private int id;
    final private String msg;

    ProductbundleError(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    @Override
    public int getId() {
        return id;
    }
    @Override
    public String getMsg() {
        return msg;
    }
}

