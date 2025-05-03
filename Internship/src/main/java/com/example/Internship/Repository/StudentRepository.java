package com.example.Internship.Repository;

import com.example.Internship.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity , Integer> {
    StudentEntity findByStudName(String studName);
}
