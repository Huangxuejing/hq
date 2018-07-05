package com.taidii.staffdevelopment.dao.impl;

import com.taidii.staffdevelopment.dao.IUserCourseDAO;
import com.taidii.staffdevelopment.entity.DevelopUserCourse;
import com.taidii.staffdevelopment.entity.DevelopUserCourseExample;
import org.springframework.stereotype.Service;

@Service
public class UserCourseDAO extends DAOImpl<DevelopUserCourse, DevelopUserCourseExample> implements IUserCourseDAO{
}
