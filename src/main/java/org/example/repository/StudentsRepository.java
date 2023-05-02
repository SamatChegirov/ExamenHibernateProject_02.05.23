package org.example.repository;

import org.example.entity.Students;

import java.util.List;

public interface StudentsRepository {

    String saveStudents(Students students);
    List<Students> getAllStudents();
    String updateStudents(Long id, Students students);
    void deleteStudentsById(Long id);
}
