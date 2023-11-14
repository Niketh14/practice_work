package com.jwt.service;



import java.util.List;

import com.jwt.model.Course;

public interface CourseService
{

    List<Course> all();

    void save( Course course );

    void delete( String courseId );

	void save1(Course course);

	Course getCourseById(String courseId);
}