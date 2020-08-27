import java.util.ArrayList;
import java.util.Collections;

/**
 * @author dillonrichey
 * 
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. 
 * For example, the sum of the proper divisors of 28 would be 
 * 
 * 	1 + 2 + 4 + 7 + 14 = 28, 
 * 
 * which means that 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called 
 * abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 
 * 
 * 	1 + 2 + 3 + 4 + 6 = 16
 * 
 * , the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical 
 * analysis, it can be shown that all integers greater than 28123 can be written as the sum of two 
 * abundant numbers. However, this upper limit cannot be reduced any further by analysis even though 
 * it is known that the greatest number that cannot be expressed as the sum of two abundant numbers 
 * is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 *
 */
public class NonAbundantSums {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		ArrayList<Long> abundNums = new ArrayList<>();
		abundNums.add((long) 12);

		for (int i = 13; i < 28124; i++) {
			if (abundance(i)) {
				abundNums.add((long) i);
			}
		}

		int sum = 276;
		// sum of all the numbers less than 24, which is the smallest
		// number that can be written as the sum of two abundant numbers

		for (int i = 25; i < 28124; i++) {
			boolean abundSum = false;
			// indicates whether or not the number is the sum of two abundant numbers

			for (Long n : abundNums) {
				if (abundNums.contains(i - n)) {
					// if the difference between i and n is also in the list of
					// abundant numbers, it can be represented as an abundant sum
					abundSum = true;
					break;
				}
				if (i < n) {
					// the number shouldn't be checked if it is less than
					// the abundant number it is being checked against
					break;
				}
			}
			if (!abundSum) {
				// if the number isn't the sum of two abundant sums,
				// add it to the total
				sum += i;
			}
		}

		System.out.println(abundNums.size());
		System.out.println(abundNums.toString());
		System.out.println("The sum of all numbers that can not be written as the sum of two abundant numbers: " + sum);

		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Program run time: " + time);

	}

	public static boolean abundance(long n) {

		if (factorSum(n) > n) {
			return true;
		}
		return false;
	}

	public static ArrayList<Long> properDivisorss(Long n) {

		ArrayList<Long> factors = new ArrayList<>();
		factors.add((long) 1);

		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == Math.sqrt(n)) {
					factors.add(i);
				} else {
					factors.add(i);
					factors.add(n / i);
				}
			}
		}
		Collections.sort(factors);
		return factors;

	}

	public static Long factorSum(long n) {

		ArrayList<Long> factors = properDivisorss(n);

		long sum = 0;

		for (int i = 0; i < factors.size(); i++) {
			sum += factors.get(i);
		}

		return sum;

	}

}
