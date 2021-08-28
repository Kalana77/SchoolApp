package com.kalana.schoolapp.repository;

import com.kalana.schoolapp.domain.Student;
import com.kalana.schoolapp.utill.DbConnector;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class StudentDao {

    public void createStudent(Student stu) {

        try {
            Connection connection = DbConnector.getConnection();
            String query = "insert into student(fname,lname,email,index_no,address,mobile_no) values (?,?,?,?,?,?)";
            PreparedStatement prestm = connection.prepareStatement(query);
            prestm.setString(1, stu.getFname());
            prestm.setString(2, stu.getLname());
            prestm.setString(3, stu.getEmail());
            prestm.setString(4, stu.getIndexNo());
            prestm.setString(5, stu.getAddress());
            prestm.setString(6, stu.getMobileNum());
            prestm.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Student getStudent(long id) {

        try {
            Connection connection = DbConnector.getConnection();
            String query = "select * from student where id = ?";
            PreparedStatement prestm = connection.prepareStatement(query);
            prestm.setLong(1, id);

            ResultSet resultSet = prestm.executeQuery();
            Student student = new Student();
            if (!resultSet.next())
                return null;
            while (resultSet.next()) {
                student.setId(resultSet.getLong(1));
                student.setFname(resultSet.getString(2));
                student.setLname(resultSet.getString(3));
                student.setEmail(resultSet.getString(4));
                student.setIndexNo(resultSet.getString(5));
                student.setAddress(resultSet.getString(6));
                student.setMobileNum(resultSet.getString(7));

            }
            return student;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }

    }
}
