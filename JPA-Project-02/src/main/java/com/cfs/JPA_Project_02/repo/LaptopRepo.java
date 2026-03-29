package com.cfs.JPA_Project_02.repo;

import com.cfs.JPA_Project_02.entity.Laptop;
import com.cfs.JPA_Project_02.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}