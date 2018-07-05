package com.taidii.staffdevelopment.error;

public enum SettingsError implements ICommonError {

    SCORE_REPEAT_ERROR(10000, "score repeat_error"),
    CATEGORY_CANNOT_NULL_ERROR(10000, "category can not be null"),
    DOMAIN_CANNOT_NULL_ERROR(10000, "domain can not be null"),
    SKILL_NAME_CANNOT_NULL_ERROR(10000, "skill name can not be null"),
    GUIDING_QUESTIONS_CANNOT_NULL_ERROR(10000, "guiding questions can not be null"),
    DATE_PARSE_ERROR(10000, "date parse error"),
    DATE_REPEAT_ERROR(10000, "date repeat error"),
    ;

    final private int id;
    final private String msg;

    SettingsError(int id, String msg) {
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
