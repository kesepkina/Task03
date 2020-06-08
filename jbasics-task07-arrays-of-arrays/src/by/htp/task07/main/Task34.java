package by.htp.task07.main;

import java.util.Random;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/

public class Task34 {

	public static void main(String[] args) {

		int m, n;

		m = 6;
		n = 5;

		int[][] a = new int[m][n];

		InitWithOne(a);

		PrintArray(a);

	}

	public static void InitWithOne(int ar[][]) {

		int k, m;

		Random rand = new Random();
		m = ar.length;

		for (int j = 1; j < ar[0].length; j++) {
			for (int i = 0; i < j; i++) {
				k = rand.nextInt(m);
				while (ar[k][j] == 1) {
					k = rand.nextInt(m);
				}
				ar[k][j] = 1;
			}
		}
	}

	public static void PrintArray(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%2d ", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
