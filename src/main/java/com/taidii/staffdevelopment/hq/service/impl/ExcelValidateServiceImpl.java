package com.taidii.staffdevelopment.hq.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dto.ExcelDto;
import com.taidii.staffdevelopment.hq.dto.TimeDto;
import com.taidii.staffdevelopment.hq.dto.TimeDto2;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;
import com.taidii.staffdevelopment.hq.service.ICenterTimeService;
import com.taidii.staffdevelopment.hq.service.IExcelValidateService;
import com.taidii.staffdevelopment.util.DateUtils;
import com.taidii.staffdevelopment.util.ListUtils;
@Service
public class ExcelValidateServiceImpl implements IExcelValidateService{
	@Autowired
	private ICenterTimeService centerTimeService;
	/**
	 * 
	 * @description:导入时 验证excelList，查看整个list里面的className和 payType,classRoom 是否一样
	 * @param excelList
	 * @throws Exception
	 * @author:王涛
	 * @createTime:2018年6月28日 下午3:17:29
	 */
	@Override
	public void validateExcelDtoList(List<ExcelDto> excelList) throws Exception {
		List<String> classNameList=new ArrayList<String>();
		List<String> payTypeList=new ArrayList<String>();
		List<String> classRoomList=new ArrayList<String>();
		
		//首先验证所有的className
		if(ListUtils.isNotEmpty(excelList)){
			for(ExcelDto excel:excelList){
				classNameList.add(excel.getClassName());
				payTypeList.add(excel.getType());
				classRoomList.add(excel.getClassRoom());
			}
		}
		//准备验证
		Integer className=ListUtils.distinckList(classNameList);
		if(className.intValue()>1){
			throw new Exception("导入时，同一级别下的课程名称必须统一");
		}
		Integer payType=ListUtils.distinckList(payTypeList);
		if(payType.intValue()>1){
			throw new Exception("导入时，同一级别下的付费方式必须统一");
		}
		Integer classRoom=ListUtils.distinckList(classRoomList);
		if(classRoom.intValue()>1){
			throw new Exception("导入时，同一级别下的教室名称必须统一");
		}
	}
	/**
	 * 
	 * @description:TimeDto2 时间内  这个room是否被使用
	 * @param excelleve
	 * @param dateMap
	 * @param room
	 * @param centerId
	 * @throws Exception
	 * @author:王涛
	 * @createTime:2018年6月28日 下午5:09:03
	 */
	@Override
	public void checkOutRoom(List<ExcelDto> excelleve,Map<String, Date> dateMap, List<EnrichmentRoom> room,Integer centerId) throws Exception {
		TimeDto2 times=new TimeDto2();
		times=this.setTimeDto2(excelleve,dateMap);
		String str=centerTimeService.checkOutRoom(times,room.get(0).getId(),centerId);
		if(!"success".equals(str)){
			throw new Exception("这个机构下["+centerId+"]的教室"+room.get(0).getName()+
					"在时间段["+dateMap.get("dateFrom")+"~"+dateMap.get("dateTo")+"]已经被使用，导入失败");
		}
	}
	
	/**
	 * 
	 * @description:TimeDto2 赋值
	 * @param excelleve
	 * @param dateMap
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月28日 下午5:01:40
	 */
	private TimeDto2 setTimeDto2(List<ExcelDto> excelleve,Map<String,Date> dateMap) {
		TimeDto2 times=new TimeDto2();
		List<TimeDto> time=new ArrayList<TimeDto>();
		/////修改时间格式 成 yyyy-MM-dd
		times.setDateFrom(DateUtils.dateToString(dateMap.get("dateFrom"), DateUtils.YYYYMMdd));
		times.setDateTo(DateUtils.dateToString(dateMap.get("dateTo"), DateUtils.YYYYMMdd));
		for(ExcelDto excel:excelleve){
			TimeDto t=new TimeDto();
			t.setReapeat(excel.getRepeat());
			t.setStarTime(excel.getStartTime());
			t.setEndTime(excel.getEndTime());
			time.add(t);
		}
		times.setTime(time);
		return times;
	}
}
