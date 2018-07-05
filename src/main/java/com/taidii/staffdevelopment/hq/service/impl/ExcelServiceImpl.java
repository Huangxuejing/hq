package com.taidii.staffdevelopment.hq.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.constant.RepeatConstant;
import com.taidii.staffdevelopment.hq.dao.IEnrichmentClassDao;
import com.taidii.staffdevelopment.hq.dao.IEnrichmentCourseLevelDao;
import com.taidii.staffdevelopment.hq.dao.IRoomDao;
import com.taidii.staffdevelopment.hq.dto.ExcelDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduletime;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;
import com.taidii.staffdevelopment.hq.service.IAddClassService;
import com.taidii.staffdevelopment.hq.service.IExcelService;
import com.taidii.staffdevelopment.hq.service.IExcelValidateService;
import com.taidii.staffdevelopment.util.DateUtils;
import com.taidii.staffdevelopment.util.ListUtils;
@Service
public class ExcelServiceImpl implements IExcelService{
	@Autowired
	IEnrichmentCourseLevelDao enrichmentCourseLevelDao;
	@Autowired
	IRoomDao enrichmentRoomDao;
	@Autowired
	IEnrichmentClassDao classDao;
	@Autowired
	IExcelValidateService excelValidateService;
	@Autowired
	IAddClassService addClassService;
	@Override 
	public List<ExcelDto> setExcelDto(List<List<Object>> listob) throws Exception {
		List<ExcelDto> excelList=new ArrayList<ExcelDto>();
		  //该处可调用service相应方法进行数据保存到数据库中，现只对数据输出  
        for (int i = 0; i < listob.size(); i++) {  
            List<Object> lo = listob.get(i); 
            if(lo.size()==RepeatConstant.TOTAL_CELLS_COUNT && !"".equals(lo.get(0))){
            	ExcelDto excel = new ExcelDto();  
	            excel.setLevel(String.valueOf(lo.get(0)));
	            excel.setClassName(String.valueOf(lo.get(1)));
	            switch(String.valueOf(lo.get(2))){
	            case "By Term":
	            	excel.setType("2");
	            	break;
	            case "BY Month":
	            	excel.setType("3");
	            	break;
	            case "By Period":
	            	excel.setType("0");
	            	break;
	            case "By Lesson":
	            	excel.setType("1");
	            	break;
	            default:
	            	throw new Exception("Payment Mode is wrong");
	            }
	            excel.setDate(String.valueOf(lo.get(3)));
	            excel.setRepeat(DateUtils.dateToWeek(excel.getDate()));
	            excel.setStartTime(String.valueOf(lo.get(4)));
	            excel.setEndTime(String.valueOf(lo.get(5)));
	            excel.setClassRoom(String.valueOf(lo.get(6)));
	            excelList.add(excel);
	            System.out.println(
	            		"print-–>Level:"+excel.getLevel()+" Class Name："+excel.getClassName()+
	            		"   Payment Mode: "+excel.getType()+
	            		"   Date："+excel.getDate()+"   Start Date & Time："+excel.getStartTime()+
	            		"   End Date & Time: "+excel.getEndTime()+
	            		"   Class Room: "+excel.getClassRoom()); 
	            
            }
        }
		return excelList;
	}
	/**
	 * 
	 * @description:导入的excel入库操作
	 * @param excelList
	 * @param centerId
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @throws Exception 
	 * @createTime:2018年6月27日 下午4:56:14
	 */
	@Override
	public String insertExcel(List<ExcelDto> excelList, Integer centerId,Integer courseId,Integer userId) throws Exception {
		List<ExcelDto> excelleve=new ArrayList<ExcelDto>();
		String str="";
		//EnrichmentCourse course=new EnrichmentCourse();
		List<EnrichmentCourselevel> levelList=new ArrayList<EnrichmentCourselevel>();
		//通过courseID 去查询级别
		levelList=enrichmentCourseLevelDao.selectCourseLevelByCourseId(courseId);
		List<EnrichmentRoom> room=new ArrayList<EnrichmentRoom>();
		
		if(ListUtils.isNotEmpty(levelList)){
			for(int i=0;i<levelList.size();i++){
				excelList.removeAll(excelleve);
				excelleve=new ArrayList<ExcelDto>();
				Map<String,Date> dateMap=new HashMap<String,Date>();
				Integer levelId=levelList.get(i).getId();
				for(ExcelDto e:excelList){
					if(levelList.get(i).getName().equals(e.getLevel())){
						excelleve.add(e);
					}
				}
				if(ListUtils.isNotEmpty(excelleve)){
					room=enrichmentRoomDao.selectRoomByCenterIdAndRoomName(centerId,excelleve.get(0).getClassRoom());
				}
				
				/**
				 * 入库操作，把相同的level 存储到excelleve中 准备入库
				 */
				if(ListUtils.isNotEmpty(excelleve)){
					//dateFroom  dateTo 组成Map 
					dateMap=this.setMapDate(excelleve);
					//excelleve  必须验证 className  room  type  必须一样,必须验证这个room在这个时间段是否正在使用：验证service
					excelValidateService.validateExcelDtoList(excelleve);
					//查看是否被导入过
					List<EnrichmentKlassschedule> importKlassList=this.selectEnrichmentKlassschedule(excelleve, centerId, courseId, levelId, dateMap, room, excelleve.get(0).getClassName());
					if(CollectionUtils.isNotEmpty(importKlassList)){
						for(EnrichmentKlassschedule d:importKlassList){
							addClassService.deleteClass(d.getId(), false);
						}
					}
					//验证这个room在这个时间段之类是否被使用
					excelValidateService.checkOutRoom(excelleve,dateMap,room,centerId);
					str=this.insertEnrichmentKlassschedule(centerId,courseId,userId,excelleve,levelId,dateMap,room);
				}
			}
		}else{
			throw new Exception("the course level is not exist，["+courseId+"]");
		}
		return str;
	}
	/**
	 * 
	 * @description:date From date to 返回
	 * @param excelleve
	 * @return
	 * @author:王涛
	 * @throws ParseException 
	 * @createTime:2018年6月28日 上午9:37:33
	 */
	private Map<String, Date> setMapDate(List<ExcelDto> excelleve){
		Map<String, Date> dateMap=new HashMap<String,Date>();
		Collections.sort(excelleve,  new Comparator<ExcelDto>(){
			@Override
			public int compare(ExcelDto o1, ExcelDto o2) {
				Date beginDate=DateUtils.stringToDate(o1.getDate(), DateUtils.DDMMYYYY);
				Date enDate=DateUtils.stringToDate(o2.getDate(), DateUtils.DDMMYYYY);
				if(o1.getDate().equals(o2.getDate())){
					return o1.getEndTime().compareTo(o2.getEndTime());
				}else{
					if(beginDate.after(enDate)){
						return 1;
					}else{
						return -1;
					}
				}
			}
		});
		int count=excelleve.size()-1;
		dateMap.put("dateFrom", DateUtils.stringToDate(excelleve.get(0).getDate(), DateUtils.DDMMYYYY));
		dateMap.put("dateTo", DateUtils.stringToDate(excelleve.get(count).getDate(),DateUtils.DDMMYYYY));
		return dateMap;
	}
	/**
	 * 
	 * @description:导入class表和time表
	 * @param centerId
	 * @param courseId
	 * @param userId
	 * @param excelleve
	 * @return
	 * @author:王涛
	 * @throws Exception 
	 * @createTime:2018年6月27日 下午5:58:28
	 */
	private String insertEnrichmentKlassschedule(Integer centerId,Integer courseId, Integer userId, 
			List<ExcelDto> excelleve,Integer levelId,Map<String,Date> dateMap,List<EnrichmentRoom> room) throws Exception {
		EnrichmentKlassschedule ekd=new EnrichmentKlassschedule();
		ekd=this.setEnrichmentKlassschedule(centerId,courseId,userId,excelleve.get(0),levelId,room.get(0).getId(),dateMap);
		//入class库
		Integer num=classDao.insertEnrichmentClass(ekd);
		if(0==num){
			throw new Exception("import class faild！");
		}
		for(ExcelDto excel:excelleve){
			EnrichmentKlassscheduletime ekt=new EnrichmentKlassscheduletime();
			if(room.size()>=2){
				throw new Exception("The name of the classroom under this organization is duplicated，import faild");
			}
			ekt=this.setClassTime(ekd.getId(),excel);
			Integer timeCount=classDao.insertEnrichmentClasstime(ekt);
			if(0==timeCount){
				throw new Exception("Failure to import classTime");
			}
		}
		return "success";
	}
	
	/**
	 * 
	 * @description:查询是否已经导入
	 * @param centerId
	 * @param courseId
	 * @param levelId
	 * @param dateMap
	 * @param room
	 * @param className
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月28日 下午5:30:32
	 */
	private List<EnrichmentKlassschedule> selectEnrichmentKlassschedule(List<ExcelDto> excelleve,Integer centerId,Integer courseId, Integer levelId, Map<String, Date> dateMap,
			List<EnrichmentRoom> room, String className) {
		EnrichmentKlassschedule importClasses=new EnrichmentKlassschedule();
		List<EnrichmentKlassschedule> importClasses2=new ArrayList<EnrichmentKlassschedule>();
		importClasses.setHqId(0);
		importClasses.setCenterId(centerId);
		importClasses.setKlassname(className);
		importClasses.setCourseId(courseId);
		importClasses.setLevelId(levelId);
		importClasses.setType(Integer.parseInt(excelleve.get(0).getType()));
		importClasses.setRoomId(room.get(0).getId());
		importClasses.setRemarks(centerId+"导入班级");
		importClasses2=classDao.selectEnrichmentKlassscheduleByExample(importClasses);
		return importClasses2;
	}
	/**
	 * 
	 * @description:给排课时间入库
	 * @param id
	 * @param excel
	 * @return
	 * @author:王涛
	 * @throws ParseException 
	 * @createTime:2018年6月28日 上午10:58:12
	 */
	private EnrichmentKlassscheduletime setClassTime(Integer id, ExcelDto excel) throws ParseException {
		EnrichmentKlassscheduletime time=new EnrichmentKlassscheduletime();
		time.setId(null);
		time.setKlassscheduleId(id);
		time.setRepeat(excel.getRepeat());
		time.setStartTime(DateUtils.stringToDate(excel.getStartTime(), null));
		time.setEndTime(DateUtils.stringToDate(excel.getEndTime(), null));
		return time;
	}
	/**
	 * 
	 * @description:EnrichmentKlassschedule 赋值
	 * @param centerId
	 * @param courseId
	 * @param userId
	 * @param excel
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月27日 下午6:00:46
	 */
	private EnrichmentKlassschedule setEnrichmentKlassschedule(Integer centerId, Integer courseId, Integer userId, 
			ExcelDto excel,Integer levelId,Integer roomId,Map<String,Date> dateMap) {
		EnrichmentKlassschedule ek=new EnrichmentKlassschedule();
		ek.setId(null);
		ek.setHqId(0);
		ek.setCenterId(centerId);
		ek.setKlassname(excel.getClassName());
		ek.setCourseId(courseId);
		ek.setLevelId(levelId);
		ek.setType(Integer.valueOf(excel.getType()));
		ek.setNumberOfClass(0);
		ek.setDatePending(false);
		ek.setRoomId(roomId);
		ek.setDateFrom(dateMap.get("dateFrom"));
		ek.setDateTo(dateMap.get("dateTo"));
		ek.setCreatedDate(new Date());
		ek.setCreatedById(userId);
		ek.setLastUpdateById(userId);
		ek.setLastUpdate(ek.getCreatedDate());
		ek.setRemarks(centerId+"导入班级");
		return ek;
	}
}
