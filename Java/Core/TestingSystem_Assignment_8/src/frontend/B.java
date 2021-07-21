package frontend;
import java.io.File;

import frontend.A;
public class B {
	public static void main (String[] args) {
		A a1 = new A("tuan");
//		System.out.println(a1.toString());
//		System.out.println("tuoi la: " + a1.tuoi);
		
		A a2 = new A("tu");
//		System.out.println(a2.toString());
		A a3 = new A("tai");
//		System.out.println(a3.toString());
		A a4 = new A("tinh");
//		System.out.println(a4.toString());
		System.out.println("count: " + A.count);
		System.out.println("------");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
//		File file =  new File ("C:\\Users\\pc\\Desktop\\Test.txt");
//		if (file.exists()) {
//			System.out.println("file is exists");
//		}
//		else {
//			System.out.println("file is not exists");
//		}
//	}
	}
}
