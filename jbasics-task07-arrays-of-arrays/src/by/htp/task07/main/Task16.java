package by.htp.task07.main;

public class Task16 {

	public static void main(String[] args) {

		int n;

		n = 6;

		int[][] a = new int[n][n];

		InitDiagonal(a);

		PrintArray(a);

	}

	public static void InitDiagonal(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			ar[i][i] = (i + 1) * (i + 2);
		}

	}

	public static void PrintArray(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%3d ", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
