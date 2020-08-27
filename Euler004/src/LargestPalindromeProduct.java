/**
 * 
 */

/**
 * @author dillonrichey
 *
 */
public class LargestPalindromeProduct {

	public static boolean palindromeCheck(int n) {

		int divisor = 1;

		while (n / divisor >= 10)
			divisor *= 10;

		while (n != 0) {

			int first = n / divisor;
			int last = n % 10;

			/*
			 * If first and last digit are not the same, return false.
			 */
			if (first != last) {
				return false;
			}

			/*
			 * Remove leading and trailing digit from number
			 */
			n = (n % divisor) / 10;

			/*
			 * Reduce divisor by a factor of 2, as 2 digits are dropped
			 */
			divisor = divisor / 100;

		}

		return true;
	}

	public static void main(String[] args) {

		int greatestProduct = 0;
		int gpi = 0;
		int gpj = 0;

		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {

				int product = i * j;

				if (palindromeCheck(product)) {
					if (product > greatestProduct) {
						greatestProduct = product;
						gpi = i;
						gpj = j;
					}
					System.out.println(product + " , " + i + " , " + j);
				}
			}
		}
		System.out.println(greatestProduct + " , " + gpi + " , " + gpj);

	}

}
