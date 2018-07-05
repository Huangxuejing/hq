package com.taidii.staffdevelopment.hq.service;

import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;

/**
 * 
 * @description:center 服务的接口
 * @author:王涛
 * @createTime:2018年6月19日 下午7:02:33
 * @version 1.0
 */
public interface ICenterService {
	List<OptionDTO> getCenters(Integer userId);
}
