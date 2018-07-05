package com.taidii.staffdevelopment.hq.dao;

import java.util.List;

import com.taidii.staffdevelopment.hq.entity.EnrichmentEnrichmentsetting;

public interface IEnrichmentEnrichmentSettingDao {
	/**
	 * 
	 * @description:根据centerID 查询出常量的时间，添加class时的时间
	 * @param centerId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 下午2:13:51
	 */
	List<EnrichmentEnrichmentsetting> selectEnrichmentEnrichmentSettingByCenterId(Integer centerId);
}
