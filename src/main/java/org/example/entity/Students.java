package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor

public class Students {
    @Id
    @GeneratedValue(
            generator = "students_gen",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "students_gen",
            sequenceName = "students_seg",
            allocationSize = 1
    )
    private Long id;
    private String fullName;
    private int age;
    private String email;
    private LocalDate createdAt;


    public Students(String fullName, int age, String email, LocalDate createdAt) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.createdAt = createdAt;
    }

    @ManyToMany(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH},
            mappedBy = "students")
    private List<Courses> courses;

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
