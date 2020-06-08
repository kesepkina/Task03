package by.htp.task05.logic;

import java.util.Random;

// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше
// - положительное или отрицательное.

public class Task03 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		if (IfPositive(mas)) {
			System.out.println("Положительное число встречается раньше.");
		} else {
			System.out.println("Отрицательное число встречается раньше.");
		}

	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100) - 50;
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

	public static boolean IfPositive(int ar[]) {

		boolean positiv = false;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				break;
			} else if (ar[i] > 0) {
				positiv = true;
				break;
			}
		}
		return positiv;
	}

}
