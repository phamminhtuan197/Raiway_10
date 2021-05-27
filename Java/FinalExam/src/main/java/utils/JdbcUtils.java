package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	private static DatabaseProperties databaseProperties;
	private static Connection connection;

	public JdbcUtils() throws FileNotFoundException, IOException {
		databaseProperties = new DatabaseProperties();
	}

	public static void isConnectedForTesting() throws ClassNotFoundException, SQLException {

		String url = databaseProperties.getProperty("url");
		String username = databaseProperties.getProperty("username");
		String password = databaseProperties.getProperty("password");

		Class.forName(databaseProperties.getProperty("driver"));

		connection = DriverManager.getConnection(url, username, password);
		System.out.println(databaseProperties.getProperty("CONNECT_SUCCESS"));
	}

	public static Connection connect()
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException, SQLException {

		String url = databaseProperties.getProperty("url");
		String username = databaseProperties.getProperty("username");
		String password = databaseProperties.getProperty("password");

		Class.forName(databaseProperties.getProperty("driver"));

		connection = DriverManager.getConnection(url, username, password);

		return connection;
	}

	public void disconnect() throws SQLException {
		connection.close();
	}
}
