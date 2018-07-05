package com.taidii.staffdevelopment.controller;

import com.taidii.staffdevelopment.commons.TaskSchedule;
import com.taidii.staffdevelopment.entity.DevelopTimeSetting;
import com.taidii.staffdevelopment.service.ISelfEvaluationService;
import com.taidii.staffdevelopment.service.ISettingsService;
import com.taidii.staffdevelopment.service.ITimeSettingService;
import com.taidii.staffdevelopment.util.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by wentao on 2018/6/15.
 */
@Controller
public class PageController {

     @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/teacher")
    public String teacher(){
      return "teacher";
    }

    private Logger logger = LoggerFactory.getLogger(TaskSchedule.class);

    @Autowired
    private ITimeSettingService timeSettingService;
    @Autowired
    private ISelfEvaluationService selfEvaluationService;
    @Autowired
    private ISettingsService settingsService;

    @GetMapping("/test/schedule")
    @ResponseBody
    public String test(@RequestParam("date") String date){
        logger.info("每晚定时任务开始");
        DateFormat bf = new SimpleDateFormat("y-M-d");
        if(null== date || date.isEmpty() ){
            date = bf.format(new Date());
        }
        //获取每个学校时间设置，判断这个学校的自评是否需要被过期
        List<DevelopTimeSetting> list = timeSettingService.getNeedOverdue(date);
        //过期老师自评
        selfEvaluationService.overdueTeacherSelfEvaluation(list);
        //获取每个学校时间设置，判断这个学校的自评是否需要被过期
        list = timeSettingService.getNeedOverdue(date);
        //过期所有自评自评
        selfEvaluationService.overdueSelfEvaluation(list);
        //查询所有当年所有可以升级的时间设定
        //获取所有需要升级的学校情况
        list = timeSettingService.getNeedUpgrade(date);
        //升级学校基础配置
        //升级score
        settingsService.upgradeScore(list);
        //升级skill和guidencing
        settingsService.upgradeDutyLevelSkill(list);
        //推送自评
        selfEvaluationService.pushSelfEvaluation(list);
        logger.info("每晚定时任务结束");
        return "success";
    }

}
