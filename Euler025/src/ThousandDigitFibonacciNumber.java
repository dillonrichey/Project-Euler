import java.math.BigInteger;
import java.util.ArrayList;

public class ThousandDigitFibonacciNumber {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		ArrayList<BigInteger> fibNums = new ArrayList<>();

		BigInteger newFib = null;
		fibNums.add(BigInteger.valueOf(1));
		fibNums.add(BigInteger.valueOf(1));

		String number = "1";
		for (int i = 1; i < 1000; i++) {
			number += "0";
		}

		BigInteger max = strToBig(number);

		System.out.println(max.toString());
		System.out.println(max.toString().length());

		boolean thousandPlus = false;
		int n = 2;
		do {
			newFib = fibNums.get(n - 1).add(fibNums.get(n - 2));
			fibNums.add(newFib);
			n++;

			if (newFib.toString().length() >= 1000) {
				thousandPlus = true;
			}
		} while (thousandPlus == false);
		
		System.out.println("The first term in the Fibonacci sequence to contain 1,000 digits is term number " + fibNums.size());

		long end = System.currentTimeMillis();
		long runTime = end - start;
		System.out.println("Program run time: " + runTime);
	}

	private static BigInteger strToBig(String number) {

		String string = number;
		BigInteger bigIntStr = new BigInteger(string);

		return bigIntStr;
	}

}
