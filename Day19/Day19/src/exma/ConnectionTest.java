package exma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test";
		String id = "hr";
		String pwd = "hr";
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결성공 ... ");
		
		} catch (SQLException e) {
			System.out.println("연결실패 ... ");
			e.printStackTrace();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
		}
	}
}
