package frontend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entity.Student;

public class Excercise2 {
	public static void main(String[] args) {
//		question1:
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		try {
			date = formatter.parse("18/05/2020");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
//		question2:
		Student st1 = new Student("Nguyen Van A");
		System.out.println(st1);

		System.out.println(st1.getId2());

	}
}
