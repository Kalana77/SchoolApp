package com.kalana.schoolapp.controller;

import com.kalana.schoolapp.dto.StudentDto;
import com.kalana.schoolapp.repository.StudentDao;
import com.kalana.schoolapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    public void createStudent(StudentDto studentDto){

        studentService.createStudent(studentDto);

    }
}
