package by.htp.task07.main;

// Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
// строка слева направо, третья строка справа налево и так далее.

public class Task11 {

	public static void main(String[] args) {

		int m, n;

		m = 5;
		n = 6;

		int[][] a = new int[m][n];

		PrintArray(a);

		System.out.println();

		PrintSnake(a);

	}

	public static void PrintSnake(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				PrintStringRightLeft(ar, i);
			} else {
				PrintStringLeftRight(ar, i);
			}
		}

	}

	public static void PrintStringRightLeft(int ar[][], int i) {

		for (int j = ar[i].length - 1; j >= 0; j--) {

			System.out.printf("%3d ", ar[i][j]);

		}
		System.out.println();

	}

	public static void PrintStringLeftRight(int ar[][], int i) {

		for (int j = 0; j < ar[i].length; j++) {

			System.out.printf("%3d ", ar[i][j]);

		}
		System.out.println();

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
