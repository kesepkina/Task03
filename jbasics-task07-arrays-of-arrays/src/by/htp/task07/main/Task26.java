package by.htp.task07.main;

import java.util.Scanner;

/* С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
а) вычислить сумму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы.*/

public class Task26 {

	public static void main(String[] args) {

		int n, m;

		n = 2;
		m = 3;

		int[][] a = new int[n][m];

		InitWithKeyboard(a);

		PrintArray(a);

		PrintSums(SumOfNegativ(a));

		PrintMaximums(Max(a));

		ReplaceMaxAndMin(a);

		System.out.println("Матрица после перестановки максимального и минимального элементов:");
		PrintArray(a);

	}

	public static void ReplaceMaxAndMin(int ar[][]) {

		int max, min, imax, imin, jmax, jmin;
		max = min = ar[0][0];
		imax = imin = jmax = jmin = 0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] > max) {
					max = ar[i][j];
					imax = i;
					jmax = j;
				} else if (ar[i][j] < min) {
					min = ar[i][j];
					imin = i;
					jmin = j;
				}
			}
		}

		ar[imin][jmin] = max;
		ar[imax][jmax] = min;

	}

	public static void PrintMaximums(int ar[]) {

		System.out.println("Максимальные элементы по строкам:");

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + ": " + ar[i]);
		}

		System.out.println();
	}

	public static int[] Max(int ar[][]) {

		int[] max = new int[ar.length];

		for (int i = 0; i < ar.length; i++) {
			max[i] = ar[i][0];
			for (int j = 1; j < ar[i].length; j++) {
				if (ar[i][j] > max[i]) {
					max[i] = ar[i][j];
				}
			}
		}

		return max;

	}

	public static void PrintSums(int ar[]) {

		System.out.println("Суммы отрицательных элементов по строкам:");

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + ": " + ar[i]);
		}

		System.out.println();
	}

	public static int[] SumOfNegativ(int ar[][]) {

		int[] sum = new int[ar.length];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] < 0) {
					sum[i] += ar[i][j];
				}
			}
		}

		return sum;

	}

	public static void InitWithKeyboard(int ar[][]) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = ar.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "]: ");
				while (!sc.hasNextInt()) {
					sc.hasNext();
					System.out.print("a[" + i + "][" + j + "]: ");
				}
				ar[i][j] = sc.nextInt();
			}
		}

		System.out.println();

	}

	public static void PrintArray(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("% 2d\t", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
