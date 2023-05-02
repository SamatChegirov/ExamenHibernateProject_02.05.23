package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor

public class Courses {
    @Id
    @GeneratedValue(
            generator = "courses_gen",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "courses_gen",
            sequenceName = "courses_seg",
            allocationSize = 1
    )
    private Long id;
    private String courseName;
    private String description;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;

    public Courses(String courseName, String description, LocalDate dateOfStart, LocalDate dateOfFinish) {
        this.courseName = courseName;
        this.description = description;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    @ManyToMany(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH})
    private List<Students> students;

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", dateOfFinish=" + dateOfFinish +
                '}';
    }
}
