package by.htp.task07.main;

import java.util.Random;

// Дана матрица. Вывести на экран первую и последнюю строки.

public class Task04 {

	public static void main(String[] args) {

		Random rand = new Random();

		int[][] a = new int[rand.nextInt(5) + 2][rand.nextInt(5) + 2];

		InitWithRandom(a);

		PrintArray(a);

		PrintFirstLast(a);

	}

	public static void PrintFirstLast(int ar[][]) {

		PrintString(ar, 0);
		System.out.println();
		PrintString(ar, ar.length - 1);

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
