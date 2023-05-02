package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import org.example.configuration.HibernateConfig;
import org.example.entity.Students;
import org.example.repository.StudentsRepository;

import java.util.List;

public class StudentsRepositoryImpl implements StudentsRepository {

    EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public String saveStudents(Students students) {
        entityManager.getTransaction().begin();
        entityManager.persist(students);
        entityManager.getTransaction().commit();
        entityManager.close();
        return students.getFullName();
    }

    @Override
    public List<Students> getAllStudents() {
        entityManager.getTransaction().begin();
        List<Students> selectStudents = entityManager.createQuery("select students from Students students", Students.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return selectStudents;
    }

    @Override
    public String updateStudents(Long id, Students students) {
        entityManager.getTransaction().begin();
        Students student = entityManager.find(Students.class, id);
        student.setFullName(students.getFullName());
        student.setAge(students.getAge());
        student.setEmail(students.getEmail());
        student.setCreatedAt(students.getCreatedAt());
        entityManager.getTransaction().commit();
        entityManager.close();
        return student + " is updated.";
    }

    @Override
    public void deleteStudentsById(Long id) {
        entityManager.getTransaction().begin();
        Students student = entityManager.find(Students.class, id);
        entityManager.remove(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(id + " is deleted.");
    }
}
