package com.taidii.staffdevelopment.hq.service;

import java.util.List;

import com.taidii.staffdevelopment.hq.dto.ExcelDto;

public interface IExcelService {
	/**
	 * 
	 * @description:解析excel后，放入对象中
	 * @param listob
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月27日 下午2:20:49
	 */
	public List<ExcelDto> setExcelDto(List<List<Object>> listob)throws Exception;
	/**
	 * 
	 * @description:把excelList 入库操作
	 * @param excelList
	 * @param centerId
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月27日 下午4:55:07
	 */
	public String insertExcel(List<ExcelDto> excelList, Integer centerId,Integer courseId,Integer userId)throws Exception;
}
