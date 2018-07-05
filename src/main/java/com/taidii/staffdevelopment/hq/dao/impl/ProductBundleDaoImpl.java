package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IProductBundleDao;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentProductbundleMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentProductbundlecourseMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.EnrichmentProductbundleMapper2;
import com.taidii.staffdevelopment.hq.dto.ProductBundleDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundle;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundlecourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundlecourseExample;

/**
 * @class: ProductBundleDaoImpl
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/21
 */
@Service
public class ProductBundleDaoImpl implements IProductBundleDao {

    @Autowired
    EnrichmentProductbundleMapper2 enrichmentProductbundleMapper2;

    @Autowired
    EnrichmentProductbundleMapper enrichmentProductbundleMapper;

    @Autowired
    EnrichmentProductbundlecourseMapper enrichmentProductbundlecourseMapper;

    @Override
    public void saveProductBundle(EnrichmentProductbundle enrichmentProductbundle) {
        enrichmentProductbundleMapper.insertSelective(enrichmentProductbundle);
    }

    @Override
    public void saveProductBundleCourse(List<EnrichmentProductbundlecourse> list) {
        enrichmentProductbundleMapper2.saveProductBundleCourse(list);
    }

    @Override
    public void updateProductBundle(EnrichmentProductbundle enrichmentProductbundle) {
        enrichmentProductbundleMapper.updateByPrimaryKeySelective(enrichmentProductbundle);
    }

    @Override
    public void updateProductBundleCourseFlag(Integer productbundleId) {
        enrichmentProductbundleMapper2.updateProductBundleCourseFlag(productbundleId);
    }

    @Override
    public void deleteProductBundleCourse(Integer id) {
        EnrichmentProductbundlecourseExample example = new EnrichmentProductbundlecourseExample();
        example.createCriteria().andProducebundleIdEqualTo(id);
        enrichmentProductbundlecourseMapper.deleteByExample(example);
    }

    @Override
    public void deleteProductBundle(Integer id) {
        enrichmentProductbundleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ProductBundleDto> getProductBundle() {
        return enrichmentProductbundleMapper2.getProductBundle();
    }

    @Override
    public ProductBundleDto getProductBundleById(Integer id) {
        return enrichmentProductbundleMapper2.getProductBundleById(id);
    }

    @Override
    public EnrichmentProductbundle DoesIDexist(Integer id) {
        return enrichmentProductbundleMapper.selectByPrimaryKey(id);
    }

	@Override
	public List<EnrichmentProductbundlecourse> selectProductBundleCourse(Integer courseId) {
		EnrichmentProductbundlecourseExample e=new EnrichmentProductbundlecourseExample();
		e.createCriteria().andCourseIdEqualTo(courseId);
		return enrichmentProductbundlecourseMapper.selectByExample(e);
	}

}
