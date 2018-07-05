package com.taidii.staffdevelopment.hq.validate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.util.StringUtils;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dto.ClassAddDTO;
import com.taidii.staffdevelopment.hq.dto.CourseAddDto;
import com.taidii.staffdevelopment.util.DateUtils;
import com.taidii.staffdevelopment.util.ListUtils;

/**
 * 
 * @description:验证添加课程类
 * @author:王涛
 * @createTime:2018年6月19日 下午8:36:44
 * @version 1.0
 */
public class ValidateCourseAddDtoService {
	public static void toValidateCourseAddDto(CourseAddDto cad) throws Exception{
		if(StringUtils.isEmpty(cad.getCourseName().trim())){
			throw new Exception("Add Course，The Course Name is not empty");
		}
		
		//级别level不能有重复字段
		List<OptionDTO> levelList=cad.getCourseLevels();
		List<String> levelStr=new ArrayList<String>();
		if(CollectionUtils.isNotEmpty(levelList)){
			for(OptionDTO o:levelList){
				levelStr.add(o.getName());
			}
		}
		/**
		 * 去重后返回的list大小，与去重之前的list大小是否相同，相同则没有levelName重复
		 */
		Integer size=ListUtils.distinckList(levelStr);
		if(size.intValue()!=levelList.size()){
			throw new Exception("Add Course，not have The same Level's Name Of The CourseLevels ！please check out");
		}
	}
	
	public static void toValidateClassAddDto(ClassAddDTO cad) throws Exception{
		if(StringUtils.isEmpty(cad.getClassName().trim())){
			throw new Exception("Add class failure，The name Of the class must not be empty");
		}
		
		if(null==cad.getTuitionStandard() || new BigDecimal(0)==cad.getTuitionStandard()){
			throw new Exception("Add class failure，Money Must Not be empty");
		}
		if(!cad.getDatePending()){
			if(cad.getPayType()==0){
				if(null==cad.getDateFrom() || null==cad.getDateTo()){
					throw new Exception("Add class failure，startTime or EndTime not empty");
				}
				String begin=DateUtils.dateToString(cad.getDateFrom(),DateUtils.DDMMYY);
				String end=DateUtils.dateToString(cad.getDateTo(),DateUtils.DDMMYY);
				if(!begin.equals(end)){
					if(!DateUtils.isBeforeDate(cad.getDateFrom(), cad.getDateTo())){
						throw new Exception("Add class failure，The end time must be greater than or equal to the start time");
					}
				}
				
			}else{
				if(null==cad.getDateFrom()){
					throw new Exception("Add class failure，The start time must not be empty");
				}
			}
		}
	}
}
