package by.htp.task07.main;

import java.util.Random;

// Найдите сумму двух матриц.

public class Task38 {

	public static void main(String[] args) {

		int m, n;

		m = 5;
		n = 6;

		int[][] a = new int[m][n];
		int[][] b = new int[m][n];

		InitWithRandom(a);

		PrintArray(a);

		InitWithRandom(b);

		PrintArray(b);

		System.out.println("Sum:");
		PrintArray(Sum(a, b));

	}

	public static int[][] Sum(int ar1[][], int ar2[][]) {

		int[][] ar3 = new int[ar1.length][ar1[0].length];

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				ar3[i][j] = ar1[i][j] + ar2[i][j];
			}
		}

		return ar3;
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
