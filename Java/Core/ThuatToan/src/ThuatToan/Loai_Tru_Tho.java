package ThuatToan;

import java.util.Map;
import java.util.TreeMap;

public class Loai_Tru_Tho {
	private static int[] rabbit = {1, 2, 3, 4, 5,2,2,2,2};
	public static int loai_tru_tho(int[] rabbit) {
		int n = rabbit.length;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
        	if (map.containsKey(rabbit[i])) {
                int count = map.get(rabbit[i]) + 1;
                map.put(rabbit[i], count);
            } else {
                map.put(rabbit[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
        	if (map.get(key) > 1) {
        		return key;
        	}
        }
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(loai_tru_tho(rabbit));
	}
}
