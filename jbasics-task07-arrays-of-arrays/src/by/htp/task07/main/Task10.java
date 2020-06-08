package by.htp.task07.main;

import java.util.Random;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task10 {

	public static void main(String[] args) {

		Random rand = new Random();

		int k, p;

		int[][] a = new int[rand.nextInt(5) + 2][rand.nextInt(5) + 2];

		k = 0;
		p = 0;

		InitWithRandom(a);

		PrintArray(a);

		PrintString(a, k);
		System.out.println();
		System.out.println();
		PrintColumn(a, p);

	}

	public static void PrintColumn(int ar[][], int j) {

		for (int i = 0; i < ar.length; i++) {

			System.out.printf("%3d ", ar[i][j]);
			System.out.println();

		}

	}

	public static void PrintString(int ar[][], int i) {

		for (int j = 0; j < ar[i].length; j++) {

			System.out.printf("%3d ", ar[i][j]);

		}

	}

	public static void InitWithRandom(int ar[][]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(100);
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
