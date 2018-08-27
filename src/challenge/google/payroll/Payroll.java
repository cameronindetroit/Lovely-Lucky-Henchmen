package challenge.google.payroll;

import java.util.ArrayList;
import java.util.Collections;

///////////////////////////// Lovely Lucky Lambs /////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

public class Payroll {

	public static void main(String[] args) {

		answer(423);

	}

	public static int answer(int input) {

		int power2Sum = 0;
		int fibbSum = 0;
		int numLambs = input;
		int difference = 0;
		int fibo1 = 1;
		int fibo2 = 0;
		int fibonacci = 1;
		int fibbTotal = 0;
		int power2Total = 0;
		int nextFibb = 0;
		int power2Difference = 0;
		int fibbSum2Difference = 0;

		if (numLambs == 0) {

			difference = 0;
			System.out.println(difference);
			return difference;
		}

		// Array to hold fibonacci sequence up to number of Lambs
		ArrayList<Integer> fibbSequenceArray = new ArrayList<>();

		// Array to hold power2 sequence up to number of Lambs
		ArrayList<Integer> power2Array = new ArrayList<>();

		// For loop to calculate the most generous way to pass out Lambs using Power2
		for (int i = 1; i <= numLambs; i = i * 2) {

			power2Array.add(i);

		}

		// Loop to calculate the most stingy way to pass out Lambs using Fibonacci
		for (int i = 0; i <= numLambs; i = i + fibonacci) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;

			fibbSequenceArray.add(fibonacci);

		}

		// sort power2Array in reverse order
		Collections.sort(power2Array, Collections.reverseOrder());
		System.out.println(power2Array);

		// sort power2Array in reverse order
		Collections.sort(fibbSequenceArray, Collections.reverseOrder());
		System.out.println(fibbSequenceArray);

		// Calculate sum of power2Array
		power2Sum += power2Array.size();

		// calculate sum of fibbsequenceArray
		fibbSum += fibbSequenceArray.size();

		// Calculate Fib Total
		for (int number : fibbSequenceArray) {

			fibbTotal += number;

		}

		for (int number : power2Array) {

			power2Total += number;

		}

		System.out.println(power2Sum);

		System.out.println(fibbSum);
//
//		System.out.println(fibbTotal);
//
//		System.out.println(power2Total);

		power2Difference = numLambs - power2Array.get(0);
		System.out.println(power2Difference);

		// Check to add additional senior henchmen
		if (power2Array.get(0) + power2Difference <= numLambs) {

			power2Sum += 1;

			System.out.println(power2Sum);

		}

		// Calculate next fibonacci number in sequence

		fibbSum2Difference = numLambs - fibbSequenceArray.get(0);
		System.out.println(fibbSum2Difference);

		// check to add additional senior level henchmen
		if (fibbSum2Difference + fibbSequenceArray.get(0) <= numLambs) {

			fibbSum += 1;

			System.out.println(fibbSum);
		}

		difference = fibbSum - power2Sum;

		difference = Math.abs(difference);
		System.out.println(difference);

		return difference;

	}

}
