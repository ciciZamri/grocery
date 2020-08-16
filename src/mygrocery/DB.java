package mygrocery;

import java.sql.*;

public class DB {
    private String DB_URL = "";
    private String USER = "mysql";
    private String PASSWORD = "mysql";
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    
    public DB() {
    	DB_URL = "jdbc:mysql://localhost/grocery?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    }
    
    public DB(String databaseName, String username, String password) {
    	DB_URL = "jdbc:mysql://localhost/"+ databaseName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    	USER = username;
    	PASSWORD = password;
    }
    
    public ResultSet execute(String sql) {
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			stmt = conn.createStatement();
	        rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return rs;
    }
    
    public void executeUpdate(String sql) {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void close() {
    	try {
			rs.close();
			stmt.close();
	    	conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
}
