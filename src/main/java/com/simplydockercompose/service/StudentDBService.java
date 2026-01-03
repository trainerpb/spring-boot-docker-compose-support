package com.simplydockercompose.service;

import com.simplydockercompose.dal.StudentRepository;
import com.simplydockercompose.domain.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentDBService {
  private final StudentRepository studentRepository;

  public Student save(Student s){
      return studentRepository.save(s);
  }

  public List<Student> findAll(){
      return studentRepository.findAll();
  }
}
