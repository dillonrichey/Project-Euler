import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author dillonrichey
 * 
 *         This program is a solution to Problem 2 from Project Euler.
 * 
 *         http://projecteuler.net/problem=002
 * 
 *         This program calculates the sum of the even-valued numbers in the
 *         Fibonacci sequence between 0 and four million. The sequence of
 *         numbers is printed to the console followed by the sum of the even
 *         numbers within the sequence.
 *
 */
public class EvenFibonacciNumbers {

	public static void main(String[] args) {

		System.out.println("The sum of all even fibonacci numbers less than four million is: "+ addEven(4000000));
	}

	public static int addEven(int max) {

		int sum = 0;
											/* Start Cases */
		int first = 1;						// F(0) = 1
		int second = 1;						// F(1) = 1
		int third = first + second;			// F(2) = F(n-1) + F(n-2)
											//		=   F(1) + F(0)
											//		=      1 + 1
											//		= 		 2

		while (third < max) {
			sum += third;					//    sum =    sum + F(n)
			first = second + third;			// F(n-2) = F(n-1) + F(n)
			second = third + first;			// F(n-1) =   F(n) + F(n-2)
			third = first + second;			//   F(n) = F(n-2) + F(n-1)
		}

		return sum;
	}

}
