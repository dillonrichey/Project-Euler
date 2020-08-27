
public class SummationOfPrimes {

	public static void main(String[] args) {
	
		long sum = 2;
		
		long max = 2000000;
		
		for (long i = 2; i < max; i ++) {
			
			if (isPrime(i)) {
				
				System.out.println(i);
				sum += i;
				
			}
			
		}
		
		System.out.println(sum);

	}
	
private static boolean isPrime(long n) {
		
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
