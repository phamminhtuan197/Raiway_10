package frontend;

import java.sql.SQLException;
import backend.Excercise1;

public class Program1 {
	private static Excercise1 e1 = new Excercise1();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		e1.question1();
		e1.question2();
		e1.question3();
		e1.question4();
		e1.question5();
	}
}
