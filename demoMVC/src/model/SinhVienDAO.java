package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBAccess;

public class SinhVienDAO implements SinhVienInterface {
    DBAccess access;
    Connection conn;

    public SinhVienDAO() throws ClassNotFoundException, SQLException {
        access = new DBAccess();
        conn = access.getConnection();
    }

    @Override
    public SinhVien searchSV(int mssv) {
        String sql = "SELECT *FROM SINHVIEN WHERE MSSV = ?";
        PreparedStatement statement;
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1,mssv);
            ResultSet resultSet = statement.executeQuery();
            SinhVien sinhVien = new SinhVien();
            while (resultSet.next()) {
                int mssv1 = resultSet.getInt("MSSV");
                String name = resultSet.getString("NAME");
                String className = resultSet.getString("CLASS");
                String address = resultSet.getString("ADREESS");
                sinhVien = new SinhVien(mssv1, name, className, address);
            }
            return sinhVien;
        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }

    @Override
    public List<SinhVien> getAllSV() {
        String sql = "SELECT  MSSV,NAME,CLASS,ADREESS FROM SINHVIEN";
        PreparedStatement statement;
        try {
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            List<SinhVien> list = new ArrayList<SinhVien>();
            while (resultSet.next()) {
                int mssv = resultSet.getInt("mssv");
                String name = resultSet.getString("Name");
                String className = resultSet.getString("CLASS");
                String address = resultSet.getString("ADREESS");
                SinhVien sinhVien = new SinhVien(mssv, name, className, address);
                list.add(sinhVien);
            }
            return list;
        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }

    @Override
    public void addSinhVien(SinhVien obj) {
        String sql = "INSERT INTO SinhVien (MSSV,NAME,CLASS,ADREESS) values (?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = conn.prepareStatement(sql);
            statement.setInt(1, obj.getMssv());
            statement.setString(2, obj.getName());
            statement.setString(3, obj.getClassName());
            statement.setString(4, obj.getAddress());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
