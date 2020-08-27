
public class SquareDigitChains {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		int count = 0;

		for (int i = 10000000; i > 0; i--) {
			
			System.out.println("The final square sum of " + i + " is " + finalSquareSum(i));

			if (finalSquareSum(i) == 89) {
				count++;
			}
		}

		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Solution: " + count);
		System.out.println("Solution found in " + time + " ms.");

	}

	public static int squareSum(int n) {

		int sum = 0;
		String numStr = Integer.toString(n);

		for (int i = 0; i < numStr.length(); i++) {
			int digit = Character.getNumericValue(numStr.charAt(i));

			// System.out.println("Numeric value of character at index " + i + " : " +
			// digit);
			// System.out.println(digit + "^" + digit + " = " + Math.pow(digit, 2));

			sum += Math.pow(digit, 2);
		}

		return sum;

	}

	public static int finalSquareSum(int n) {

		int output = squareSum(n);

		if (output == 89) {
			return 89;
		} else if (output == 1) {
			return 1;
		} else {
			return finalSquareSum(output);
		}

	}
}
