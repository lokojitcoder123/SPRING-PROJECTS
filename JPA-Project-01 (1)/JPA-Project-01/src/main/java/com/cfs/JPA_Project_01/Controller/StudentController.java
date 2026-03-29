package com.cfs.JPA_Project_01.Controller;


import com.cfs.JPA_Project_01.entity.Student;
import com.cfs.JPA_Project_01.repo.StudentRepo;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }
    @GetMapping
    public List<Student> getAllStudents(){

        return studentRepo.findAll();
    }

    @PatchMapping
    public Student patchStudent(@RequestParam Long id ,@RequestBody Student student){
        Student s = studentRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Student Not Found"));
        return studentRepo.save(student);
    }
}
