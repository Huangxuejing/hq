package com.taidii.staffdevelopment.hq.entity;

public class EnrollmentEnrollmentformWithBLOBs extends EnrollmentEnrollmentform {
    private String remarks;

    private String simpleContent;

    private String inspectionData;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getSimpleContent() {
        return simpleContent;
    }

    public void setSimpleContent(String simpleContent) {
        this.simpleContent = simpleContent == null ? null : simpleContent.trim();
    }

    public String getInspectionData() {
        return inspectionData;
    }

    public void setInspectionData(String inspectionData) {
        this.inspectionData = inspectionData == null ? null : inspectionData.trim();
    }
}