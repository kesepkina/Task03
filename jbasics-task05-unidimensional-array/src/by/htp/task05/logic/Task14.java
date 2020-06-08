package by.htp.task05.logic;

import java.util.Random;

public class Task14 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		System.out.println("Максимум среди элементов с чётным индексом равен " + Max(mas)
				+ ", минимум среди нечётных - " + Min(mas));

	}

	public static int Max(int arr[]) {
		int max = arr[1];

		for (int i = 3; i < arr.length; i += 2) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int Min(int arr[]) {
		int min = arr[0];

		for (int i = 2; i < arr.length; i += 2) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(50) - 20;
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
