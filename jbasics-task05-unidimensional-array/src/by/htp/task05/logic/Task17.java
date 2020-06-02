package by.htp.task05.logic;

import java.util.Random;

/*ƒана последовательность целых чисел. ќбразовать новую последовательность, выбросив из исходной
те члены, которые равны min.*/

public class Task17 {

	public static void main(String[] args) {

		int min, n;

		n = 10;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		min = MinInArray(mas);

		System.out.println("Min = " + min);

		PrintArray(ArrayWithoutMin(mas, min, mas.length - NumOfMin(mas, min)));

	}

	public static int[] ArrayWithoutMin(int ar[], int min, int length) {
		int[] newarray = new int[length];
		int j = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != min) {
				newarray[j++] = ar[i];
			}
		}

		return newarray;
	}

	public static int NumOfMin(int ar[], int min) {
		int numofmin = 0;

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] == min) {
				numofmin++;
			}
		}

		return numofmin;
	}

	public static int MinInArray(int ar[]) {
		int min = ar[0];

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}

		return min;
	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(5)-2;
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
