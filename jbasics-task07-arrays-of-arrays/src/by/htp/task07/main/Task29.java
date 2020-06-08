package by.htp.task07.main;

import java.util.Random;

// Найти положительные элементы главной диагонали квадратной матрицы.

public class Task29 {

	public static void main(String[] args) {

		int n;

		n = 6;

		int[][] a = new int[n][n];

		InitWithRandom(a);

		PrintArray(a);

		PositivesOnTheMainDiagonal(a);

	}

	public static void PositivesOnTheMainDiagonal(int ar[][]) {

		boolean ifThereAre = false;
		System.out.print("Положительные элементы главной диагонали квадратной матрицы: ");

		for (int i = 0; i < ar.length; i++) {
			if (ar[i][i] > 0) {
				System.out.print(ar[i][i] + " ");
				ifThereAre = true;
			}
		}

		if (!ifThereAre) {
			System.out.println("таких нет.");
		}
		System.out.println();

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
