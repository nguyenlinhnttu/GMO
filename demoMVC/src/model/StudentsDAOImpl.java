package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAOImpl implements StudentsDAO {

    public StudentsDAOImpl() {

    }
    
    //Search student with key
    public Students findStudent(Connection conn, int mssv) throws SQLException {
        String sql = "SELECT * FROM STUDENT WHERE MSSV = ?";
        PreparedStatement statement;
        statement = conn.prepareStatement(sql);
        
        statement.setInt(1, mssv);
        ResultSet resultSet = statement.executeQuery();
        Students students = new Students();
        while (resultSet.next()) {
            int mssv1 = resultSet.getInt("MSSV");
            String name = resultSet.getString("NAME");
            String className = resultSet.getString("CLASS");
            String address = resultSet.getString("ADREESS");
            students = new Students(mssv1, name, className, address);
        }
        return students;
    }
    
    //Get all student
    @Override
    public List<Students> getAllStudent(Connection conn) throws SQLException {
        String sql = "SELECT  * FROM STUDENT";
        PreparedStatement statement;
        statement = conn.prepareStatement(sql);
        
        ResultSet resultSet = statement.executeQuery();
        List<Students> listStudent = new ArrayList<Students>();
        while (resultSet.next()) {
            int mssv = resultSet.getInt("MSSV");
            String name = resultSet.getString("NAME");
            String className = resultSet.getString("CLASS");
            String address = resultSet.getString("ADREESS");
            Students students = new Students(mssv, name, className, address);
            listStudent.add(students);
        }
        return listStudent;
    }
    
    //Add new student
    @Override
    public void addStudent(Connection conn, Students obj) throws SQLException {
        String sql = "INSERT INTO STUDENT (MSSV,NAME,CLASS,ADREESS) values (?,?,?,?)";
        PreparedStatement statement;
        statement = conn.prepareStatement(sql);
        
        statement.setInt(1, obj.getMssv());
        statement.setString(2, obj.getName());
        statement.setString(3, obj.getClassName());
        statement.setString(4, obj.getAddress());
        statement.executeUpdate();
    }
}
