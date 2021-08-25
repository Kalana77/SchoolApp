package com.kalana.schoolapp.controller;

import com.kalana.schoolapp.dto.StudentDto;
import com.kalana.schoolapp.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    public void createStudent(StudentDto studentDto){
        StudentService studentService = StudentService.getStudentService();
        studentService.createStudent(studentDto);

    }
}
