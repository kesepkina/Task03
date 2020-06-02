package by.htp.task05.logic;

import java.util.Random;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
этим числом. Подсчитать количество замен.*/

public class Task07 {

	public static void main(String[] args) {

		Random rand = new Random();

		int z, n, num;

		z = rand.nextInt(50);
		n = 10;

		double[] mas = new double[n];

		InitWithRandom(mas);

		PrintArray(mas);

		System.out.println("Z = " + z);

		num = Replace(mas, z);

		PrintArray(mas);

		System.out.println("Количество замен = " + num);

	}

	public static int Replace(double ar[], int z) {

		int replacesnum = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > z) {
				ar[i] = z;
				replacesnum++;
			}
		}

		return replacesnum;
	}

	public static void InitWithRandom(double ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100) - 50;
		}
	}

	public static void PrintArray(double ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
