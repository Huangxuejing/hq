package com.taidii.staffdevelopment.dto.settings;
import java.util.List;

public class TimeSettingDto {

    private String nowYear;
    private Boolean flag;
    private List<SessionTimeDto> times;

    public String getNowYear() {
        return nowYear;
    }

    public void setNowYear(String nowYear) {
        this.nowYear = nowYear;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public List<SessionTimeDto> getTimes() {
        return times;
    }

    public void setTimes(List<SessionTimeDto> times) {
        this.times = times;
    }
}
