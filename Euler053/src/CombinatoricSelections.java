import java.math.BigInteger;

public class CombinatoricSelections {

	public static void main(String[] args) {
		
		BigInteger mill = BigInteger.valueOf(1000000);

		long begin = System.currentTimeMillis();

		int count = 0;

		for (int n = 1; n <= 100; n++) {
			for (int r = 1; r <= n; r++) {
				
				BigInteger combs = nCr(n,r);
				System.out.println(n + " choose " + r + " = " + combs.toString());
				
				if (combs.compareTo(mill) ==1) {
					count++;
				}
			}
		}
		
		

		long end = System.currentTimeMillis();

		long time = end - begin;
		System.out.println("Solution: " + count);
		System.out.println("Solution found in " + time + " ms.");

	}

	public static BigInteger nCr(int n, int r) {

		
		BigInteger val = fact(n).divide((fact(r).multiply(fact((n-r)))));

		return val;

	}

	public static BigInteger fact(long n) {

		BigInteger big = new BigInteger("1");

		for (long i = 1; i <= n; i++) {
			big = big.multiply(BigInteger.valueOf(i));
		}

		return big;

	}

}
