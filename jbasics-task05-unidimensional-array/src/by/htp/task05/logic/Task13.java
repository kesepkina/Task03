package by.htp.task05.logic;

import java.util.Random;

/*Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
промежутке от L до N.*/

public class Task13 {

	public static void main(String[] args) {

		int num, n, l, m;

		num = 10;
		m = 5;
		l = 15;
		n = 40;

		int[] mas = new int[num];

		InitWithRandom(mas);

		PrintArray(mas);

		System.out.println("Количество элементов последовательности натуральных чисел, кратных числу " + m
				+ " и заключенных в промежутке от " + l + " до " + n + " равно " + NumOfMLN(mas, m, n, l));

	}

	public static int NumOfMLN(int ar[], int m, int n, int l) {
		int num = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % m == 0 && ar[i] >= l && ar[i] <= n) {
				num++;
			}
		}

		return num;
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
