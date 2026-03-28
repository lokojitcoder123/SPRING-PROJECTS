package com.cfs.boot_project02.service;

import com.cfs.boot_project02.repo.StudentRepo;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public String getStudentData() {
        return studentRepo.getStudentData();
    }

}
