package com.simplydockercompose.controller;

import com.simplydockercompose.domain.Student;
import com.simplydockercompose.service.StudentDBService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@Slf4j
@RequiredArgsConstructor
public class StudentApiController {
    private final StudentDBService studentDBService;

    @PostMapping()
    public Student save(@RequestBody Student student){
        return studentDBService.save(student);
    }

    @GetMapping
    public List<Student> findAll(){
        return studentDBService.findAll();
    }
}
