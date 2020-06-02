package by.htp.task07.main;

/*Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., 2n
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат.*/

public class Task40 {

	public static void main(String[] args) {

		int n;
		n = 6;

		int[][] a = new int[n][n];

		if ((n < 3)) {
			System.out.println("Для матрицы, с размерностью " + n + " Магический квадрат не существует. "
					+ "\n\nПопробуйте перезапустить программу с использованием другой размерности.");
		} else if (n % 2 != 0) {
			System.out.println("\"Магический квадрат\" \nиз нечетного количества элементов:");
			a = oddMagicSquare(n);
			PrintArray(a);
			MagicTesting(a);
		} else if (n % 4 == 0) {
			System.out.println("\"Магический квадрат\" \nиз четного количества элементов, кратного 4:");
			a = ModFourMagicSquare(n);
			PrintArray(a);
			MagicTesting(a);
		} else {
			System.out.println("\"Магический квадрат\" \nиз четно-нечетного количества элементов:");
			a = EvenMagicSquare(n);
			PrintArray(a);
			MagicTesting(a);
		}

	}

	// Проверка на магические свойства
	public static void MagicTesting(int ar[][]) {

		boolean magic = true;

		int sum, extrasum;

		sum = 0;

		for (int i = 0; i < ar.length; i++) {
			sum += ar[i][i];
		}

		System.out.println("Sum = " + sum);

		for (int i = 0; i < ar.length; i++) {
			extrasum = 0;
			for (int j = 0; j < ar[i].length; j++) {
				extrasum += ar[i][j];
			}
			if (extrasum != sum) {
				magic = false;
				System.out.println("Sum in string " + i + " equals " + extrasum);
				break;
			}
		}

		if (magic) {
			for (int j = 0; j < ar[0].length; j++) {
				extrasum = 0;
				for (int i = 0; i < ar.length; i++) {
					extrasum += ar[i][j];
				}
				if (extrasum != sum) {
					magic = false;
					System.out.println("Sum in column " + j + " equals " + extrasum);
					break;
				}
			}
		}

		if (magic) {
			extrasum = 0;
			for (int i = 0; i < ar.length; i++) {
				extrasum += ar[i][ar.length - 1 - i];
			}
			if (extrasum != sum) {
				magic = false;
				System.out.println("Sum in rightdiagonal equals " + extrasum);
			}
		}

		if (magic) {
			System.out.println("Проверка на магически свойства пройдена успешно.");
		} else {
			System.out.println("К сожалению, данная матрица не обладает магическими свойствами.");
		}

	}

	// Метод четырёх квадратов
	public static int[][] EvenMagicSquare(int n) {

		int[][] matrix = new int[n][n];
		int[][] smallmatrix;

		int nsmall, add, t;

		nsmall = n / 2;

		smallmatrix = oddMagicSquare(nsmall);

		// Следующие четыре цикла формируют магические квадраты в четырех
		// маленьких квадратах

		for (int i = 0; i < nsmall; i++) {
			for (int j = 0; j < nsmall; j++) {
				matrix[i][j] = smallmatrix[i][j];
			}
		}

		add = nsmall * nsmall;

		for (int i = nsmall; i < n; i++) {
			for (int j = nsmall; j < n; j++) {
				matrix[i][j] = smallmatrix[i % nsmall][j % nsmall] + add;
			}
		}

		add += add;

		for (int i = 0; i < nsmall; i++) {
			for (int j = nsmall; j < n; j++) {
				matrix[i][j] = smallmatrix[i % nsmall][j % nsmall] + add;
			}
		}

		add += add / 2;

		for (int i = nsmall; i < n; i++) {
			for (int j = 0; j < nsmall; j++) {
				matrix[i][j] = smallmatrix[i % nsmall][j % nsmall] + add;
			}
		}

		// Меняем местами элементы в первых двух столбцах по зигзагу.
		for (int i = 0; i < nsmall; i++) {
			if (i != 0 && i != nsmall - 1) {
				t = matrix[i][1];
				matrix[i][1] = matrix[i + nsmall][1];
				matrix[i + nsmall][1] = t;
			} else {
				t = matrix[i][0];
				matrix[i][0] = matrix[i + nsmall][0];
				matrix[i + nsmall][0] = t;
			}
		}

		// Меняем местами столбцы при n>=10
		for (int j = (nsmall + 3) / 2; j < n - (nsmall + 3) / 2; j++) {
			for (int i = 0; i < nsmall; i++) {
				t = matrix[i][j];
				matrix[i][j] = matrix[i + nsmall][j];
				matrix[i + nsmall][j] = t;
			}
		}

		return matrix;
	}

	// evenMatrixSquare - данный метод используется для построения "Магического
	// квадрата", кратного 4.
	// Алгоритм, использующийся в данном методе - “метод Рауз-Болла”
	public static int[][] ModFourMagicSquare(int n) {

		int[][] matrix = standardMatrixFilling(n);

		int t;

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				if (((i % 4 == 0 || i % 4 == 3) && (j % 4 == 0 || j % 4 == 3))
						|| ((i % 4 == 1 || i % 4 == 2) && (j % 4 == 1 || j % 4 == 2))) {
					t = matrix[i][j];
					matrix[i][j] = matrix[n - 1 - i][n - 1 - j];
					matrix[n - 1 - i][n - 1 - j] = t;
				}
			}
		}

		return matrix;
	}

	// построение "Магического квадрата" из нечетного колличества элементов методом
	// террасс
	public static int[][] oddMagicSquare(int n) {

		int n1 = 2 * n - 1;

		int[][] terras = new int[n1][n1];
		int[][] matrix = new int[n][n];

		int counter, i, j, i1, j1;

		counter = 1;
		i1 = i = n1 / 2;
		j1 = j = 0;

		// Создание диагональной матрицы-террассы
		while (true) {
			for (int k = 0; k < n; k++) {
				terras[i--][j++] = counter++;
			}

			if (counter > n * n) {
				break;
			}

			i = ++i1;
			j = ++j1;

		}

		// Создание магического квадрата
		for (i = 0; i < n / 2; i++) {
			for (j = 0; j < n1; j++) {
				if (terras[i][j] != 0) {
					terras[i + n][j] = terras[i][j];
				}
			}
		}
		for (i = n1 - n / 2; i < n1; i++) {
			for (j = 0; j < n1; j++) {
				if (terras[i][j] != 0) {
					terras[i - n][j] = terras[i][j];
				}
			}
		}
		for (j = 0; j < n / 2; j++) {
			for (i = 0; i < n1; i++) {
				if (terras[i][j] != 0) {
					terras[i][j + n] = terras[i][j];
				}
			}
		}
		for (j = n1 - n / 2; j < n1; j++) {
			for (i = 0; i < n1; i++) {
				if (terras[i][j] != 0) {
					terras[i][j - n] = terras[i][j];
				}
			}
		}

		// Копирование внутреннего квадрата в новую матрицу
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matrix[i][j] = terras[i + n / 2][j + n / 2];
			}
		}

		return matrix;
	}

	// В методе evenMatrixSquare нужно использовать отсортированную матрицу,
	// именно этим занимается метод standardMatrixFilling
	public static int[][] standardMatrixFilling(int n) {
		int[][] matrix = new int[n][n];
		int count = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = count++;
			}
		}
		return matrix;
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
