package com.kalana.schoolapp.controller;

import com.kalana.schoolapp.dto.StudentDto;
import com.kalana.schoolapp.repository.StudentDao;
import com.kalana.schoolapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public void createStudent(@RequestBody StudentDto studentDto) {

        studentService.createStudent(studentDto);

    }

    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    public StudentDto getStudent(@PathVariable long id) {

        StudentDto student = studentService.getStudent(id);
        return student;
    }
}
