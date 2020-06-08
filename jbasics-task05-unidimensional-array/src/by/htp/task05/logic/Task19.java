package by.htp.task05.logic;

import java.util.Random;

/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
несколько, то определить наименьшее из них.*/

public class Task19 {

	public static void main(String[] args) {

		int n;

		n = 10;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		System.out.println("Наиболее часто встречающееся число равно " + TheMostFrequent(mas));

	}

	public static int TheMostFrequent(int ar[]) {

		int[] num = new int[ar.length];
		int themostfrequenti = 0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] == ar[i]) {
					num[i]++;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			if (num[themostfrequenti] < num[i] || (num[themostfrequenti] == num[i] && ar[i] < ar[themostfrequenti])) {
				themostfrequenti = i;
			}
		}

		return ar[themostfrequenti];
	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(5) - 2;
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
