package app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Application {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/d11-introduction-to-jpa?useSSL=false";
		String username = "postgres";
		String password = "schia";
		Connection conn = null;
		try {
			System.out.println("Connecting to DB...");

			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
