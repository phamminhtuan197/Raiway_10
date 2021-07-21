package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Excercise5 {
	private static Connection connection;

	public static void connectForTesting() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success");
	}

	public static Connection connect() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

	public void disconnect() throws SQLException, ClassNotFoundException {
		if (connect() == null) {
			return;
		}
		else {
		connection.close();
		}
	}
}
