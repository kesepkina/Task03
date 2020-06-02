package by.htp.task05.logic;

import java.util.Random;

/*«Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек, в которые надо вставить
игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на
передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.*/

public class Task18 {

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
		int a0, a1, a2;

		isfirst = true;
		real = true;
		a0 = a1 = a2 = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				if (isfirst) {
					if (i % 3 == 0) {
						a0 = ar[i];
					} else if (i % 3 == 1) {
						a1 = ar[i];
					} else if (i % 3 == 2) {
						a2 = ar[i];
					}
					isfirst = false;
				} else {
					if (i % 3 == 0) {
						if (a0 == 0) {
							a0 = ar[i];
						} else if (a0 == ar[i]) {
							a1 = 1;
						} else {
							real = false;
						}
						break;
					} else if (i % 3 == 1) {
						if (a1 == 0) {
							a1 = ar[i];
						} else if (a1 == ar[i]) {
							a0 = 1;
						} else {
							real = false;
						}
						break;
					} else if (i % 3 == 2) {
						if (a2 == 0) {
							a2 = ar[i];
						} else if (a2 == ar[i]) {
							a0 = 1;
						} else {
							real = false;
						}
						break;
					}
				}

			}
		}

		if (a0 + a1 + a2 > 9) {
			real = false;
		}

		if (!real) {
			System.out.println("При таком первоначальном условии генерация верного кода невозможна.");
			return false;
		}

		if (a0 == 0) {
			a0 = 10 - a1 - a2;
		} else if (a1 == 0) {
			a1 = 10 - a0 - a2;
		} else {
			a2 = 10 - a1 - a0;
		}

		for (int i = 0; i < ar.length; i += 3) {
			ar[i] = a0;
		}
		for (int i = 1; i < ar.length; i += 3) {
			ar[i] = a1;
		}
		for (int i = 2; i < ar.length; i += 3) {
			ar[i] = a2;
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
