package by.htp.task07.main;

import java.util.Random;

public class Task24 {

	public static void main(String[] args) {

		int n;

		n = 6;

		int[] a = new int[n];

		InitWithRandom(a);

		PrintArray(a);
		System.out.println();

		double[][] b;

		b = InitWithSquareRule(a);

		PrintArray(b);

	}

	public static double[][] InitWithSquareRule(int ar[]) {

		double arr[][] = new double[ar.length][ar.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Math.pow(ar[j], i + 1);
			}
		}

		return arr;

	}

	public static void PrintArray(double ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("% 2.0f\t", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(10);
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
