package by.htp.task05.logic;

import java.util.Random;

/*���� ������������������ �������������� �����. ������� �� �� ��������,
 ������� ����������� ������� [�, d].*/

public class Task15 {

	public static void main(String[] args) {

		int n;
		double c, d;

		n = 10;
		c = -20;
		d = 10;

		double[] mas = new double[n];

		InitWithRandom(mas);

		PrintArray(mas);

		System.out.print("������� [" + c + ", " + d + "] �����������: ");
		PrintCD(mas, c, d);

	}

	public static void PrintCD(double arr[], double c, double d) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= c && arr[i] <= d) {
				System.out.printf("%3.3f ", arr[i]);
			}
		}
		System.out.println();
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
