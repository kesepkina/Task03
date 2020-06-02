package by.htp.task05.logic;

import java.util.Random;

// ���� ������������������ ����� �1 ,�2 ,..., ��. ������� ���������� ����� �������� ���, ���������� ��� ��� �����.

public class Task06 {

	public static void main(String[] args) {
		int n = 3;

		double[] mas = new double[n];

		InitWithRandom(mas);

		PrintArray(mas);

		System.out.println(
				"���������� ����� �������� ���, ���������� ��� ��� �����, ����� " + LengthOfNumericalAxis(mas));

	}

	public static double LengthOfNumericalAxis(double ar[]) {

		double max, min, length;

		if (ar[0] >= 0) {
			max = ar[0];
			min = 0;
		} else {
			min = ar[0];
			max = 0;
		}

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			} else if (ar[i] < min) {
				min = ar[i];
			}
		}

		length = max - min;

		return length;
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
