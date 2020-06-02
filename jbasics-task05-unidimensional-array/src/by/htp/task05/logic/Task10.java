package by.htp.task05.logic;

import java.util.Random;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task10 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		PrintI(mas);

	}

	public static void PrintI(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > i) {
				System.out.print(ar[i] + " ");
			}
		}

		System.out.println();
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
