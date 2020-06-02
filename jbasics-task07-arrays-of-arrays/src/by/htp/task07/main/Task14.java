package by.htp.task07.main;

public class Task14 {

	public static void main(String[] args) {

		int n;

		n = 6;

		int[][] a = new int[n][n];

		InitDiagonal(a);

		PrintArray(a);

	}

	public static void InitDiagonal(int ar[][]) {

		InitWithZero(ar);

		for (int i = 0; i < ar.length; i++) {
			ar[i][ar.length - 1 - i] = i + 1;
		}

	}

	public static void InitWithZero(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = 0;
			}
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
