package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jdk.management.resource.ResourceRequestDeniedException;

public class DBAccess {
   private static Connection conn;
    // Kết nối vào SQLServer.
    public Connection getConnection() throws SQLException,
            ClassNotFoundException {
         
        // Chú ý: Thay đổi các thông số kết nối cho phù hợp.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
                "databaseName=QLSINHVIEN;user=sa;password=123456;";  
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection(connectionUrl);
        return conn;
    }
}
