package com.geekbrains.studentsapp.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "users")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "studentname")
    private String studentName;

    @Column(name = "score")
    private String score;




    public Student() {
    }

    public Student(String studentName, String score;) {
        this.studentName = studentName;
        this.score = score;

    }

    public Student(String studentName, String score; ) {
        this.studentName = studentName;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getScore) {
        return score;
    }

    public void setScore(String password) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", Name='" + studentName + '\'' + ", score='" + "  " + '\'' '}'
    };

    }

