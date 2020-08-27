
/**
 * @author dillonrichey
 *
 *         This program takes in a number and checks to see whether or not is is
 *         a palindrome number -- that is, whether it is the same number both
 *         forward and backward.
 * 
 *         The majority of the code for this class was modified from a class
 *         written by Sumit Ghosh and published on the website GeeksForGeeks in
 *         an article written by Abhijit Shankhdhar. The original article and
 *         code can be found at this site address:
 * 
 *         https://www.geeksforgeeks.org/check-number-palindrome-not-without-using-extra-space/
 *
 */
public class PalindromeMethods {

	/**
	 * @param n
	 * @return
	 */
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
				System.out.println("False: " + first + " , " + last);
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

	public static int isPalindrome(int i) {
		if (palindromeCheck(i)) {
			return i;
		} else {
			return 0;
		}

	}

	// Main method
	public static void main(String args[]) {

	}
}
