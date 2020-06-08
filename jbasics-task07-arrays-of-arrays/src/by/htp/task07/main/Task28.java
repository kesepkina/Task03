package by.htp.task07.main;

import java.util.Random;

public class Task28 {

	/*
	 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
	 * содержит максимальную сумму.
	 */

	public static void main(String[] args) {

		int n, m;

		n = 5;
		m = 6;

		int[][] a = new int[n][m];
		int[] sum;

		InitWithRandom(a);

		PrintArray(a);

		sum = SumsInColumns(a);

		PrintSums(sum);

		System.out.println(Imax(sum) + "-й столбец содержит максимальную сумму.");
	}

	public static int Imax(int ar[]) {

		int max = ar[0];
		int imax = 0;

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				imax = i;
			}
		}

		return imax;

	}

	public static void PrintSums(int ar[]) {

		System.out.println("Суммы элементов по столбцам:");

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + ": " + ar[i]);
		}

		System.out.println();
	}

	public static int[] SumsInColumns(int ar[][]) {

		int[] sum = new int[ar[0].length];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				sum[j] += ar[i][j];
			}
		}

		return sum;

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
				System.out.printf("%2d\t", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
