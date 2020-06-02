package by.htp.task07.main;

public class Task13 {

	public static void main(String[] args) {

		int n;

		n = 6;

		int[][] a = new int[n][n];

		InitSnake(a);

		PrintArray(a);

	}

	public static void InitSnake(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 1) {
				InitStringRightLeft(ar, i);
			} else {
				InitStringLeftRight(ar, i);
			}
		}

	}

	public static void InitStringRightLeft(int ar[][], int i) {

		for (int j = ar[i].length - 1; j >= 0; j--) {
			ar[i][j] = ar.length - j;
		}

	}

	public static void InitStringLeftRight(int ar[][], int i) {

		for (int j = 0; j < ar[i].length; j++) {
			ar[i][j] = j + 1;
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
