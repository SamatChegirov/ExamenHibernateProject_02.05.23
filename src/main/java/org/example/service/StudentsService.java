package org.example.service;

import org.example.entity.Students;

import java.util.List;

public interface StudentsService {

    String saveStudents(Students students);
    List<Students> getAllStudents();
    String updateStudents(Long id, Students students);
    void deleteStudentsById(Long id);
}
