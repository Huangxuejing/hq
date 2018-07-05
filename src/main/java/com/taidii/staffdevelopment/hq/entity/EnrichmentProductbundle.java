package com.taidii.staffdevelopment.hq.entity;

public class EnrichmentProductbundle {
    private Integer id;

    private String chargingItem;

    private String itemCode;

    private Double amountBefore;

    private Double amountAfter;

    private String remarks;

    private Integer hqId;

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
        this.chargingItem = chargingItem == null ? null : chargingItem.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
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
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getHqId() {
        return hqId;
    }

    public void setHqId(Integer hqId) {
        this.hqId = hqId;
    }
}