package ThuatToan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Chia_Het {
	private static List<Integer> listA = new ArrayList<>();
	private static Set<Integer> listB = new TreeSet<>();

	public static int chia_het_i(int n, int a, int b) {
		boi(a);
		boi(b);
		listB.addAll(boi(a));
		listB.addAll(boi(b));
		listA.addAll(listB);
		return listA.get(n);

	}

	private static Set<Integer> boi(int k) {
		Set<Integer> list = new TreeSet<>();
		for (int i = 0; i < 999999; i++) {
				list.add(k * i);
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(chia_het_i(7, 5, 6));
	}
}
