package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String DBUrl = "jdbc:mysql://localhost:3306/azienda";
	private static Connection conn=null;
	
	private DBConnection() {}
	
	public static Connection dbConnect(String user, String passw) throws SQLException {
		if (conn==null) conn=DriverManager.getConnection(DBUrl,user,passw);
		return conn;
	}

	public static void dbClose() throws SQLException {
		if (conn!=null) conn.close();
	}
	
}

