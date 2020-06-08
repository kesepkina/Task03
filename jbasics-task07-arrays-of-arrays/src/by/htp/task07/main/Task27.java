package by.htp.task07.main;

import java.util.Random;

/*В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/

public class Task27 {

	public static void main(String[] args) {

		Random rand = new Random();

		int m, n, col1, col2;

		m = 5;
		n = 6;

		int[][] a = new int[m][n];

		InitWithRandom(a);

		PrintArray(a);

		col1 = rand.nextInt(n);
		col2 = rand.nextInt(n);
		while (col1 == col2) {
			col2 = rand.nextInt(n);
		}

		ReplaceColumns(a, col1, col2);

		System.out.println("Матрица после перестановки " + col1 + "-ого и " + col2 + "-ого столбцов:");
		PrintArray(a);

	}

	public static void ReplaceColumns(int ar[][], int col1, int col2) {

		int t;

		for (int i = 0; i < ar.length; i++) {
			t = ar[i][col1];
			ar[i][col1] = ar[i][col2];
			ar[i][col2] = t;
		}

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
				System.out.printf("% 3d\t", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
