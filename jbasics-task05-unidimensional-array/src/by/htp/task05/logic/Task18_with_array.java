package by.htp.task05.logic;

import java.util.Random;

public class Task18_with_array {

	public static void main(String[] args) {

		int[] mas = new int[10];

		Init2RandomCubes(mas);
		PrintArray(mas);

		if (GenerateTheKey(mas)) {
			PrintArray(mas);
		}

	}

	public static boolean GenerateTheKey(int ar[]) {
		boolean isfirst, real;
		int[] a = new int[3];

		isfirst = true;
		real = true;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				if (isfirst) {
					a[i % 3] = ar[i];
					isfirst = false;
				} else {
					if (a[i % 3] == 0) {
						a[i % 3] = ar[i];
					} else if (a[i % 3] == ar[i]) {
						a[(i + 1) % 3] = 1;
					} else {
						real = false;
					}
					break;
				}
			}

		}

		if (a[0] + a[1] + a[2] > 9) {
			real = false;
		}

		if (!real) {
			System.out.println("При таком начальном условии невозможно составить замок, который откроет сейф.");
			return false;
		}

		for (int i = 0; i < 3; i++) {
			if (a[i] == 0) {
				a[i] = 10 - a[(i + 1) % 3] - a[(i + 2) % 3];
			}
		}

		for (int i = 0; i < ar.length; i++) {
			ar[i] = a[i % 3];
		}

		return true;
	}

	public static void Init2RandomCubes(int ar[]) {
		Random rand = new Random();
		int i1, i2;

		i1 = rand.nextInt(10);
		i2 = rand.nextInt(10);
		while (i1 == i2) {
			i2 = rand.nextInt(10);
		}
		ar[i1] = rand.nextInt(6) + 1;
		ar[i2] = rand.nextInt(6) + 1;
	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
	}

}
