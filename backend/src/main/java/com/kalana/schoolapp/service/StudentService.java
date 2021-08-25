package com.kalana.schoolapp.service;

import com.kalana.schoolapp.domain.Student;
import com.kalana.schoolapp.dto.StudentDto;
import com.kalana.schoolapp.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void createStudent(StudentDto studentDto) {
        System.out.println("create student com.kalana.schoolapp.service layer " + studentDto);

        Student student = new Student();
        student.setFname(studentDto.getFname());
        student.setLname(studentDto.getLname());
        student.setAddress(studentDto.getAddress());
        student.setEmail(studentDto.getEmail());
        student.setIndexNo(studentDto.getIndexNo());
        student.setMobileNum(studentDto.getMobileNum());

        studentDao.createStudent(student);

    }

}
