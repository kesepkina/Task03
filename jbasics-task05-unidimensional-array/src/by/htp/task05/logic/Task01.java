package by.htp.task05.logic;

import java.util.Random;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task01 {

	public static void main(String[] args) {

		int[] a = new int[10];

		int k = 5;

		InitWithRandom(a);

		PrintArray(a);

		SumOfDivisible(a, k);

	}

	public static void SumOfDivisible(int ar[], int k) {

		int sum = 0;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] % k == 0) {
				sum += ar[i];
			}
		}

		System.out.println("Sum of elements divisible by " + k + " = " + sum);
	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
