package com.taidii.staffdevelopment.dao.impl;

import org.springframework.stereotype.Repository;

import com.taidii.staffdevelopment.dao.ISelfEvaluationReflectionDAO;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationReflection;
import com.taidii.staffdevelopment.entity.DevelopSelfEvaluationReflectionExample;

@Repository("selfEvaluationReflectionDAO")
public class SelfEvaluationReflectionDAOImpl extends DAOImpl<DevelopSelfEvaluationReflection, DevelopSelfEvaluationReflectionExample> implements ISelfEvaluationReflectionDAO{

}
