package org.example.repository;

import org.example.entity.Courses;
import org.example.entity.Students;

import java.util.List;

public interface CoursesRepository {

    String saveCourse(Courses courses);
    List<Courses> findCoursesById(Long id);

    void deleteCourseById(Long id);
}
