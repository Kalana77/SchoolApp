package controller;

import dto.StudentDto;
import service.StudentService;

public class StudentController {
    public void createStudent(StudentDto studentDto){
        StudentService studentService = StudentService.getStudentService();
        studentService.createStudent(studentDto);

    }
}
