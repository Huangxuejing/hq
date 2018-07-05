package com.taidii.staffdevelopment.hq.dao.mapper.custom;

import com.taidii.staffdevelopment.dao.mapper.BaseMapper;
import com.taidii.staffdevelopment.hq.dto.ProductBundleDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundle;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundleExample;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundlecourse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EnrichmentProductbundleMapper2 extends BaseMapper<EnrichmentProductbundle,EnrichmentProductbundleExample> {

    void saveProductBundleCourse(@Param("list") List<EnrichmentProductbundlecourse> list);

    void updateProductBundleCourseFlag(@Param("productbundleId") Integer productbundleId);

    List<ProductBundleDto> getProductBundle();

    ProductBundleDto getProductBundleById(@Param("id") Integer id);
}