package by.htp.task05.logic;

import java.util.Random;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/

public class Task20 {

	public static void main(String[] args) {

		int n;

		n = 20;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		Reduce(mas);

		PrintArray(mas);

	}

	public static void Reduce(int ar[]) {
		for (int i = 1; i < ar.length; i += 2) {
			ar[i] = 0;
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

}
