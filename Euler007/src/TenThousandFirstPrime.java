import java.util.ArrayList;

public class TenThousandFirstPrime {

	public static void main(String[] args) {

		ArrayList<Integer> primes = new ArrayList<Integer>();

		int num = 2;
		primes.add(2);
		
		while (primes.size() < 10001) {
		
		if (isPrime(num)) {
			primes.add(num);
		}
		num++;
		
		}
				
		System.out.println(primes.size());
		System.out.println(primes.get(primes.size()-1));
		//System.out.println(primes.toString());

	}

	private static boolean isPrime(int n) {
		
		// Check if n is a multiple of 2
		
		if (n % 2 ==0 ) {
			return false;
		}
		// if not, then just check odd numbers
		for (int i = 3; i*i <= n; i +=2) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
