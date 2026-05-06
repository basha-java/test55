package com.basha.sms_crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity // Marks this class as a database table
@Table(name = "students") // Table name in DB
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment ID

	private long id;
	@Column(name = "firstname") // Column mapping
	private String firstName;
	
	@Column(name = "lastname") // Column mappinga
	private String lastName;

	private String email;
	
	private String password;
	private String role; // ADMIN or USER
	
	

}
