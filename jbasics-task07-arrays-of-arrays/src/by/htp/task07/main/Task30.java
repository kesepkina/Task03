package by.htp.task07.main;

import java.util.Random;

/*������� 10x20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� ���� ������� � ������ �����, �
������� ����� 5 ����������� ��� � ����� ���.*/

public class Task30 {

	public static void main(String[] args) {

		int[][] a = new int[10][20];

		InitWithRandom(a);

		PrintArray(a);

		FiveInStrings(a);

	}

	public static void FiveInStrings(int ar[][]) {

		boolean ifThereAre = false;
		int counter;
		System.out.print("������ �����, � ������� ����� 5 ����������� ��� � ����� ���: ");

		for (int i = 0; i < ar.length; i++) {
			counter = 0;
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == 5) {
					counter++;
				}
			}
			if (counter > 2) {
				System.out.print(i + " ");
				ifThereAre = true;
			}
		}

		if (!ifThereAre)

		{
			System.out.println("����� ���.");
		}
		System.out.println();

	}

	public static void InitWithRandom(int ar[][]) {

		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(16);
			}
		}
	}

	public static void PrintArray(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("% 3d ", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
