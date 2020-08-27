
public class LargestPrimeFactor {

	public static long maxPrimeFactors(long n) {
		
		long maxPrime = -1;
		
		while(n % 2 == 0) {
			maxPrime = 2;
			
			// equivalent to n /= 2
			n >>= 1;
		}
		
		/*
		 * n must be odd at this point, thus skip the 
		 * even numbers and iterate only for odd integers
		 */
		for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            while (n % i == 0) { 
                maxPrime = i; 
                n = n / i; 
            } 
        } 
		
		/*
		 * This condition is to handle the case
		 * when n is a prime number greater than 2
		 */
		if (n > 2) {
			maxPrime = n;
		}
		
		return maxPrime;
		
	}
	
	public static void main (String[] args) {
		
		long n = 151;
		System.out.println(maxPrimeFactors(n));
		
		n = 600851475143L;
		System.out.println(maxPrimeFactors(n));
	}

}
