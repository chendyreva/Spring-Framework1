package com.geekbrains.studentsapp.repositories;

import com.geekbrains.studentsapp.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findOneByUserName(String studentName);
}
