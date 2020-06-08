package by.htp.task07.main;

import java.util.Random;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task35 {

	public static void main(String[] args) {

		int m, n;

		m = 5;
		n = 6;

		int[][] a = new int[m][n];

		InitWithRandom(a);

		PrintArray(a);

		ReplaceOddElementsWithMax(a, FindMax(a));

		PrintArray(a);

	}

	public static void ReplaceOddElementsWithMax(int ar[][], int max) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (Math.abs(ar[i][j]) % 2 == 1) {
					ar[i][j] = max;
				}
			}
		}

	}

	public static int FindMax(int ar[][]) {
		int max = ar[0][0];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] > max) {
					max = ar[i][j];
				}
			}
		}

		System.out.println("Max = " + max);
		System.out.println();

		return max;
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
