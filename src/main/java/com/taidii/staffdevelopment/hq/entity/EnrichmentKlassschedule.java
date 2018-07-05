package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EnrichmentKlassschedule {
    private Integer id;

    private Integer hqId;

    private Integer centerId;

    private String klassname;

    private Integer courseId;

    private Integer levelId;

    private Integer type;

    private BigDecimal unitPrice;

    private Integer numberOfClass;

    private Integer teacherId;

    private Integer assistantId;

    private Integer roomId;

    private Integer capacity;

    private Date dateFrom;

    private Date dateTo;

    private Boolean datePending;

    private Date createdDate;

    private Integer createdById;

    private Date lastUpdate;

    private Integer lastUpdateById;

    private String remarks;

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

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public String getKlassname() {
        return klassname;
    }

    public void setKlassname(String klassname) {
        this.klassname = klassname == null ? null : klassname.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getNumberOfClass() {
        return numberOfClass;
    }

    public void setNumberOfClass(Integer numberOfClass) {
        this.numberOfClass = numberOfClass;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(Integer assistantId) {
        this.assistantId = assistantId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Boolean getDatePending() {
        return datePending;
    }

    public void setDatePending(Boolean datePending) {
        this.datePending = datePending;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getLastUpdateById() {
        return lastUpdateById;
    }

    public void setLastUpdateById(Integer lastUpdateById) {
        this.lastUpdateById = lastUpdateById;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((assistantId == null) ? 0 : assistantId.hashCode());
		result = prime * result
				+ ((capacity == null) ? 0 : capacity.hashCode());
		result = prime * result
				+ ((centerId == null) ? 0 : centerId.hashCode());
		result = prime * result
				+ ((courseId == null) ? 0 : courseId.hashCode());
		result = prime * result
				+ ((createdById == null) ? 0 : createdById.hashCode());
		result = prime * result
				+ ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result
				+ ((dateFrom == null) ? 0 : dateFrom.hashCode());
		result = prime * result
				+ ((datePending == null) ? 0 : datePending.hashCode());
		result = prime * result + ((dateTo == null) ? 0 : dateTo.hashCode());
		result = prime * result + ((hqId == null) ? 0 : hqId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((klassname == null) ? 0 : klassname.hashCode());
		result = prime * result
				+ ((lastUpdate == null) ? 0 : lastUpdate.hashCode());
		result = prime * result
				+ ((lastUpdateById == null) ? 0 : lastUpdateById.hashCode());
		result = prime * result + ((levelId == null) ? 0 : levelId.hashCode());
		result = prime * result
				+ ((numberOfClass == null) ? 0 : numberOfClass.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result
				+ ((teacherId == null) ? 0 : teacherId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((unitPrice == null) ? 0 : unitPrice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnrichmentKlassschedule other = (EnrichmentKlassschedule) obj;
		if (assistantId == null) {
			if (other.assistantId != null)
				return false;
		} else if (!assistantId.equals(other.assistantId))
			return false;
		if (capacity == null) {
			if (other.capacity != null)
				return false;
		} else if (!capacity.equals(other.capacity))
			return false;
		if (centerId == null) {
			if (other.centerId != null)
				return false;
		} else if (!centerId.equals(other.centerId))
			return false;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		if (createdById == null) {
			if (other.createdById != null)
				return false;
		} else if (!createdById.equals(other.createdById))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (dateFrom == null) {
			if (other.dateFrom != null)
				return false;
		} else if (!dateFrom.equals(other.dateFrom))
			return false;
		if (datePending == null) {
			if (other.datePending != null)
				return false;
		} else if (!datePending.equals(other.datePending))
			return false;
		if (dateTo == null) {
			if (other.dateTo != null)
				return false;
		} else if (!dateTo.equals(other.dateTo))
			return false;
		if (hqId == null) {
			if (other.hqId != null)
				return false;
		} else if (!hqId.equals(other.hqId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (klassname == null) {
			if (other.klassname != null)
				return false;
		} else if (!klassname.equals(other.klassname))
			return false;
		if (lastUpdate == null) {
			if (other.lastUpdate != null)
				return false;
		} else if (!lastUpdate.equals(other.lastUpdate))
			return false;
		if (lastUpdateById == null) {
			if (other.lastUpdateById != null)
				return false;
		} else if (!lastUpdateById.equals(other.lastUpdateById))
			return false;
		if (levelId == null) {
			if (other.levelId != null)
				return false;
		} else if (!levelId.equals(other.levelId))
			return false;
		if (numberOfClass == null) {
			if (other.numberOfClass != null)
				return false;
		} else if (!numberOfClass.equals(other.numberOfClass))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (teacherId == null) {
			if (other.teacherId != null)
				return false;
		} else if (!teacherId.equals(other.teacherId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (unitPrice == null) {
			if (other.unitPrice != null)
				return false;
		} else if (!unitPrice.equals(other.unitPrice))
			return false;
		return true;
	}
}