package com.basha.sms_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basha.sms_crud.Repository.StudentRepository;
import com.basha.sms_crud.entity.Student;


@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		// Fetch all records from DB
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		// find student by ID
		return studentRepository.findById(id).orElse(null);
	}

	@Override
	public Student addStudent(Student student) {
		// Save new student
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		// delete student by ID
		studentRepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Student student) {
//		Update student (same save method works)
		return studentRepository.save(student);
	}

}
