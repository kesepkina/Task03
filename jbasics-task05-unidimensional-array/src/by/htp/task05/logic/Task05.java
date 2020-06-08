package by.htp.task05.logic;

import java.util.Random;

// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел
// этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.

public class Task05 {

	public static void main(String[] args) {
		int num, n = 3;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		num = NumOfEven(mas);

		if (num == 0) {
			System.out.println("Данная последовательность не содержит четных чисел.");
		} else {
			PrintArray(EvenArray(mas, num));
		}

	}

	public static int[] EvenArray(int arr[], int num) {

		int[] even = new int[num];

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[j++] = arr[i];
			}
		}

		return even;

	}

	public static int NumOfEven(int[] arr) {

		int even = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			}
		}

		return even;
	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100) + 1;
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
