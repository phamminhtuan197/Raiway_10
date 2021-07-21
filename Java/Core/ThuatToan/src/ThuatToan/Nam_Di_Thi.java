package ThuatToan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Nam_Di_Thi {

	public static Set<String> generatePerm(String input) {
		Set<String> set = new HashSet<String>();
		if (input == "")
			return set;

		Character a = input.charAt(0);

		if (input.length() > 1) {
			input = input.substring(1);

			Set<String> permSet = generatePerm(input);

			for (String x : permSet) {
				for (int i = 0; i <= x.length(); i++) {
					set.add(x.substring(0, i) + a + x.substring(i));
				}
			}
		} else {
			set.add(a + "");
		}
		return set;
	}

	public static boolean nam_di_thi(String X, String Y) {
		List<String> list = new ArrayList<String>();
        list.addAll(generatePerm(X));
        for (String c:list) {
	    	 if (Y.contains(c)) {
	    		 return true;
	    	 }
        }
	    		 return false;
	}
	public static void main(String[] args) {
		String X = "rikkeisoft";
		String Y ="xxxkriiketofsaa";
		System.out.println(nam_di_thi(X, Y));
	}
}
