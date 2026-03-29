package com.cfs.JPA_Project_01.repo;

import com.cfs.JPA_Project_01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
