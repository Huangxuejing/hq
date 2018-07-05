package com.taidii.staffdevelopment.hq.service.impl;

import com.taidii.staffdevelopment.commons.BizException;
import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.error.ProductbundleError;
import com.taidii.staffdevelopment.hq.dao.ICenterDao;
import com.taidii.staffdevelopment.hq.dao.IFinanceSetDao;
import com.taidii.staffdevelopment.hq.dao.IProductBundleDao;
import com.taidii.staffdevelopment.hq.dto.CourseLevelDto;
import com.taidii.staffdevelopment.hq.dto.LevelDto;
import com.taidii.staffdevelopment.hq.dto.ProductBundleDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundle;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundlecourse;
import com.taidii.staffdevelopment.hq.entity.FinanceHqfinance;
import com.taidii.staffdevelopment.hq.entity.HqHqaccount;
import com.taidii.staffdevelopment.hq.service.IFinanceService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @class: FinanceServiceImpl
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/21
 */
@Service
public class FinanceServiceImpl implements IFinanceService {

    @Autowired
    ICenterDao centerDao;

    @Autowired
    IProductBundleDao productBundleDao;

    @Autowired
    IFinanceSetDao financeSetDao;

    @Override
    public void saveProductBundle(ProductBundleDto dto, LoginUser loginUser) {
        Integer hq = getHqId(loginUser);
        //保存套餐
        EnrichmentProductbundle enrichmentProductbundle = new EnrichmentProductbundle();
        enrichmentProductbundle.setChargingItem(dto.getChargingItem());
        enrichmentProductbundle.setItemCode(dto.getItemCode());
        enrichmentProductbundle.setAmountBefore(dto.getAmountBefore());
        enrichmentProductbundle.setAmountAfter(dto.getAmountAfter());
        enrichmentProductbundle.setRemarks(dto.getRemarks());
        enrichmentProductbundle.setHqId(hq);
        productBundleDao.saveProductBundle(enrichmentProductbundle);
        if(null == enrichmentProductbundle.getId()){
            throw new BizException(ProductbundleError.SAVE_FAIL);
        }
        save(dto,enrichmentProductbundle.getId());

    }

    private Integer getHqId(LoginUser loginUser){
        //查询hq
        List<HqHqaccount> hq = centerDao.selectCentersByUserId(loginUser.getId());
        if(hq == null || hq.size()==0){
            throw new BizException(ProductbundleError.NO_HQ);
        }
        return hq.get(0).getHqId();
    }
    //保存套餐和课程的关系
    private void save(ProductBundleDto dto,Integer producebundleId){
        List<CourseLevelDto> courseLevelDtos = dto.getCourseLevelDtos();
        List<EnrichmentProductbundlecourse> list = new ArrayList<>();
        EnrichmentProductbundlecourse productbundlecourse;
        if (courseLevelDtos != null && courseLevelDtos.size() > 0) {
            for (CourseLevelDto dto1 : courseLevelDtos) {
                if (dto1.getLevelDtos() != null && dto1.getLevelDtos().size() > 0) {
                    for (LevelDto level : dto1.getLevelDtos()) {
                        productbundlecourse = new EnrichmentProductbundlecourse();
                        productbundlecourse.setProducebundleId(producebundleId);
                        productbundlecourse.setCourseId(dto1.getCourseId());
                        productbundlecourse.setLevelId(level.getId());
                        productbundlecourse.setFlag(0);
                        list.add(productbundlecourse);
                    }
                }
            }
        }
        if(list.size()==0) {
            throw new BizException(ProductbundleError.NO_SELECT_COURSEORLEVEL);
        }
        productBundleDao.saveProductBundleCourse(list);
    }
    @Override
    public void updateProductBundle(ProductBundleDto productBundleDto,LoginUser loginUser) {
        Integer hq = getHqId(loginUser);

        DoesIDexist(productBundleDto.getId());
        EnrichmentProductbundle enrichmentProductbundle = new EnrichmentProductbundle();
        enrichmentProductbundle.setId(productBundleDto.getId());
        enrichmentProductbundle.setChargingItem(productBundleDto.getChargingItem());
        enrichmentProductbundle.setItemCode(productBundleDto.getItemCode());
        enrichmentProductbundle.setAmountBefore(productBundleDto.getAmountBefore());
        enrichmentProductbundle.setAmountAfter(productBundleDto.getAmountAfter());
        enrichmentProductbundle.setRemarks(productBundleDto.getRemarks());
        enrichmentProductbundle.setHqId(hq);
        productBundleDao.updateProductBundle(enrichmentProductbundle);

        //修改套餐和课程的关系(先逻辑删除/再添加)
        productBundleDao.updateProductBundleCourseFlag(productBundleDto.getId());
        save(productBundleDto,enrichmentProductbundle.getId());

    }

    private void DoesIDexist(Integer id){
        if(id==null || null == productBundleDao.DoesIDexist(id)){
            throw new BizException(ProductbundleError.NO_PRODUCTBUNDLE);
        }
    }

    @Override
    public void deleteProductBundle(Integer id) {
        DoesIDexist(id);
        productBundleDao.deleteProductBundleCourse(id);
        productBundleDao.deleteProductBundle(id);
    }

    @Override
    public List<ProductBundleDto> getProductBundle() {
        return productBundleDao.getProductBundle();
    }

    @Override
    public ProductBundleDto getProductBundleById(Integer id) {
        DoesIDexist(id);
        return productBundleDao.getProductBundleById(id);
    }

    @Override
    public FinanceHqfinance getFinanceSet(LoginUser loginUser) {
        Integer hq = getHqId(loginUser);
        List<FinanceHqfinance> hqfinanceList = financeSetDao.getFinanceSet(hq);
        if(hqfinanceList == null || hqfinanceList.size()==0){
            FinanceHqfinance financeHqfinance = new FinanceHqfinance();
            financeHqfinance.setHqId(hq);
            financeHqfinance.setGstEnabled(true);
            financeHqfinance.setGst(BigDecimal.valueOf(0.00));
            financeHqfinance.setGstCreditNoteEnabled(true);
            financeHqfinance.setGstCreditNote(BigDecimal.valueOf(0.00));
            financeSetDao.saveFinanceSet(financeHqfinance);
            return financeHqfinance;
        }else{
            return hqfinanceList.get(0);
        }
    }

    @Override
    public FinanceHqfinance updateFinanceSet(FinanceHqfinance financeHqfinance, LoginUser loginUser) {
        Integer hq = getHqId(loginUser);
        financeHqfinance.setHqId(hq);
        financeSetDao.updateFinanceSet(financeHqfinance);
        return financeHqfinance;
    }
}
