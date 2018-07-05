package com.taidii.staffdevelopment.hq.entity;

public class CentersCenterWithBLOBs extends CentersCenter {
    private String address;

    private String aboutUs;

    private String website;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs == null ? null : aboutUs.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }
}