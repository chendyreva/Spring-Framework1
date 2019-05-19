package com.geekbrains.studentsapp.services;

import com.geekbrains.studentsapp.entities.Role;
import com.geekbrains.studentsapp.entities.Student;
import com.geekbrains.studentsapp.entities.SystemUser;
import com.geekbrains.studentsapp.entities.User;
import com.geekbrains.studentsapp.repositories.ScoreRepository;
import com.geekbrains.studentsapp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collection;


@Service
public class UserServiceImpl implements UserService {
	private StudentRepository studentRepository;
	private ScoreRepository scoreRepository;

	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Autowired
	public void setScoreRepository(ScoreRepository scoreRepository) {
		this.scoreRepository = scoreRepository;
	}



	@Override
	@Transactional
	public Student findByStudentName(String studentName) {
		return studentRepository.findOneByStudentName(studentName);
	}

	@Override
	@Transactional
	public void save(SystemUser systemUser) {
		Student student = new Student();
		student.setStudentName(systemUser.getUserName());

		studentRepository.save(student);
	}

	@Override
	@Transactional
	public StudentDetails loadUserByUsername(String userName) throws StudentnameNotFoundException {
		Student student = studentRepository.findOneByStudentName(studentName);
		if (student == null) {
			throw new StudentnameNotFoundException("Invalid username or score.");
		}
		return new org.springframework.security.core.userdetails.Student(student.getStudentName());
	}

}
