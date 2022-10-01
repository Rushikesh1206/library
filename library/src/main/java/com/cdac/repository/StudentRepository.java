package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.pojo.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
