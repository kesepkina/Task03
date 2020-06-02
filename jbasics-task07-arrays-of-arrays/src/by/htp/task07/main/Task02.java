package by.htp.task07.main;

import java.util.Random;

// ������� � ������� �� ����� ������� 2 x 3, ����������� ���������� ������� �� [0, 9].

public class Task02 {

	public static void main(String[] args) {

		int[][] a = new int[2][3];

		InitWithRandom(a);

		PrintArray(a);

	}

	public static void InitWithRandom(int ar[][]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(10);
			}
		}
	}

	public static void PrintArray(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%2d ", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
