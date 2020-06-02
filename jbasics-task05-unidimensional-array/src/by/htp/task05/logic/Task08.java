package by.htp.task05.logic;

import java.util.Random;

// ��� ������ �������������� �����, ����������� �������� N. ����������, ������� � ��� �������������,
// ������������� � ������� ���������.

public class Task08 {

	public static void main(String[] args) {

		int n;

		n = 10;

		double[] mas = new double[n];

		InitWithRandom(mas);

		PrintArray(mas);

		System.out.println("� ������ ������� " + NumberOfNegativ(mas) + " �������������, " + NumberOfPositiv(mas)
				+ " ������������� � " + NumberOfNulls(mas) + " ������� ���������.");

	}

	public static int NumberOfNulls(double ar[]) {

		int num = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				num++;
			}
		}

		return num;
	}

	public static int NumberOfPositiv(double ar[]) {

		int num = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				num++;
			}
		}

		return num;
	}

	public static int NumberOfNegativ(double ar[]) {

		int num = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				num++;
			}
		}

		return num;
	}

	public static void InitWithRandom(double ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextDouble() * (rand.nextInt(100) - 50);
		}
	}

	public static void PrintArray(double ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
