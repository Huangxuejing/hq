package com.taidii.staffdevelopment.dao.impl;

import com.taidii.staffdevelopment.dao.ISkillGuidingsDAO;
import com.taidii.staffdevelopment.dao.impl.DAOImpl;
import com.taidii.staffdevelopment.entity.DevelopSkillGuidings;
import com.taidii.staffdevelopment.entity.DevelopSkillGuidingsExample;
import org.springframework.stereotype.Repository;

@Repository("skillGuidingsDAO")
public class SkillGuidingsDAOImpl extends DAOImpl<DevelopSkillGuidings,DevelopSkillGuidingsExample> implements ISkillGuidingsDAO {
}
