package com.taidii.staffdevelopment.hq.entity;

public class EnrichmentRoom {
    private Integer id;

    private Integer centerId;

    private String name;

    private String description;

    private Integer capacity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}