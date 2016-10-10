package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface StudentsDAO {

    public Students findStudent(Connection conn, int mssv)  throws SQLException;

    public List<Students> getAllStudent(Connection conn)  throws SQLException;

    public void addStudent(Connection conn,Students obj) throws SQLException;
}
