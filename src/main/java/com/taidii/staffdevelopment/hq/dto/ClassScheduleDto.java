package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @class: ClassScheduleDto
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/20
 */
public class ClassScheduleDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String date;
    private String time;
    private String day;
    private String program;
    private String centre;
    private int totalSeat;
    private int userSeat;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public int getUserSeat() {
        return userSeat;
    }

    public void setUserSeat(int userSeat) {
        this.userSeat = userSeat;
    }
}
