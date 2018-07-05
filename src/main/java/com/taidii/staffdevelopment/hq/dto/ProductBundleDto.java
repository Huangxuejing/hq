package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @class: ProductBundleDto
 * @desc:
 * @author: huangxuejing
 * @date: 2018/6/21
 */
public class ProductBundleDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String chargingItem;
    private String itemCode;
    private Double amountBefore;
    private Double amountAfter;
    private String remarks;
    private List<CourseLevelDto> courseLevelDtos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChargingItem() {
        return chargingItem;
    }

    public void setChargingItem(String chargingItem) {
        this.chargingItem = chargingItem;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Double getAmountBefore() {
        return amountBefore;
    }

    public void setAmountBefore(Double amountBefore) {
        this.amountBefore = amountBefore;
    }

    public Double getAmountAfter() {
        return amountAfter;
    }

    public void setAmountAfter(Double amountAfter) {
        this.amountAfter = amountAfter;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<CourseLevelDto> getCourseLevelDtos() {
        return courseLevelDtos;
    }

    public void setCourseLevelDtos(List<CourseLevelDto> courseLevelDtos) {
        this.courseLevelDtos = courseLevelDtos;
    }
}
