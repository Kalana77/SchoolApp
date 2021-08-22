package repository;

import domain.Student;
import utill.DbConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {

    public void createStudent(Student stu) {

        try {
            Connection connection = DbConnector.getConnection();
            String query = "insert into student(fname,lname,email,index_no,address,mobil_no) values (?,?,?,?,?,?)";
            PreparedStatement prestm = connection.prepareStatement(query);
            prestm.setString(1,stu.getFname());
            prestm.setString(2,stu.getLname());
            prestm.setString(3,stu.getEmail());
            prestm.setString(4,stu.getIndexNo());
            prestm.setString(5,stu.getAddress());
            prestm.setString(6,stu.getMobileNum());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

}
