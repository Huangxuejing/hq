package com.taidii.staffdevelopment.dto.settings;

import java.io.Serializable;
import java.util.List;

public class FrameworkSkillDto implements Serializable {

    private List<DomainDto> basicSkills;
    private List<DomainDto> customSkills;


    public List<DomainDto> getBasicSkills() {
        return basicSkills;
    }

    public void setBasicSkills(List<DomainDto> basicSkills) {
        this.basicSkills = basicSkills;
    }

    public List<DomainDto> getCustomSkills() {
        return customSkills;
    }

    public void setCustomSkills(List<DomainDto> customSkills) {
        this.customSkills = customSkills;
    }
}
