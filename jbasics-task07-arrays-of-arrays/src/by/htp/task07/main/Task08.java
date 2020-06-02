package by.htp.task07.main;

import java.util.Random;

/*
Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
массива.
*/

public class Task08 {

	public static void main(String[] args) {

		int n, m;
		n = 4;
		m = 5;

		int[][] a = new int[n][m];

		InitWithRandom(a);

		PrintArray(a);

		System.out.println("There are " + NumOf7(a) + " elements equals 7.");

	}

	public static int NumOf7(int ar[][]) {
		int num = 0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == 7) {
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
				ar[i][j] = rand.nextInt(4) + 4;
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
