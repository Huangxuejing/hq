package com.taidii.staffdevelopment.hq.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dao.ICenterDao;
import com.taidii.staffdevelopment.hq.entity.CentersCenter;
import com.taidii.staffdevelopment.hq.entity.HqHqaccount;
import com.taidii.staffdevelopment.hq.service.ICenterService;
import com.taidii.staffdevelopment.util.ListUtils;

@Service
public class CenterServiceImpl implements ICenterService{
	@Autowired
	ICenterDao centerDao;
	
	@Override
	public List<OptionDTO> getCenters(Integer userId) {
		List<OptionDTO> ods=new ArrayList<OptionDTO>();
		/**
		 * 通过UserID 查询hqid
		 */
		List<HqHqaccount> hqAccountList=centerDao.selectCentersByUserId(userId);
		
		if(ListUtils.isNotEmpty(hqAccountList)){
			/**
			 * 通过hqid 查询旗下的所有center
			 */
			List<CentersCenter> ccCenters=centerDao.selectCentersByHqId(hqAccountList.get(0).getHqId());
			
			if(ListUtils.isNotEmpty(ccCenters)){
				for(CentersCenter cc:ccCenters){
					OptionDTO od=new OptionDTO();
					od.setId(cc.getId());
					od.setName(cc.getName());
					ods.add(od);
				}
			}
		}
		return ods;
	}

}
