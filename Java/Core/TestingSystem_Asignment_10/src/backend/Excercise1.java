package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Excercise1 {
	private static Scanner scanner = new Scanner(System.in);
	private static PreparedStatement preparedStatement;
	private static Statement statement;
	private static Connection connection;

	public static Connection connect() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

	public static void question1() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success");
	}

	public static void question2() throws ClassNotFoundException, SQLException {

		statement = connection.createStatement();

		String printPosition = "SELECT positionID, positionname FROM position;";

		ResultSet resultSet = statement.executeQuery(printPosition);
		while (resultSet.next()) {
			System.out.println(
					"ID= " + resultSet.getInt("positionID") + ", Name= " + resultSet.getString("positionname"));
		}
	}

	public static void question3() throws SQLException {

		System.out.print("Nhap vao ten: ");
		String positionName = scanner.nextLine();
		String insertIntoPosition = "INSERT INTO position (positionname) VALUES (?);";
		preparedStatement = connection.prepareStatement(insertIntoPosition);
		preparedStatement.setString(1, positionName);
		preparedStatement.executeUpdate();

		System.out.println("Insert success");
	}

	public static void question4() throws SQLException {

		String updatePosition = "UPDATE position SET positionname = 'DEV' WHERE positionID = 5;";
		preparedStatement = connection.prepareStatement(updatePosition);
		preparedStatement.executeUpdate();
		System.out.println("Update success");
	}

	public static void question5() throws SQLException {
		System.out.print("Nhap vao ID muon xoa: ");
		int id = scanner.nextInt();

		String depetePosition = "DELETE FROM position WHERE positionID = ?;";
		preparedStatement = connection.prepareStatement(depetePosition);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		System.out.println("Delete success");
	}
}
