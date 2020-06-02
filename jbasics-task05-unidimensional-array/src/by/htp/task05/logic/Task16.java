package by.htp.task05.logic;

import java.util.Random;

public class Task16 {

	public static void main(String[] args) {

		int n;

		n = 6;

		double[] mas = new double[n];

		InitWithRandom(mas);

		PrintArray(mas);

		System.out.printf("Maxsum = %3.3f.", MaxSum(mas));

	}

	public static double MaxSum(double arr[]) {

		double maxsum = arr[0] + arr[arr.length - 1];
		double sum;

		for (int i = 1; i < arr.length / 2; i++) {
			sum = arr[i] + arr[arr.length - 1 - i];
			if (sum > maxsum) {
				maxsum = sum;
			}
		}

		return maxsum;
	}

	public static void InitWithRandom(double ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextDouble() * (rand.nextInt(100) - 50);
		}
	}

	public static void PrintArray(double ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%3.3f ", ar[i]);
		}

		System.out.println();
	}

}
