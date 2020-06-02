package by.htp.task05.logic;

import java.util.Random;

/*Даны натуральные числа а1 ,а2 ,..., аn .
Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).*/

public class Task11 {

	public static void main(String[] args) {

		int n, l, m;

		n = 20;
		m = 10;
		l = 5;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		RestDevML(mas, m, l);

	}

	public static void RestDevML(int ar[], int m, int l) {

		System.out.print("Числа, у которых остаток от деления на " + m + " равен " + l + ": ");

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % m == l) {
				System.out.print(ar[i] + " ");
			}
		}

		System.out.println();

	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(50) + 1;
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
