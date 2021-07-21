package ThuatToan;

import java.util.Map;
import java.util.TreeMap;

public class Chia_banh_quy {
	private static int[] child = { 1, 2, 3 };
	private static int[] cookie = { 1, 2};

	public static int phat_banh_quy(int[] child, int[] cookie) {
		int n = 0;
		Map<Integer, Integer> mapchild = new TreeMap<Integer, Integer>();
		for (int i = 0; i < child.length; i++) {
			if (mapchild.containsKey(child[i])) {
				int count = mapchild.get(child[i]) + 1;
				mapchild.put(child[i], count);
			} else {
				mapchild.put(child[i], 1);
			}
		}

//        for (Integer key : mapchild.keySet()) {
//            System.out.printf("%d xuất hiện %d lần.\n", key, mapchild.get(key));
//        }

		Map<Integer, Integer> mapcookie = new TreeMap<Integer, Integer>();
		for (int i = 0; i < cookie.length; i++) {
			if (mapcookie.containsKey(cookie[i])) {
				int count = mapcookie.get(cookie[i]) + 1;
				mapcookie.put(cookie[i], count);
			} else {
				mapcookie.put(cookie[i], 1);
			}
		}
//
//		for (Integer key : mapcookie.keySet()) {
//			System.out.printf("%d xuất hiện %d lần.\n", key, mapcookie.get(key));
//		}
		if (child.length >= cookie.length) {
			for (int i = 0; i < cookie.length; i++) {
				if (mapchild.containsKey(cookie[i])) {
					if (mapchild.get(cookie[i]) < mapcookie.get(cookie[i])) {
						n = mapchild.get(cookie[i]);
					} else if (mapchild.get(cookie[i]) >= mapcookie.get(cookie[i])) {
						n = mapcookie.get(cookie[i]);

					}
				}
			}
		} else if (child.length < cookie.length) {
			for (int i = 0; i < child.length; i++) {
				if (mapcookie.containsKey(child[i])) {
					if (mapcookie.get(child[i]) < mapchild.get(child[i])) {
						n += mapcookie.get(child[i]);
					} else if (mapcookie.get(child[i]) >= mapchild.get(child[i])) {
						n += mapcookie.get(child[i]);

					}
				}
			}
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(phat_banh_quy(child, cookie));
	}
}
