package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;

public class FileManager {
	private static final String FILE_EXISTS = "File is exists";
	private static final String CREATE_FILE_SUCCESS = "Create file success";
	private static final String CREATE_FILE_FAIL = "Create file fail";
	private static final String DELETE_FILE_SUCCESS = "Delate file success";
	private static final String DELETE_FILE_FAIL = "Delete file fail";
	public static final String FILE_NOT_EXISTS = "ERROR! File not exists";
	public static final String SOURCE_FILE_NOT_EXISTS = "Source File is not exits!";
	public static final String DESTINATION_FILE_EXISTS = "Destination File is exits!";
//	private static final String CREATE_FOLDER_SUCCESS = "Create folder success";
//	private static final String CREATE_FOLDER_FAIL = "Create folder fail";

//	Check file ton tai?
	public static boolean isFileExists(String pathFile) {
		return new File(pathFile).exists() ? true : false;
	}

//	Tao file moi
	public static void createNewFile(String pathFile) throws Exception {
		if (isFileExists(pathFile)) {
			throw new Exception(FILE_EXISTS);
		}
		boolean result = new File(pathFile).createNewFile();
		System.out.println(result ? CREATE_FILE_SUCCESS : CREATE_FILE_FAIL);

	}

	public static void createFile(String path, String fileName) throws Exception {
		String pathFile = path + "\\" + fileName;
		createNewFile(pathFile);
	}

//	Tao folder moi	
//	public static void createNewFolder(String pathFolder) throws Exception {
//		if (isFileExists(pathFolder)) {
//			throw new Exception("Folder is exists");
//		}
//		boolean result = new File(pathFolder).mkdir();
//		System.out.println(result ? CREATE_FOLDER_SUCCESS : CREATE_FOLDER_FAIL);
//
//	}
//
//	public static void createFolder(String path, String folderName) throws Exception {
//		String pathFolder = path + "\\" + folderName;
//		createNewFile(pathFolder);
//	}
	public static void createNewFolder(String path, String folderName) throws Exception {
		String newPathFolder = path + "\\" + folderName;
		if (isFileExists(newPathFolder)) {
			throw new Exception(FILE_EXISTS);
		}
		new File(newPathFolder).mkdir();
		}



//	Xoa file
	public static void deleteFile(String pathFile) throws Exception {
		if (!isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		boolean result = new File(pathFile).delete();
		System.out.println(result ? DELETE_FILE_SUCCESS : DELETE_FILE_FAIL);
	}

//	Check file hay folder?
	public static void checkPath(String pathFile) {
		File file = new File(pathFile);
		if (file.isFile()) {
			System.out.println("Day la file");
		} else if (file.isDirectory()) {
			System.out.println("Day la folder");
		} else {
			System.out.println("Day khong phai file, khong phai folder");
		}
	}

//	Lay ten tat ca cac file
	public static void getAllFileName(String pathFile) {
		File file = new File(pathFile);
		File[] listOfFiles = file.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println("File " + listOfFiles[i].getName());
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}
		}
	}

//	Copy file	
	public static void copyFile(String sourceFile, String destinationPath) throws Exception {

		if (!isFileExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}
		File source = new File(sourceFile);
		File dest = new File(destinationPath);
		Files.copy(source.toPath(), dest.toPath());

		System.out.println("Copy file success");
	}

//	Move file
	public static void moveFile(String sourceFile, String destinationPath) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}
		File source = new File(sourceFile);
		File dest = new File(destinationPath);
		Files.move(source.toPath(), dest.toPath());

		System.out.println("Move file success");
	}

//	Doi ten file
	public static void renameFile(String pathFile, String destFile) throws Exception {
		if (!isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		if (isFileExists(destFile)) {
			throw new Exception("Ten bi trung");
		}
		File oldFile = new File(pathFile);
		File newFile = new File(destFile);
		oldFile.renameTo(newFile);

		System.out.println("Rename success");
	}

//	Nhap objext vao file
	public static <T> void writeObjectInFile(T object, String filePath) throws IOException {
		FileOutputStream fOutputStream = new FileOutputStream(filePath);
		ObjectOutputStream outputStream = new ObjectOutputStream(fOutputStream);
		outputStream.writeObject(object);
		outputStream.close();
	}

//	doc file
	@SuppressWarnings({ "resource", "unchecked" })
	public static <T> T readFile(String filePath) throws IOException, ClassNotFoundException {
		FileInputStream fInputStream = new FileInputStream(filePath);

		ObjectInputStream objectInputStream = new ObjectInputStream(fInputStream);
		T student = (T) objectInputStream.readObject();
		System.out.println(student.toString());
		return student;

	}

//	Download file
	@SuppressWarnings({ "resource", "unused" })
	public static void downloadFile(String URL, String fileName) throws Exception {
		ReadableByteChannel readableByteChannel = Channels.newChannel(new URL(URL).openStream());

		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		FileChannel fileChannel = fileOutputStream.getChannel();

		fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);

		System.out.println("Download success");
	}

	public static void main(String[] args) throws Exception {
//		String filePath = "C:\\Users\\Public\\new\\newStudentFile.txt";

//		try {
//			System.out.println("Tao file newStudentFile.txt");
//			// tao file theo duong dan da tao ben tren
//			try {
//				createFile(filePath);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			System.out.println("\n-------- Them object vao File ---------- ");
//			ArrayList<Student> students = new ArrayList<>();
//			students.add(new Student(01, "Pham Minh Tuan"));
//			students.add(new Student(02, "Pham Minh Tu"));
//			students.add(new Student(03, "Pham Minh T"));
//			for(Student student : students) {
//			System.out.println("Them object: " + student.toString() + " vao File");
//			}
//			// Them object Student vao trong file
//			FileManager.<ArrayList<Student>>writeObjectInFile(students, filePath);
//			System.out.println("\n-------- Doc File lay ra du lieu ---------- ");
//			FileManager.<Student>readFile(filePath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Co loi xay ra => " + e.getMessage());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Co loi xay ra => " + e.getMessage());
//		}

	}
}
