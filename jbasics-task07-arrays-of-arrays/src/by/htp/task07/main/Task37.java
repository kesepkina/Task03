package by.htp.task07.main;

import java.util.Random;

// Переставить строки матрицы случайным образом.

public class Task37 {

	public static void main(String[] args) {

		int m, n;

		m = 5;
		n = 6;

		int[][] a = new int[m][n];

		InitWithRandom(a);

		PrintArray(a);
		
		ReplaceStringsWithRandom(a);
		
		PrintArray(a);

	}

	public static void ReplaceStringsWithRandom(int ar[][]) {
		Random rand = new Random();

		int numOfReplaces, i1, i2, t;

		numOfReplaces = rand.nextInt(ar.length + 1);

		for (int n = 0; n < numOfReplaces; n++) {
			i1 = rand.nextInt(ar.length);
			i2 = rand.nextInt(ar.length);
			while (i1 == i2) {
				i2 = rand.nextInt(ar.length);
			}
			for (int j = 0; j < ar[i1].length; j++) {
				t = ar[i1][j];
				ar[i1][j] = ar[i2][j];
				ar[i2][j] = t;
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
