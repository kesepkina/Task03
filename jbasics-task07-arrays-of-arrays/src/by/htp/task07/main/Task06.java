package by.htp.task07.main;

import java.util.Random;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task06 {

	public static void main(String[] args) {

		Random rand = new Random();

		int[][] a = new int[rand.nextInt(5) + 2][rand.nextInt(5) + 2];

		InitWithRandom(a);

		PrintArray(a);

		PrintOddColumns(a);

	}

	public static void PrintOddColumns(int ar[][]) {

		int ilast = ar.length - 1;

		for (int j = 1; j < ar[0].length; j += 2) {
			if (ar[0][j] > ar[ilast][j]) {
				PrintColumn(ar, j);
				System.out.println();
			}
		}

	}

	public static void PrintColumn(int ar[][], int j) {

		for (int i = 0; i < ar.length; i++) {

			System.out.printf("%3d ", ar[i][j]);
			System.out.println();

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
