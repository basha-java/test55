package com.basha.sms_crud.service;

import java.util.List;

import com.basha.sms_crud.entity.Student;

//interface defines what operations we are perform
public interface StudentService {

	List<Student> getAllStudents();

	Student getStudentById(Long id); // Get student by Id

	Student addStudent(Student student); // Add new student

	void deleteStudent(Long id); // Delete student

	Student updateStudent(Student student); //update student

}
