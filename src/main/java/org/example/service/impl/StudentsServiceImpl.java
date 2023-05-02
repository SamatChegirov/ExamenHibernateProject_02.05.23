package org.example.service.impl;

import org.example.entity.Students;
import org.example.repository.impl.StudentsRepositoryImpl;
import org.example.service.StudentsService;

import java.util.List;

public class StudentsServiceImpl implements StudentsService {
    StudentsRepositoryImpl studentsRepository = new StudentsRepositoryImpl();

    @Override
    public String saveStudents(Students students) {
        return studentsRepository.saveStudents(students);
    }

    @Override
    public List<Students> getAllStudents() {
        return studentsRepository.getAllStudents();
    }

    @Override
    public String updateStudents(Long id, Students students) {
        return studentsRepository.updateStudents(id, students);
    }

    @Override
    public void deleteStudentsById(Long id) {
        studentsRepository.deleteStudentsById(id);
    }
}
