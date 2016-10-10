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
    
    //Search SinhVien with key
    public Students findStudent(Connection conn, int mssv) throws SQLException {
        String sql = "SELECT *FROM SINHVIEN WHERE MSSV = ?";
        PreparedStatement statement;

        statement = conn.prepareStatement(sql);
        statement.setInt(1, mssv);
        ResultSet resultSet = statement.executeQuery();
        Students sinhVien = new Students();
        while (resultSet.next()) {
            int mssv1 = resultSet.getInt("MSSV");
            String name = resultSet.getString("NAME");
            String className = resultSet.getString("CLASS");
            String address = resultSet.getString("ADREESS");
            sinhVien = new Students(mssv1, name, className, address);
        }
        return sinhVien;

    }
    
    //Get all SinhVien
    @Override
    public List<Students> getAllStudent(Connection conn) throws SQLException {
        String sql = "SELECT  MSSV,NAME,CLASS,ADREESS FROM SINHVIEN";
        PreparedStatement statement;

        statement = conn.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Students> list = new ArrayList<Students>();
        while (resultSet.next()) {
            int mssv = resultSet.getInt("mssv");
            String name = resultSet.getString("Name");
            String className = resultSet.getString("CLASS");
            String address = resultSet.getString("ADREESS");
            Students sinhVien = new Students(mssv, name, className, address);
            list.add(sinhVien);
        }
        return list;
    }
    
    //Add new SinhVien
    @Override
    public void addStudent(Connection conn, Students obj) throws SQLException {
        String sql = "INSERT INTO SinhVien (MSSV,NAME,CLASS,ADREESS) values (?,?,?,?)";
        PreparedStatement statement;

        statement = conn.prepareStatement(sql);
        statement.setInt(1, obj.getMssv());
        statement.setString(2, obj.getName());
        statement.setString(3, obj.getClassName());
        statement.setString(4, obj.getAddress());
        statement.executeUpdate();

    }
}
