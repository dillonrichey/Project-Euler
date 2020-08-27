/*
 * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
 * 
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 * 
 * (Please note that the palindromic number, in either base, may not include leading zeros.)
 * 
 */

public class DoubleBasePalindromes {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		long palSum = 0;

		for (long i = 1; i < 1000000; i++) {

			if (longIsPalindrome(i)) {

				String biString = Long.toBinaryString(i);

				if (leadingZero(biString) == false && (stringIsPalindrome(biString))) {
					palSum += i;
					System.out.println(
							"This number is a double-base palindrome: " + i + "\nIn binary: " + biString.toString());
				}

			}

		}

		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Sum of all double-base palindromes less than one million: " + palSum);
		System.out.println("Program run time: " + time);

	}

	public static boolean longIsPalindrome(long n) {

		long divisor = 1;

		/*
		 * If the quotient of the given number and the divisor is greater than 10,
		 * multiply the divisor by 10. Once the quotient is < 10, dividing the number by
		 * 10 will return the first digit of the number.
		 */
		while (n / divisor >= 10) {
			divisor *= 10;
		}

		while (n != 0) {

			// divide the number by the calculated divisor to obtain the first digit
			long first = n / divisor;
			// calculating the remainder of the number divided by 10 will return the last
			// digit
			long last = n % 10;

			/*
			 * If first and last digit are not the same, return false/
			 */
			if (first != last) {
				return false;
			}

			// remove leading and trailing digit from number
			n = (n % divisor) / 10;

			// reduce the divisor by a factor of 2, as 2 digits are dropped
			divisor = divisor / 100;

		}

		return true;
	}

	public static boolean stringIsPalindrome(String biString) {

		boolean same = true;

		for (int i = 0; i < biString.length() / 2; i++) {
			int second = biString.length() - (i + 1);

			if (biString.charAt(i) != biString.charAt(second)) {
				same = false;
				return false;
			}

		}

		return true;

	}

	public static boolean leadingZero(String biNum) {

		if (biNum.charAt(0) == 0) {
			return true;
		}

		return false;
	}
}
