package exma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/test";
		String id = "hr";
		String pwd = "hr";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		Statement stmt = conn.createStatement();
		String sql = "SELECT * FROM TABLE_USER";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int num = rs.getInt("USER_NUM");
			String user_id = rs.getString("USER_ID");
			String user_pwd = rs.getString("USER_PWD");
			System.out.println(num + " " + user_id + " " + user_pwd);
		}
	}
}
