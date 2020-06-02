package by.htp.task05.logic;

import java.util.Random;

/*«адана последовательность N вещественных чисел. ¬ычислить сумму чисел, пор€дковые номера которых €вл€ютс€
простыми числами.*/

public class Task12 {

	public static void main(String[] args) {

		int n;

		n = 6;

		double[] mas = new double[n];

		InitWithRandom(mas);

		PrintArray(mas);

		System.out.printf("Sum = %3.3f", SumPrimeIndexes(mas));

	}

	public static double SumPrimeIndexes(double ar[]) {
		double sum = 0;
		boolean prime;

		for (int i = 2; i < ar.length; i++) {
			prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				sum += ar[i];
			}
		}

		return sum;
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
