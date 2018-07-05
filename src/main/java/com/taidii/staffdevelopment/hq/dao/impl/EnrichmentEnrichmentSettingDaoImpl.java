package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IEnrichmentEnrichmentSettingDao;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentEnrichmentsettingMapper;
import com.taidii.staffdevelopment.hq.entity.EnrichmentEnrichmentsetting;
import com.taidii.staffdevelopment.hq.entity.EnrichmentEnrichmentsettingExample;
@Service
public class EnrichmentEnrichmentSettingDaoImpl implements IEnrichmentEnrichmentSettingDao{
	@Autowired
	EnrichmentEnrichmentsettingMapper enrichmentEnrichmentSettingMapper;
	
	@Override
	public List<EnrichmentEnrichmentsetting> selectEnrichmentEnrichmentSettingByCenterId(Integer centerId) {
		EnrichmentEnrichmentsettingExample ee=new EnrichmentEnrichmentsettingExample();
		ee.createCriteria().andCenterIdEqualTo(centerId);
		return enrichmentEnrichmentSettingMapper.selectByExample(ee);
	}
}
