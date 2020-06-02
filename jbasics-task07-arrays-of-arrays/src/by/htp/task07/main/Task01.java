package by.htp.task07.main;

import java.util.Random;

// Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и
// вывести на экран.

public class Task01 {

	public static void main(String[] args) {

		int[][] a = new int[3][4];

		InitWithRandomOne(a);
		
		PrintArray(a);

	}

	public static void InitWithRandomOne(int ar[][]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i][rand.nextInt(ar[i].length)] = 1;
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
