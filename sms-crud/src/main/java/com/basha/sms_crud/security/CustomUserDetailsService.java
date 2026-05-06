package com.basha.sms_crud.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.basha.sms_crud.entity.Student;
import com.basha.sms_crud.Repository.StudentRepository;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Student student = studentRepository.findAll()
                .stream()
                .filter(s -> s.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new User(
                student.getEmail(),
                "{noop}" + student.getPassword(),   // ✅ IMPORTANT (for plain passwords like 123)
                Collections.singleton(new SimpleGrantedAuthority(student.getRole()))
        );
    }
}