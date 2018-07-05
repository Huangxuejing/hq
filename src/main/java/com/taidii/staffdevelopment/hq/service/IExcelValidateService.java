package com.taidii.staffdevelopment.hq.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.hq.dto.ExcelDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;

/**
 * 
 * @description:文件导入验证
 * @author:王涛
 * @createTime:2018年6月28日 下午3:15:02
 * @version 1.0
 */
public interface IExcelValidateService {
	/**
	 * 
	 * @description:导入时 验证excelList
	 * @param excelList
	 * @throws Exception
	 * @author:王涛
	 * @createTime:2018年6月28日 下午3:17:10
	 */
   void validateExcelDtoList(List<ExcelDto> excelList) throws Exception;
   /**
    * 
    * @description:检查这个room是否被使用，在这个时间段
    * @param excelleve
    * @param dateMap
    * @param room
    * @param centerId
    * @author:王涛
    * @createTime:2018年6月28日 下午5:06:43
    */
	void checkOutRoom(List<ExcelDto> excelleve, Map<String, Date> dateMap,
			List<EnrichmentRoom> room, Integer centerId)throws Exception;
}
