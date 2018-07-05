package com.taidii.staffdevelopment.hq.dao;

import com.taidii.staffdevelopment.hq.dto.ProductBundleDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundle;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundlecourse;

import java.util.List;

/**
 * @class: IProductBundleDao
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/21
 */
public interface IProductBundleDao {
    void saveProductBundle(EnrichmentProductbundle enrichmentProductbundle);
    void saveProductBundleCourse(List<EnrichmentProductbundlecourse> list);

    void updateProductBundle(EnrichmentProductbundle enrichmentProductbundle);
    void updateProductBundleCourseFlag(Integer productbundleId);

    void deleteProductBundleCourse(Integer id);
    void deleteProductBundle(Integer id);

    List<ProductBundleDto> getProductBundle();

    ProductBundleDto getProductBundleById(Integer id);

    EnrichmentProductbundle DoesIDexist(Integer id);
    /**
     * 
     * @description:通过courseID 查询EnrichmentProductbundlecourse
     * @param courseId
     * @return
     * @author:王涛
     * @createTime:2018年7月3日 下午5:45:14
     */
	List<EnrichmentProductbundlecourse> selectProductBundleCourse(Integer courseId);

}
