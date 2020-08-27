
import java.util.ArrayList;
import java.util.Collections;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n).
 * 
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and
 * each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110;
 * 
 * therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142;
 * so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * @author dillonrichey
 *
 */
public class AmicableNumbers {

	public static void main(String[] args) {
		
		ArrayList<Long> amNums = new ArrayList<>();

		long start = System.currentTimeMillis();

		long sum = 0;

		for (long a = 2; a <= 10000; a++) {

			long b = sumProperFactors(properFactors(a));

			if ((amicable(a, b) && !(amNums.contains(a))) && a != b){
				System.out.println(a + " and " + b + " are amicable numbers.");
				amNums.add(a);
				amNums.add(b);
				sum += a + b;
			}
		}
		
		System.out.println("The sum of amicable numbers less than 10000 is: " + sum);

		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Program run time: " + time);
	}

	public static boolean amicable(long a, long b) {

		if (sumProperFactors(properFactors(a)) == b) {
			if (sumProperFactors(properFactors(b)) == a) {
				return true;
			}
		}
		return false;
	}

	public static long sumProperFactors(ArrayList<Long> factors) {

		long sum = 0;
		for (int i = 0; i < factors.size(); i++) {
			sum += factors.get(i);
		}
		return sum;
	}

	public static ArrayList<Long> properFactors(long n) {

		ArrayList<Long> factors = new ArrayList<>();
		// add 1 to the list, as it is a proper factor of n, while n is not
		factors.add((long) 1);

		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == Math.sqrt(i)) {
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

}
