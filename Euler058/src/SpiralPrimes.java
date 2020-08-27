
public class SpiralPrimes {

	public static void main(String[] args) {
		{

			long begin = System.currentTimeMillis();

			double cornerPrimes = 0;
			double total = 1;
			double ratio = 1.0;
			
			int n = 1;

			while (ratio >= 0.1) {

				
				if (isPrime(topRight(n))) {
					cornerPrimes += 1;
				}

				if (isPrime(topLeft(n))) {
					cornerPrimes += 1;
				}

				if (isPrime(bottomLeft(n))) {
					cornerPrimes += 1;
				}

				total += 4;
				
				ratio = cornerPrimes/total;
				
				

				System.out.println("Number of primes in " + n + " spirals: " + cornerPrimes);
				System.out.println("Number of digits in " + n + " spirals: " + total);
				System.out.println("Ratio = " + ratio);
				///System.out.println("Rounded ratio = " + round);
			
				n+=1;

				
			}

			int sideLength = ((2 * (n-1) )+ 1);

			long end = System.currentTimeMillis();
			long time = end - begin;

			System.out.println("Solution: " + sideLength);
			System.out.println("Solution found in " + time + " ms.");

		}
	}

	public static boolean isPrime(long n) {

		if (n % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static int sideLength(int n) {

		int sl = (2 * n) + 1;

		return sl;
	}

	public static Long bottomRight(int n) {

		long value = (long) Math.pow(((2 * n) + 1), 2);

		return value;

	}

	public static Long bottomLeft(int n) {

		long value = (long) (Math.pow(((2 * n) + 1), 2) - (2 * n));

		return value;

	}

	public static Long topLeft(int n) {

		long value = (long) (Math.pow(((2 * n) + 1), 2) - (4 * n));

		return value;
	}

	public static Long topRight(int n) {

		long value = (long) (Math.pow(((2 * n) + 1), 2) - (6 * n));

		return value;
	}

}
