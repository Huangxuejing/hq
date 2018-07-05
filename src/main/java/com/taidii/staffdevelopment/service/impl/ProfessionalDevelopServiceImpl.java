package com.taidii.staffdevelopment.service.impl;

import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dao.*;
import com.taidii.staffdevelopment.dto.development.*;
import com.taidii.staffdevelopment.entity.*;
import com.taidii.staffdevelopment.enums.EditableEnum;
import com.taidii.staffdevelopment.enums.IsDeleteEnum;
import com.taidii.staffdevelopment.enums.MarkStatusEnum;
import com.taidii.staffdevelopment.error.PromotionError;
import com.taidii.staffdevelopment.service.IProfessionalDevelopService;
import com.taidii.staffdevelopment.util.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.service.impl
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/13 15:10
 */
@Service
public class ProfessionalDevelopServiceImpl implements IProfessionalDevelopService {

  @Autowired
  private IProfessionalDevelopDAO professionalDevelopDAO;
  @Autowired
  private ISelfEvaluationDAO  selfEvaluationDAO;
  @Autowired
  private IDutyLevelDAO dutyLevelDAO;
  @Autowired
  private IUserDutyLevelDAO userDutyLevelDAO;
  @Autowired
  private IPromotionDAO promotionDAO;
  @Autowired
  ISelfEvaluationPlanDAO selfEvaluationPlanDAO;
  @Autowired
  private ITimeSettingDAO timeSettingDAO;

  /**
   * @param userId
   *     老师对应的用户id
   * @description:
   * @author:谭农春
   * @createTime: 2018/6/13 15:05
   */
  @Override
  public RoadMapDTO fetchRoadMap(Integer userId) {
    RoadMapDTO roadMapDTO = new RoadMapDTO();
    // 用户姓名以及用户级别
    TeacherInfoDTO teacherInfoDTO = professionalDevelopDAO.fetchNameAndDutyName(userId);
    if (null != teacherInfoDTO) {
      roadMapDTO.setId(teacherInfoDTO.getUserId());
      roadMapDTO.setTeacherName(teacherInfoDTO.getTeacherName());
      roadMapDTO.setCurrentLevel(teacherInfoDTO.getDutyName());
    }
    // 获取自我评估列表
    List<DevelopDTO> dtos = selfEvaluationDAO.fetchSelfEvaluation(userId);
    // 年度评估明细
    List<YearEvaluationDTO> yearDetails =selfEvaluationDAO.fetchSelfEvaluationYearDetails(userId);
    Map<String,List<YearEvaluationDTO>> maps = new HashMap<String,List<YearEvaluationDTO>>();
    DevelopPromotionExample example = new DevelopPromotionExample();
    example.createCriteria().andUserIdEqualTo(userId);
    // 获取升职的情况。
    List<DevelopPromotion> promotions = promotionDAO.selectByExample(example);
    // year#period =>promotion
    Map<String,DevelopPromotion> promotionMap = separateMap(promotions);
    DevelopPromotion prm =null;
    List<YearEvaluationDTO>  list = null;
    // 配置映射
    if(!CollectionUtils.isEmpty(yearDetails)){
      for(YearEvaluationDTO yeardto : yearDetails){
        list = maps.get(yeardto.getYear());
        if(list== null ){
          list =new ArrayList<YearEvaluationDTO>();
        }
        prm= promotionMap.get(yeardto.getYear()+"#"+yeardto.getPeriod());
        if(null!= prm){
          // promoted to Senior Educarer on 31/12/2018
          String promotionStr =String.format(Constants.PROMOTION,prm.getDutyName(),DateUtils.mmddyyy(prm.getGmtCreate()));
          // 设置一下desc
         yeardto.setDesc(promotionStr);
        }

        list.add(yeardto);
        maps.put(yeardto.getYear(),list);
      }
    }

    if(!CollectionUtils.isEmpty(dtos)){
     for(DevelopDTO dto : dtos){
       dto.setYearEvaluations(maps.get(dto.getYear()));
     }
    }
    roadMapDTO.setDevelops(dtos);
    return roadMapDTO;
  }

  /**
   *  分离最新的设置
   * @param promotions
   * @return
   */
  private Map<String,DevelopPromotion> separateMap(List<DevelopPromotion> promotions) {
    Map<String,DevelopPromotion> maps =new HashMap<String,DevelopPromotion>();
    if(!CollectionUtils.isEmpty(promotions)){
      DevelopPromotion promotion =null;
      for(DevelopPromotion dp : promotions){
         long start = dp.getGmtCreate().getTime();
          promotion = maps.get(dp.getYear().toString()+"#"+dp.getPeriod().toString());
         if(null!=promotion){
           // 最新就同步
          if(promotion.getGmtCreate().getTime()<start){
            maps.put(dp.getYear().toString()+"#"+dp.getPeriod().toString(),promotion);
          }
         }
         else{
           maps.put(dp.getYear().toString()+"#"+dp.getPeriod().toString(),dp);
         }
      }
    }
    return maps;
  }

  /**
   * 职业提升
   *
   * @param userId
   *     -- 提升的用户id
   * @param promotion
   */
  @Override
  public String promotion(Integer userId, String promotion) {
    // DutyLevel
    DevelopDutyLevelExample developDutyLevelExample = new DevelopDutyLevelExample();
    developDutyLevelExample.createCriteria().andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId()).andNameEqualTo(promotion);
    List<DevelopDutyLevel> developDutyLevelList = dutyLevelDAO.selectByExample(developDutyLevelExample);
    // 个人职务
    DevelopUserDutyLevelExample developUserDutyLevelExample = new DevelopUserDutyLevelExample();
    developUserDutyLevelExample.createCriteria().andIsDeleteEqualTo(IsDeleteEnum.NORMAL.getId()).andUserIdEqualTo(userId);
     List<DevelopUserDutyLevel> developUserDutyLevelList = userDutyLevelDAO.selectByExample(developUserDutyLevelExample);
    if(CollectionUtils.isEmpty(developUserDutyLevelList)){
      //抛出异常
      throw  new BizException(PromotionError.NO_SET_SKILL_LEVEL);
    }
    DevelopTimeSetting  timeSetting= timeSettingDAO.fetchCurrent(userId,new Date());
    if(null == timeSetting){
      throw  new BizException(PromotionError.NO_EVALUATION_TIME);
    }
    // 提升的职务
    if(!CollectionUtils.isEmpty(developDutyLevelList) && !CollectionUtils.isEmpty(developUserDutyLevelList) ){
      // 提升职务
      DevelopDutyLevel promotionDutyLevel = developDutyLevelList.get(0);
      DevelopUserDutyLevel  personUserDutyLevel = developUserDutyLevelList.get(0);
      // 相同技能
      if(promotionDutyLevel.getId().equals(personUserDutyLevel.getDutyLevelId())){
        throw  new BizException(PromotionError.SAME_SKILL_LEVEL);
      }
      else{
          // new Skill Level
          personUserDutyLevel.setDutyLevelId(promotionDutyLevel.getId());
          //update  new skill level
          userDutyLevelDAO.updateByPrimaryKeySelective(personUserDutyLevel);
          // 记录操作
          DevelopPromotion developPromotion =new DevelopPromotion();
          developPromotion.setGmtCreate(new Date());
          developPromotion.setGmtModify(new Date());
          developPromotion.setDutyName(promotion);
          developPromotion.setIsDelete(IsDeleteEnum.NORMAL.getId());
          developPromotion.setUserId(userId);
          developPromotion.setDutyId(promotionDutyLevel.getId());
          developPromotion.setDutyName(promotionDutyLevel.getName());
          // 年度和学期
          developPromotion.setYear(timeSetting.getYear());
          developPromotion.setPeriod(timeSetting.getPeriod());
          //  插入提升记录
          promotionDAO.insert(developPromotion);
      }
    }
    return promotion;
  }

  /**
   * 标记为已完成
   *
   * @param selfEvaluationPlanId
   *
   * @return
   *
   * @ @author tannc
   * @create-time 2018-06-20 15:48:49
   */
  @Override
  public String markAsComplete(Integer selfEvaluationPlanId) {
    Date now = new Date();
    DevelopSelfEvaluationPlan plan =new DevelopSelfEvaluationPlan();
    plan.setId(selfEvaluationPlanId);
    plan.setGmtModify(now);
    plan.setStatus(MarkStatusEnum.FINISH.getId());
    plan.setMarkCompleteDate(now);
    // 标记为已完成
    selfEvaluationPlanDAO.updateByPrimaryKeySelective(plan);
    return DateUtils.mmddyyy(now);
  }

  /**
   * @param evaluationId
   *     -- 自评id
   *
   * @param userId
   * @description: 获取评估详情
   * @author:谭农春
   * @createTime: 2018/6/20 16:29
   */
  @Override
  public List<SKillDetailDTO> fetchDetails(Integer evaluationId, Integer userId) {
    // 获取第三层的数据
    List<SKillDetailDTO> thirdSkill = professionalDevelopDAO.fetchImprovePlan(evaluationId);
    // 获取当前用户最后一次评估的id
    Integer  lastId = professionalDevelopDAO.fetchLastId(userId);
    List<Integer> secondIds = new ArrayList<Integer>();
    Integer editable = EditableEnum.NO.getId();
    // 项目情况
    Map<Integer,List<SKillDetailDTO>> secMapThird = new HashMap<Integer,List<SKillDetailDTO>>();
    if(!CollectionUtils.isEmpty(thirdSkill)){
      List<SKillDetailDTO>  list1 = null;
       for(SKillDetailDTO th : thirdSkill){
         list1 = secMapThird.get(th.getParentId());
         if(list1 == null ){
           list1 =new ArrayList<SKillDetailDTO>();
         }
         list1.add(th);
         // 判断是否可以编辑
         if(lastId!=null && lastId.equals(th.getSelfEvaluationId())){
           // 可以编辑
           th.setEditable(EditableEnum.YES.getId());
           editable =EditableEnum.YES.getId();
         }
         // 做好二级与三级的映射
         secMapThird.put(th.getParentId(),list1);
         if(!secondIds.contains(th.getParentId())){
           secondIds.add(th.getParentId());
         }
       }
    }
    List<SKillDetailDTO> secondSkill =professionalDevelopDAO.fetchParentSkill(secondIds);
      // 获取二级对应的课程
     List<SkillTrainDTO> skillTrainDTOList = professionalDevelopDAO.fetchSkillTrain(evaluationId);
    Map<Integer,List<SkillTrainDTO>> trainsMap = new HashMap<Integer,List<SkillTrainDTO>>();
    if(!CollectionUtils.isEmpty(skillTrainDTOList)){
         List<SkillTrainDTO> trains = null;
        for(SkillTrainDTO trainDTO : skillTrainDTOList) {
          trains = trainsMap.get(trainDTO.getDutyLevelSkillId());
          if (trains == null) {
            trains = new ArrayList<SkillTrainDTO>();
          }
          // 设置Skill ==> GmtModifyDesc
          trains.add(trainDTO);
          trainsMap.put(trainDTO.getDutyLevelSkillId(),trains);
        }
    }
    // 获取二级
    Map<Integer,List<SKillDetailDTO>> fristMapSec = new HashMap<Integer,List<SKillDetailDTO>>();
    List<Integer> firstIds = new ArrayList<Integer>();
    if(!CollectionUtils.isEmpty(thirdSkill)){
      List<SKillDetailDTO>  list2 = null;
      for(SKillDetailDTO sec : secondSkill){
        list2 = fristMapSec.get(sec.getParentId());
        if(list2 == null ){
          list2 =new ArrayList<SKillDetailDTO>();
        }
        sec.setEditable(editable);
        // 设置三级
        sec.setChilds(secMapThird.get(sec.getDutyLevelSkillId()));
        //
        sec.setTraingDate(trainsMap.get(sec.getDutyLevelSkillId()));
        list2.add(sec);
        // 做好二级与三级的映射
        fristMapSec.put(sec.getParentId(),list2);
        if(!firstIds.contains(sec.getParentId())){
          firstIds.add(sec.getParentId());
        }
      }
    }
    List<SKillDetailDTO> firstSkill =professionalDevelopDAO.fetchParentSkill(firstIds);
    // 获取一级
    if(!CollectionUtils.isEmpty(firstSkill)){
      for(SKillDetailDTO dto :firstSkill){
        dto.setChilds(fristMapSec.get(dto.getDutyLevelSkillId()));
      }
    }
    return firstSkill;
  }

  /**
   * @param userId
   *     -- 用户id
   * @param evaluationId
   *
   * @description: 通过用户id获取用户信息以及训练总工时
   * @author:谭农春
   * @createTime: 2018/6/21 11:44
   */
  @Override
  public TeacherInfoDTO fetchTeacherInfo(Integer userId, Integer evaluationId) {
    TeacherInfoDTO teacherInfoDTO =  professionalDevelopDAO.fetchNameAndDutyName(userId);
    // 获取训练课程
    Integer  timeHours = professionalDevelopDAO.summaryTrainHours(evaluationId);
    teacherInfoDTO.setTrainHours(timeHours);
    DevelopSelfEvaluation evaluation = selfEvaluationDAO.selectByPrimaryKey(evaluationId);
    teacherInfoDTO.setYear(evaluation.getYear());
    teacherInfoDTO.setYearDutyName(evaluation.getDutyLevelName());
    return teacherInfoDTO;
  }

  /**
   * @param plans
   *     -- 计划的更新内容
   *
   * @description: 更RoadMap
   * @author:谭农春
   * @createTime: 2018/6/22 11:26
   */
  @Override
  public void roadUpdateContent(List<RoadUpdateContentDTO> plans) {
    DevelopSelfEvaluationPlan plan =  null;
    for(RoadUpdateContentDTO dto : plans){
      plan = new DevelopSelfEvaluationPlan();
      BeanUtils.copyProperties(dto,plan);
      // 更新计划
      selfEvaluationPlanDAO.updateByPrimaryKeySelective(plan);
    }

  }
}
