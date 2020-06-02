package by.htp.task05.logic;

import java.util.Random;

/*���� ����������� ����� �1 ,�2 ,..., �n .
������� �� �� ���, � ������� ������� �� ������� �� � ����� L (0 < L < �-1).*/

public class Task11 {

	public static void main(String[] args) {

		int n, l, m;

		n = 20;
		m = 10;
		l = 5;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		RestDevML(mas, m, l);

	}

	public static void RestDevML(int ar[], int m, int l) {

		System.out.print("�����, � ������� ������� �� ������� �� " + m + " ����� " + l + ": ");

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % m == l) {
				System.out.print(ar[i] + " ");
			}
		}

		System.out.println();

	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(50) + 1;
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
