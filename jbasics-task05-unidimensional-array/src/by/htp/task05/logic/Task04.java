package by.htp.task05.logic;

import java.util.Random;

// ���� ������������������ �������������� ����� �1 �2 ,..., �n . ��������, ����� �� ��� ������������

public class Task04 {

	public static void main(String[] args) {
		int n = 3;

		int[] mas = new int[n];

		InitWithRandom(mas);

		PrintArray(mas);

		if (IfGrowing(mas)) {
			System.out.println("������ ������������������ �������� ������������.");
		} else {
			System.out.println("������ ������������������ �� �������� ������������.");
		}

	}

	public static void InitWithRandom(int ar[]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);
		}
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

	public static boolean IfGrowing(int ar[]) {

		boolean grow = true;

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > ar[i + 1]) {
				grow = false;
				break;
			}

		}

		return grow;
	}

}
