package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import org.example.configuration.HibernateConfig;
import org.example.entity.Courses;
import org.example.repository.CoursesRepository;

import java.util.ArrayList;
import java.util.List;

public class CoursesRepositoryImpl implements CoursesRepository {
    EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public String saveCourse(Courses courses) {
        entityManager.getTransaction().begin();
        entityManager.persist(courses);
        entityManager.getTransaction().commit();
        entityManager.close();
        return courses.getCourseName();
    }

    @Override
    public List<Courses> findCoursesById(Long id) {
        List<Courses> course = new ArrayList<>();
        entityManager.getTransaction().begin();
        course.add(entityManager.find(Courses.class, id));
        entityManager.getTransaction().commit();
        entityManager.close();
        return course;
    }

    @Override
    public void deleteCourseById(Long id) {
        entityManager.getTransaction().begin();
        Courses courses = entityManager.find(Courses.class, id);
        entityManager.remove(courses);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(courses.getCourseName() + " is deleted.");
    }
}
