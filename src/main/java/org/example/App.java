package org.example;

import jakarta.persistence.EntityManager;
import org.example.configuration.HibernateConfig;
import org.example.entity.Courses;
import org.example.entity.Students;
import org.example.service.CoursesService;
import org.example.service.StudentsService;
import org.example.service.impl.CoursesServiceImpl;
import org.example.service.impl.StudentsServiceImpl;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        StudentsService studentsService = new StudentsServiceImpl();
        //LocalDate createdAt = LocalDate.of(2023,4,3);
        //LocalDate createdAt = LocalDate.of(2023,1,3);
        //System.out.println(studentsService.saveStudents(new Students("Kanat Marat", 25, "kanat@gmail.com", createdAt)));
        //System.out.println(studentsService.getAllStudents());
        //System.out.println(studentsService.updateStudents(2L, new Students("Sanat Barat", 19, "sanat@gmail.com", createdAt)));
        //studentsService.deleteStudentsById(2L);

        CoursesService coursesService = new CoursesServiceImpl();
        //LocalDate dateOfStart = LocalDate.of(2023,4,3);
        //LocalDate dateOfFinish = LocalDate.of(2023,12,3);

        //coursesService.saveCourse(new Courses("Java-10", "desk", dateOfStart, dateOfFinish));
        //System.out.println(coursesService.findCoursesById(2L));
        //coursesService.deleteCourseById(2L);


    }
}
