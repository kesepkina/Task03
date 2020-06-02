package by.htp.task07.main;

public class Task20 {

	public static void main(String[] args) {

		int n;

		n = 6;

		int[][] a = new int[n][n];

		InitButterflyZero(a);

		PrintArray(a);

	}

	public static void InitButterflyZero(int ar[][]) {

		InitWithOne(ar);

		for (int i = 0; i < ar.length / 2; i++) {
			for (int j = i + 1; j < ar[i].length - i - 1; j++) {
				ar[i][j] = 0;
			}
		}

		for (int i = ar.length / 2; i < ar.length; i++) {
			for (int j = ar[i].length - i; j < i; j++) {
				ar[i][j] = 0;
			}
		}

	}

	public static void InitWithOne(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = 1;
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
