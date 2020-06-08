package by.htp.task07.main;

import java.util.Random;

/*Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается
как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат
сглаживания заданной матрицы.*/

public class Task36 {

	public static void main(String[] args) {

		int m, n;

		m = 5;
		n = 6;

		int[][] a = new int[m][n];

		InitWithRandom(a);

		PrintArray(a);

		PrintArray(Smooth(a));

	}

	public static double[][] Smooth(int ar[][]) {

		int lasti, lastj;

		lasti = ar.length - 1;
		lastj = ar[0].length - 1;

		double smoothed[][] = new double[ar.length][ar[0].length];

		for (int i = 1; i < ar.length - 1; i++) {
			for (int j = 1; j < ar[i].length - 1; j++) {
				smoothed[i][j] = (ar[i][j - 1] + ar[i][j + 1] + ar[i - 1][j] + ar[i + 1][j]) / 4.0;
			}
		}

		for (int j = 1; j < ar[0].length - 1; j++) {
			smoothed[0][j] = (ar[0][j - 1] + ar[0][j + 1] + ar[1][j]) / 3.0;
			smoothed[lasti][j] = (ar[lasti][j - 1] + ar[lasti][j + 1] + ar[lasti - 1][j]) / 3.0;
		}

		for (int i = 1; i < ar.length - 1; i++) {
			smoothed[i][0] = (ar[i][1] + ar[i - 1][0] + ar[i + 1][0]) / 3.0;
			smoothed[i][lastj] = (ar[i][lastj - 1] + ar[i - 1][lastj] + ar[i + 1][lastj]) / 3.0;
		}

		smoothed[0][0] = (ar[0][1] + ar[1][0]) / 2.0;
		smoothed[0][lastj] = (ar[0][lastj - 1] + ar[1][lastj]) / 2.0;
		smoothed[lasti][lastj] = (ar[lasti][lastj - 1] + ar[lasti - 1][lastj]) / 2.0;
		smoothed[lasti][0] = (ar[lasti][1] + ar[lasti - 1][0]) / 2.0;

		return smoothed;

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

	public static void PrintArray(double ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("% 2.2f\t", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
