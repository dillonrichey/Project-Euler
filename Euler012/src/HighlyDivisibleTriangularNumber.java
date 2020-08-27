import java.util.ArrayList;

public class HighlyDivisibleTriangularNumber {

	public static void main(String[] args) {

		ArrayList<Long> triNums = new ArrayList<Long>();

		triNums.add((long) 0);

		for (long i = 1; i < 100000; i++) {
			long num = 0;
			for (long j = i; j > 0; j--) {
				num += j;

			}
			triNums.add(num);
		}

		long numFactors = 0;

		for (long i = 1; i < triNums.size(); i++) {
			ArrayList<Long> factors = triFactors(triNums.get((int) i));
			numFactors = factors.size();
			if (numFactors > 500) {
				System.out.println(triNums.get((int)i));
			}
			//System.out.println("Number: " + triNums.get((int) i) + " Number of factors: " + numFactors);

		}

	} // end main method

	public static ArrayList<Long> triFactors(long n) {
		ArrayList<Long> factors = new ArrayList<Long>();

		for (long i = 1; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {
				factors.add(i);
				factors.add(n / i);
			}
		}
		return factors;

	}
}
