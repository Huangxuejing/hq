package com.taidii.staffdevelopment.hq.service;

import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dto.ClassAddDTO;

public interface IAddClassService {
	/**
	 * 
	 * @description:添加班级接口
	 * @param cad
	 * @param userId
	 * @param type
	 * @return
	 * @author:王涛
	 * @param courseId 
	 * @createTime:2018年6月21日 下午5:40:44
	 */
	void saveClass(ClassAddDTO cad,Integer userId,Integer type, Integer courseId,Integer centerId) throws Exception;
	
	/**
	 * 
	 * @description:编辑班级时的回显班级接口
	 * @param classId
	 * @param type
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午10:28:00
	 */
	ClassAddDTO editClass(Integer classId, Integer type)throws Exception;
	/**
	 * 
	 * @description:删除这个班级 根据班级ID
	 * @param classId
	 * @author:王涛
	 * @createTime:2018年6月22日 上午11:55:21
	 */
	void deleteClass(Integer classId,boolean isEditSave);

	void editSaveClass(ClassAddDTO cad, Integer userId,
			Integer classId)throws Exception;
	/**
	 * 
	 * @description:查询HQ 创建的class对应的centers
	 * @param classId
	 * @return
	 * @author:王涛
	 * @param userId 
	 * @createTime:2018年7月3日 上午9:16:47
	 */
	List<OptionDTO> selectHQCreatClassCenter(Integer classId, Integer userId);
}
