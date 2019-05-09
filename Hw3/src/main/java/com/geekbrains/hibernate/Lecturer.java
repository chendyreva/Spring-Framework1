package com.geekbrains.hibernate;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

    @Entity
    @Table(name = "lecturers")

    public class Lecturer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name = "name")
        private String name;

        @OneToMany(mappedBy = "lecturer_id")
        @Cascade(org.hibernate.annotations.CascadeType.DELETE)
        private List<Course> courses;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Lecturer() {
        }

        @Override
        public String toString(){
            String allCourses = "";
            for (Course o: courses) {
                allCourses += o.getTitle() + " ";
            }
            return "Lecturer [" + id + " " + name + " " + "[ " + allCourses +  "] ]";
        }
    }
