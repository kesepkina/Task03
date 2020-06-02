package by.htp.task07.main;

public class Task17 {

	public static void main(String[] args) {

		int n;

		n = 6;

		int[][] a = new int[n][n];

		InitSquar(a);

		PrintArray(a);

	}

	public static void InitSquar(int ar[][]) {

		InitStringOnlyWitnOne(ar, 0);
		InitStringOnlyWitnOne(ar, ar.length - 1);

		for (int i = 1; i < ar.length - 1; i++) {
			InitStringWitnTwoOnes(ar, i);
		}

	}

	public static void InitStringOnlyWitnOne(int ar[][], int i) {

		for (int j = 0; j < ar[i].length; j++) {
			ar[i][j] = 1;
		}

	}

	public static void InitStringWitnTwoOnes(int ar[][], int i) {

		ar[i][0] = 1;
		ar[i][ar[i].length - 1] = 1;

	}

	public static void PrintArray(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%3d ", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
