package by.htp.task07.main;

public class Task23 {

	public static void main(String[] args) {

		int n;

		n = 6;

		double[][] a = new double[n][n];

		InitWithRule(a);

		PrintArray(a);

		System.out.println("Number of positive elements = " + CountPositive(a));

	}

	public static int CountPositive(double ar[][]) {

		int counter = 0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] > 0) {
					counter++;
				}
			}
		}

		return counter;

	}

	public static void InitWithRule(double ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = Math.sin((i * i - j * j) / (double) ar.length);
			}
		}

	}

	public static void PrintArray(double ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("% 2.2f\t", ar[i][j]);
			}
			System.out.println();
		}

		System.out.println();
	}

}
