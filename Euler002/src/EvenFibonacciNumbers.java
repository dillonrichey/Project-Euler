import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author dillonrichey
 * 
 * This program is a solution to Problem 2 from Project Euler.
 * 
 * http://projecteuler.net/problem=002
 * 
 * This program calculates the sum of the even-valued numbers in
 * the Fibonacci sequence between 0 and four million. The sequence
 * of numbers is printed to the console followed by the sum of the
 * even numbers within the sequence.
 *
 */
public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		
		//new arraylist to store numbers from Fibonacci sequence
		ArrayList<Integer> fibNums = new ArrayList<Integer>(2);
		
		
		/*
		 * initialize the first two elements in the array to
		 * contain the numbers 1 and 2, respectively.
		 */
		fibNums.add(1);
		fibNums.add(2);
		
		long fibSum = 0;
		/*
		 * set the initial value of the sum of even numbers in the 
		 * Fibonacci sequence to 2 in order to avoid an "off by two"
		 * error
		 */

		long evenFibSum = 2;
		
		while (fibSum < 4000000) {
			
			for (int i = 2; fibSum < 4000000; i++) {
				
				fibSum = fibNums.get(i-1) + fibNums.get(i-2);
				fibNums.add((int) fibSum);
				
				if (fibSum % 2 == 0) {
					evenFibSum += fibSum;
				}
			}
			
		}
		System.out.println(Arrays.toString(fibNums.toArray()));
		System.out.println(evenFibSum);

}
	
}
