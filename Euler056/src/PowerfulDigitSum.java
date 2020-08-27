import java.math.BigInteger;

public class PowerfulDigitSum {

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();

		BigInteger greatest = new BigInteger("0");

		for (int a = 1; a <= 100; a++) {
			for (int b = 1; b <= 100; b++) {
				
				BigInteger sum = digitSum(power(a,b));

				if (greatest.compareTo(sum) == -1) {
					greatest = sum;
				}
			}
		}

		

		long end = System.currentTimeMillis();
		long time = end - begin;
		System.out.println("Solution: " + greatest);
		System.out.println("Solution found in " + time + " ms.");
	}

	public static BigInteger power(int a, int b) {

		BigInteger product = BigInteger.valueOf(a);

		product = product.pow(b);

		return product;

	}

	public static BigInteger digitSum(BigInteger n) {

		BigInteger sum;
		sum = BigInteger.ZERO;

		String numStr = n.toString();

		for (int i = 0; i < numStr.length(); i++) {
			long digit = Long.valueOf(Character.digit(numStr.charAt(i), 10));
			// System.out.println("Digit at index " + i + ": " + numStr.charAt(i) +
			// "\n"
			// + "BigInteger.valueOf(digit) = " + BigInteger.valueOf(digit));

			sum = sum.add(BigInteger.valueOf(digit));
		}

		return sum;

	}

}
