package com.taidii.staffdevelopment.hq.service.impl;

import java.math.BigDecimal;
import java.util.*;

import com.taidii.staffdevelopment.hq.dto.*;
import com.taidii.staffdevelopment.util.DateDayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.error.ProductbundleError;
import com.taidii.staffdevelopment.hq.dao.*;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;
import com.taidii.staffdevelopment.hq.entity.HqHqaccount;
import com.taidii.staffdevelopment.hq.service.IClassService;
import com.taidii.staffdevelopment.util.DateUtils;

/**
 * @class: ClassServiceImpl
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/19
 */
@Service
public class ClassServiceImpl implements IClassService {

    @Autowired
    private IClassDao classDao;

    @Autowired
    ICenterDao centerDao;

    @Autowired
    IAccountsTeacherDao accountsTeacherDao;

    @Autowired
    IRoomDao roomDao;

    @Autowired
    IEnrichmentClassDao enrichmentClassDao;

    @Override
    public List<ClassListDto> getClassList(LoginUser loginUser, Integer type, Integer year, Integer isStart, Integer repeat, String keyWord, Integer courseId, Integer centreId) {
        Integer hqId = getHqId(loginUser);
        List<ClassListDto> listDtos;
        if (keyWord == "") {
            keyWord = null;
        }
        if (type == 0) {
            //centre
            listDtos = classDao.getClassListByCenter(centreId, year, isStart, repeat, keyWord, courseId);
        } else {
            //all
            listDtos = classDao.getClassListByHq(hqId, year, isStart, repeat, keyWord, courseId);
        }
        if (listDtos != null && listDtos.size() > 0) {
            for (ClassListDto classListDto : listDtos) {
                classListDto.setType(getType(classListDto.getType()));
                List<RepeatListDto> list = classListDto.getListDtos();
                if (list != null && list.size() > 0) {
                    for (RepeatListDto dto : list) {
                        dto.setRepeat(getrepeat2(dto.getRepeat()));
                    }
                }
                classListDto.setStudentNumber(classDao.getStudentNumber(classListDto.getId()));
                if (null != classListDto.getTeacher()) {
                    classListDto.setTeacher(accountsTeacherDao.getTeacherNameByteacherId(Integer.parseInt(classListDto.getTeacher())));
                }
                Integer roomId = enrichmentClassDao.getRoomByClassId(classListDto.getId());
                //查看是否被修改过
                if (roomId != null) {
                    roomDao.getRoomNameByRoomId(roomId);
                } else if (null != classListDto.getRoom()) {
                    roomDao.getRoomNameByRoomId(Integer.parseInt(classListDto.getRoom()));
                }
            }
        }
        return listDtos;
    }

    private String getType(String type) {
        String str;
        switch (type) {
            case "0":
                str = "期";
                break;
            case "1":
                str = "课时";
                break;
            case "2":
                str = "学期";
                break;
            case "3":
                str = "月";
                break;
            default:
                str = "";
        }
        return str;
    }

    @Override
    public List<StudentDto> getStudentByClassId(Integer classId) {
        if (null == classDao.getClassByClassId(classId)) {
            throw new BizException(ProductbundleError.NO_EXIST_CLASS);
        }
        List<StudentDto> studentDtoList = classDao.getStudentByClassId(classId);
        for (StudentDto studentDto : studentDtoList) {
            StatusDto statusDto = classDao.getStudentStatus(classId, studentDto.getId());
            if (null != statusDto.getStatus1() && statusDto.getStatus1().after(new Date())) {
                studentDto.setStatus("Pre Enrolled");
            } else if (null != statusDto.getStatue2() && statusDto.getStatue2().after(new Date())) {
                studentDto.setStatus("Pre End Class");
            } else {
                studentDto.setStatus("Enrolled");
            }
        }
        return studentDtoList;
    }

    @Override
    public List<ClassScheduleDto> getClassSchedule(LoginUser loginUser,Integer classId, int type) {
        Integer hqId = getHqId(loginUser);
        List<ClassScheduleDto> dtoList = new ArrayList<>();
        List<ClassSchedule2Dto> classSchedule2Dtos;
        if (type == 0) {
             classSchedule2Dtos = classDao.getClassSchedule(classId);

        }else{
            classSchedule2Dtos = classDao.getClassSchedule(hqId,classId);
        }
        for (ClassSchedule2Dto dto : classSchedule2Dtos) {
            ClassScheduleDto classScheduleDto = new ClassScheduleDto();
            if (null == dto.getDateto()) {
                if ("3".equals(dto.getType())) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(dto.getDatefrom());
                    cal.set(Calendar.DAY_OF_MONTH, 1);
                    cal.add(Calendar.MONTH, 1);
                    cal.add(Calendar.DAY_OF_MONTH, -1);
                    dto.setDateto(cal.getTime());
                } else {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(dto.getDatefrom());
                    cal.add(Calendar.MONTH, 3);
                    dto.setDateto(cal.getTime());
                }
            }
            classScheduleDto.setUserSeat(dto.getUserSeat());
            classScheduleDto.setTotalSeat(dto.getTotalSeat());
            classScheduleDto.setCentre(dto.getCentre());
            classScheduleDto.setProgram(dto.getProgram());
            for (RepeatListDto repeat : dto.getTimeDtos()) {
                String datefrom = DateUtils.dateToString(dto.getDatefrom(), "yyyy-MM-dd");
                String dateto = DateUtils.dateToString(dto.getDateto(), "yyyy-MM-dd");
                String week = getrepeat(repeat.getRepeat());
                List<String> stringList = DateDayUtil.getDates(datefrom, dateto, week);
                for (String str : stringList) {
                    classScheduleDto.setDate(str);
                    classScheduleDto.setDay(getrepeat2(repeat.getRepeat()));
                    classScheduleDto.setTime(repeat.getStartTime());

                    ClassScheduleDto scheduleDto = new ClassScheduleDto();
                    scheduleDto.setDate(classScheduleDto.getDate());
                    scheduleDto.setProgram(classScheduleDto.getProgram());
                    scheduleDto.setCentre(classScheduleDto.getCentre());
                    scheduleDto.setTotalSeat(classScheduleDto.getTotalSeat());
                    scheduleDto.setUserSeat(classScheduleDto.getUserSeat());
                    scheduleDto.setTime(classScheduleDto.getTime());
                    scheduleDto.setDay(classScheduleDto.getDay());
                    dtoList.add(scheduleDto);
                }
            }
        }
        Collections.sort(dtoList, new Comparator<ClassScheduleDto>() {
            @Override
            public int compare(ClassScheduleDto o1, ClassScheduleDto o2) {
                if (DateUtils.stringToDate(o1.getDate(), "yyyy-MM-dd").before(DateUtils.stringToDate(o2.getDate(), "yyyy-MM-dd"))) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return dtoList;
    }

    private String getrepeat(String repeat) {
        String str;
        switch (repeat) {
            case "0":
                str = "星期一";
                break;
            case "1":
                str = "星期二";
                break;
            case "2":
                str = "星期三";
                break;
            case "3":
                str = "星期四";
                break;
            case "4":
                str = "星期五";
                break;
            case "5":
                str = "星期六";
                break;
            case "6":
                str = "星期七";
                break;
            default:
                str = "";
        }
        return str;
    }

    private String getrepeat2(String repeat) {
        String str;
        switch (repeat) {
            case "0":
                str = "Mon";
                break;
            case "1":
                str = "Tues";
                break;
            case "2":
                str = "Wed";
                break;
            case "3":
                str = "Thur";
                break;
            case "4":
                str = "Fri";
                break;
            case "5":
                str = "Sat";
                break;
            case "6":
                str = "Sun";
                break;
            default:
                str = "";
        }
        return str;
    }

    @Override
    public List<ItemListDto> getItemList(LoginUser loginUser) {
        Integer hqId = getHqId(loginUser);
        List<ItemListDto> listDtos = classDao.getItemList(hqId);
        if (listDtos != null && listDtos.size() > 0) {
            for (ItemListDto itemListDto : listDtos) {
                itemListDto.setType(getType(itemListDto.getType()));
            }
        }
        return listDtos;
    }

    @Override
    public void updateItemList(Integer id, Long amount) {
        EnrichmentKlassschedule enrichmentKlassschedule = classDao.getClassByClassId(id);
        if (amount != null) {
            enrichmentKlassschedule.setUnitPrice(BigDecimal.valueOf(amount));
            classDao.updateItemList(enrichmentKlassschedule);
        }
    }

    @Override
    public List<Integer> getStartYear() {
        return classDao.getStartYear();
    }

    private Integer getHqId(LoginUser loginUser) {
        //查询hq
        List<HqHqaccount> hq = centerDao.selectCentersByUserId(loginUser.getId());
        if (hq == null || hq.size() == 0) {
            throw new BizException(ProductbundleError.NO_HQ);
        }
        return hq.get(0).getHqId();
    }
}
