package com.taidii.staffdevelopment.hq.dto;

import java.util.Date;
import java.util.List;

/**
 * @class: ClassSchedule2Dto
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/29
 */
public class ClassSchedule2Dto {

    private Date datefrom;
    private Date dateto;
    private String program;
    private String type;
    private String centre;
    private int totalSeat;
    private int userSeat;
    private List<RepeatListDto> timeDtos;

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }

    public Date getDateto() {
        return dateto;
    }

    public void setDateto(Date dateto) {
        this.dateto = dateto;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public List<RepeatListDto> getTimeDtos() {
        return timeDtos;
    }

    public void setTimeDtos(List<RepeatListDto> timeDtos) {
        this.timeDtos = timeDtos;
    }
}
