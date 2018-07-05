package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;

public class FinanceHqfinance {
    private Integer id;

    private Integer hqId;

    private Boolean gstEnabled;

    private BigDecimal gst;

    private Boolean gstCreditNoteEnabled;

    private BigDecimal gstCreditNote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHqId() {
        return hqId;
    }

    public void setHqId(Integer hqId) {
        this.hqId = hqId;
    }

    public Boolean getGstEnabled() {
        return gstEnabled;
    }

    public void setGstEnabled(Boolean gstEnabled) {
        this.gstEnabled = gstEnabled;
    }

    public BigDecimal getGst() {
        return gst;
    }

    public void setGst(BigDecimal gst) {
        this.gst = gst;
    }

    public Boolean getGstCreditNoteEnabled() {
        return gstCreditNoteEnabled;
    }

    public void setGstCreditNoteEnabled(Boolean gstCreditNoteEnabled) {
        this.gstCreditNoteEnabled = gstCreditNoteEnabled;
    }

    public BigDecimal getGstCreditNote() {
        return gstCreditNote;
    }

    public void setGstCreditNote(BigDecimal gstCreditNote) {
        this.gstCreditNote = gstCreditNote;
    }
}