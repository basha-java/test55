package com.basha.sms_crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basha.sms_crud.entity.Student;

@Repository
//JpaRepository provides all CRUD methods automatically
public interface StudentRepository extends JpaRepository<Student, Long> {

}
