package com.kalana.schoolapp.controller;

import com.kalana.schoolapp.dto.StudentDto;
import com.kalana.schoolapp.service.StudentService;

public class StudentController {
    public void createStudent(StudentDto studentDto){
        StudentService studentService = StudentService.getStudentService();
        studentService.createStudent(studentDto);

    }
}
