package com.kalana.schoolapp.service;

import com.kalana.schoolapp.domain.Student;
import com.kalana.schoolapp.dto.StudentDto;
import com.kalana.schoolapp.repository.StudentDao;

public class StudentService {
    private static StudentService studentService = new StudentService();

    private StudentService(){}

    public static StudentService getStudentService() {
        return studentService;
    }

    public void createStudent(StudentDto studentDto) {
        System.out.println("create student com.kalana.schoolapp.service layer " + studentDto);
        StudentDao studentDao = StudentDao.getStudentDao();

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
