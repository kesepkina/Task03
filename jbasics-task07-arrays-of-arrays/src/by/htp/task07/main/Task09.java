package by.htp.task07.main;

import java.util.Random;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task09 {

	public static void main(String[] args) {

		int n;
		n = 5;

		int[][] a = new int[n][n];

		InitWithRandom(a);

		PrintArray(a);

		System.out.print("Elements on the diagonal: ");
		ElementsOnTheDiagonal(a);

	}

	public static void ElementsOnTheDiagonal(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%3d ", ar[i][i]);
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
