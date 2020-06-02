package by.htp.task05.logic;

import java.util.Random;

/*Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/

public class Task09 {

	public static void main(String[] args) {

		int n;

		n = 5;

		double[] mas = new double[n];

		InitWithRandom(mas);

		PrintArray(mas);

		ReplaceMinMax(mas);

		PrintArray(mas);

	}

	public static void ReplaceMinMax(double arr[]) {

		double min, max, extra;
		int mini, maxi;

		min = max = arr[0];
		mini = maxi = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxi = i;
			} else if (arr[i] < min) {
				min = arr[i];
				mini = i;
			}
		}

		extra = arr[mini];
		arr[mini] = arr[maxi];
		arr[maxi] = extra;
	}

	public static void InitWithRandom(double ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextDouble() * (rand.nextInt(100) - 50);
		}
	}

	public static void PrintArray(double ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%3.3f ", ar[i]);
		}

		System.out.println();
	}

}
