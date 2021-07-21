package frontend;

import java.sql.SQLException;

import backend.Excercise4;

public class Program4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Excercise4 e4 = new Excercise4();
		e4.deleteDepartmentByID(3);
	}
}
