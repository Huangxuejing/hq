package com.taidii.staffdevelopment.dao.impl;

import org.springframework.stereotype.Repository;

import com.taidii.staffdevelopment.dao.IPromotionDAO;
import com.taidii.staffdevelopment.entity.DevelopPromotion;
import com.taidii.staffdevelopment.entity.DevelopPromotionExample;

@Repository("promotionDAO")
public class PromotionDAOImpl extends DAOImpl<DevelopPromotion,DevelopPromotionExample> implements IPromotionDAO {


}
