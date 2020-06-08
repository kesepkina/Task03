package by.htp.task07.main;

import java.util.Random;

// Найдите произведение двух матриц.

public class Task39 {

	public static void main(String[] args) {

		int m, n, l;

		m = 2;
		n = 3;
		l = 4;

		int[][] a = new int[m][n];
		int[][] b = new int[n][l];

		InitWithRandom(a);

		PrintArray(a);

		InitWithRandom(b);

		PrintArray(b);

		System.out.println("Mul:");
		PrintArray(Mul(a, b));

	}

	public static int[][] Mul(int ar1[][], int ar2[][]) {

		int[][] ar3 = new int[ar1.length][ar2[0].length];

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2[i].length; j++) {
				for (int k = 0; k < ar2.length; k++) {
					ar3[i][j] += ar1[i][k] * ar2[k][j];
				}
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
				System.out.printf("% 4d ", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
