package by.htp.task07.main;

import java.util.Random;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений элементов.

public class Task33 {

	public static void main(String[] args) {

		int m, n;

		m = 5;
		n = 6;

		int[][] a = new int[m][n];

		InitWithRandom(a);

		PrintArray(a);

		SortInAscendingOrder(a);

		PrintArray(a);

		SortInDescendingOrder(a);

		PrintArray(a);

	}

	public static void SortInDescendingOrder(int ar[][]) {

		int t;

		for (int j = 0; j < ar[0].length; j++) {
			for (int i = 0; i < ar.length - 1; i++) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i][j] < ar[k][j]) {
						t = ar[i][j];
						ar[i][j] = ar[k][j];
						ar[k][j] = t;
					}
				}
			}
		}

	}

	public static void SortInAscendingOrder(int ar[][]) {

		int t;

		for (int j = 0; j < ar[0].length; j++) {
			for (int i = 0; i < ar.length - 1; i++) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i][j] > ar[k][j]) {
						t = ar[i][j];
						ar[i][j] = ar[k][j];
						ar[k][j] = t;
					}
				}
			}
		}

	}

	public static void InitWithRandom(int ar[][]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(100) - 50;
			}
		}
	}

	public static void PrintArray(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("% 3d ", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
