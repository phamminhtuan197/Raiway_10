package backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Excercise3 {
	private static Scanner scanner = new Scanner(System.in);
	private static PreparedStatement preparedStatement;
	private static CallableStatement callableStatement;

	private static Connection connection;
	private static ResultSet resultSet;

	public static Connection connect() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

	public static boolean isDepartmentExists(int id) throws SQLException, ClassNotFoundException {
		connect();

		String sql = "SELECT * FROM Department WHERE departmentID = ?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public static void deleteDepartmentUsingProcedure(int departmentID) throws Exception {
		connect();

		if (!isDepartmentExists(departmentID)) {
			throw new Exception("Cannot find department which has id = " + departmentID);
		} else {
			String callProcedureDeleteDepartment = "CALL sp_delete_department(?);";
			callableStatement = connection.prepareCall(callProcedureDeleteDepartment);
			callableStatement.setInt(1, departmentID);
			callableStatement.executeUpdate();
			System.out.println("Delete department success");
		}
	}
}
