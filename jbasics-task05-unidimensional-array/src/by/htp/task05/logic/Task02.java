package by.htp.task05.logic;

import java.util.Random;

// Â öåëî÷èñëåííîé ïîñëåäîâàòåëüíîñòè åñòü íóëåâûå ýëåìåíòû. Ñîçäàòü ìàññèâ èç íîìåðîâ ýòèõ ýëåìåíòîâ.

public class Task02 {

	public static void main(String[] args) {

		int[] array;

		array = InitRandomWithZeroElements();

		int[] result;

		result = ZeroIndexArray(array);

		PrintArray(array);
		PrintArray(result);

	}

	public static int[] InitRandomWithZeroElements() {

		Random rand = new Random();

		int arraySize;

		arraySize = rand.nextInt(20);

		int[] array = new int[arraySize];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}

		int NumOfZero = rand.nextInt(arraySize - 1);

		int ZeroPosition;

		int i = 0;

		while (i < NumOfZero) {

			do {
				ZeroPosition = rand.nextInt(arraySize - 1);
			} while (array[ZeroPosition] == 0);

			array[ZeroPosition] = 0;
			i++;

		}

		return array;
	}

	public static int zeroCount(int[] ar) {

		int numofzero = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				numofzero++;
			}
		}

		return numofzero;
	}

	public static int[] ZeroIndexArray(int ar[]) {

		int[] zeroarray = new int[zeroCount(ar)];

		int j = 0;
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == 0) {
				zeroarray[j++] = i;

			}
		}

		return zeroarray;

	}

	public static void PrintArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println(); 
	}

}
