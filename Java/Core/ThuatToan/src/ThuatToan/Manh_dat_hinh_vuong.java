package ThuatToan;

public class Manh_dat_hinh_vuong {
	private static int[][] matrix = { { 2, 1 }, { 1, 1 }, { 1, 0 }, { 2, 0 } };

	public static boolean manh_dat_hinh_vuong(int[][] matrix) {
		double AB = Math.sqrt(Math.pow(matrix[1][0] - matrix[0][0], 2) + Math.pow(matrix[1][1] - matrix[0][1], 2));
		double BC = Math.sqrt(Math.pow(matrix[2][0] - matrix[1][0], 2) + Math.pow(matrix[2][1] - matrix[1][1], 2));
		double CD = Math.sqrt(Math.pow(matrix[3][0] - matrix[2][0], 2) + Math.pow(matrix[3][1] - matrix[2][1], 2));
		double DA = Math.sqrt(Math.pow(matrix[0][0] - matrix[3][0], 2) + Math.pow(matrix[0][1] - matrix[3][1], 2));
		if (AB == BC && AB == CD && AB == DA) {
			int[] vtAB = { matrix[1][0] - matrix[0][0], matrix[1][1] - matrix[0][1] };
			int[] vtBC = { matrix[2][0] - matrix[1][0], matrix[2][1] - matrix[1][1] };
			int u = vtAB[0] * vtBC[0] + vtAB[1] * vtBC[1];
			if (u == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(manh_dat_hinh_vuong(matrix));
	}
}
