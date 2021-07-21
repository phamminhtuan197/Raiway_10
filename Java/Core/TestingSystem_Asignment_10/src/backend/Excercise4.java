package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Excercise4 {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static PreparedStatement preparedStatement;

	public static Connection connect() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

	public static void deleteDepartmentByID(int departmentID) throws ClassNotFoundException, SQLException {
		connect();
		connection.setAutoCommit(false);

		String deleteDepartment = "DELETE FROM department WHERE departmentID = ?;";
		preparedStatement = connection.prepareStatement(deleteDepartment);
		preparedStatement.setInt(1, departmentID);
		try {
			preparedStatement.executeUpdate();
			System.out.println("Delete Department complete");
			connection.commit();
			System.out.println("Transaction Commit!");
		} catch (Exception e) {
			System.out.println(e.getMessage());

			connection.rollback();
			System.out.println("Transaction Rollback!");
		}
	}
}
