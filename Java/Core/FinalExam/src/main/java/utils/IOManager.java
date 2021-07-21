package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class IOManager {
	public static Scanner scanner = new Scanner(System.in);

	public static void readFile(String pathFile) throws IOException {
		if (!FileManager.isFileExists(pathFile)) {
			throw new IOException(FileManager.FILE_NOT_EXISTS);
		} else {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(pathFile));
			System.out.println("Noi dung file la: ");

			int num = 0;
			char ch;

			while ((num = br.read()) != -1) {
				ch = (char) num;
				System.out.print(ch);
			}
		}
	}

	public static void writeFile(String pathFile, String content) throws IOException {
		if (!FileManager.isFileExists(pathFile)) {
			throw new IOException(FileManager.FILE_NOT_EXISTS);
		} else {
			BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile, true));
			System.out.println("Nhap noi dung muon viet vao file");
			content = scanner.nextLine();
			bw.write(content);
			System.out.println("Da viet xong");
			bw.close();
		}
	}

	public static <T> void writeObject(T object, String pathFile) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathFile));
		oos.writeObject(object);
		System.out.println("Success...");
		oos.close();
	}

	@SuppressWarnings("unchecked")
	public static <T> void readObject(T object, String pathFile) throws IOException, ClassNotFoundException {
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathFile));
		// read object
		object = (T) ois.readObject();
		// show student
		System.out.println(object.toString());
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Student student1 = new Student(1, "Pham Minh Tuan");
//		writeFile("C:\\Users\\Public\\new\\Test1.txt");
//		readFile("C:\\Users\\Public\\new\\Test1.txt");
//		writeObject("C:\\Users\\Public\\new\\Test1.txt");
//		IOManager.<Student>writeObject(student1,"C:\\Users\\Public\\new\\Test1.txt");
//		IOManager.<Student>readObject("C:\\Users\\Public\\new\\Test1.txt");
		
	}
}
