package by.htp.task07.main;

import java.util.Random;

// Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Task07 {

	public static void main(String[] args) {

		int[][] a = new int[5][5];

		InitWithRandom(a);

		PrintArray(a);

		System.out.println(SumOfNegativOddElems(a));

	}

	public static int SumOfNegativOddElems(int ar[][]) {
		int sum = 0;

		System.out.print("Sum consisting of absolutes of");

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] < 0 && Math.abs(ar[i][j]) % 2 == 1) {
					sum += Math.abs(ar[i][j]);
					System.out.print(" " + ar[i][j]);
				}
			}
		}

		System.out.print(" equals ");

		return sum;
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
				System.out.printf("%3d ", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
