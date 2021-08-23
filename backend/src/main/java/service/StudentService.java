package service;

import domain.Student;
import dto.StudentDto;
import repository.StudentDao;

public class StudentService {
    private static StudentService studentService = new StudentService();

    private StudentService(){}

    public static StudentService getStudentService() {
        return studentService;
    }

    public void createStudent(StudentDto studentDto) {
        System.out.println("create student service layer " + studentDto);
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
