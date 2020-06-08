package by.htp.task07.main;

import java.util.Random;

// Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.

public class Task31 {
	
	public static void main(String[] args) {

		int m, n;

		m = 7;
		n = 5;

		int[][] a = new int[m][n];

		InitWithRandom(a);

		PrintArray(a);
		
		System.out.println("Количество двухзначных чисел в матрице равно " + NumberOfTwoDigit(a));
	}

	public static int NumberOfTwoDigit(int ar[][]) {

		int num =0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
					if (ar[i][j]>9 && ar[i][j]<100) {
						num++;
					}
			}
		}

		return num;
	}

	public static void InitWithRandom(int ar[][]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(1000);
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
