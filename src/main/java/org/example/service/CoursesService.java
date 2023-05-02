package org.example.service;

import org.example.entity.Courses;

import java.util.List;

public interface CoursesService {
    String saveCourse(Courses courses);
    List<Courses> findCoursesById(Long id);

    void deleteCourseById(Long id);
}
