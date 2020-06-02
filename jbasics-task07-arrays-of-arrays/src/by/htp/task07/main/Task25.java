package by.htp.task07.main;

public class Task25 {

	public static void main(String[] args) {

		int n;

		n = 6;

		int[][] a = new int[n][n];

		InitWithRule(a);

		PrintArray(a);

	}

	public static void InitWithRule(int ar[][]) {

		int n = ar.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (n - n + i) * n + j + 1;
			}
		}

	}

	public static void PrintArray(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%3d\t", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
