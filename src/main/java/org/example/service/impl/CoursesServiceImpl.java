package org.example.service.impl;

import org.example.entity.Courses;
import org.example.repository.impl.CoursesRepositoryImpl;
import org.example.service.CoursesService;

import java.util.List;

public class CoursesServiceImpl implements CoursesService {

    CoursesRepositoryImpl coursesRepository = new CoursesRepositoryImpl();

    @Override
    public String saveCourse(Courses courses) {
        return coursesRepository.saveCourse(courses);
    }

    @Override
    public List<Courses> findCoursesById(Long id) {
        return coursesRepository.findCoursesById(id);
    }

    @Override
    public void deleteCourseById(Long id) {
       coursesRepository.deleteCourseById(id);
    }
}
