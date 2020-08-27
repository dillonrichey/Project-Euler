
public class DigitFactorials {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		
		 int numSum = 0;
	
		for (long i = 3; i < 100000000; i++) {
			if (sumEqualsNum(i)) {
				numSum+=i;
				System.out.println(i + " is equal to the factorial sum of its digits.");
			}
		}
		System.out.println("Answer: " + numSum);
	
		
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Program run time: " + time);
		
	}
	
	public static long factorial(int n) {
		
		long product = 1;
		for (long i = 2; i <= n; i++) {
			product *= i;
		}
		
		return product;
		
	}
	
	static long sumFactorials(long n) {
		
		long sum = 0;
		
		String numString = Long.toString(n);
		
		for (int i = 0; i < numString.length(); i++) {
			
		 int digit = Integer.parseInt(numString.substring(i, i+1));
		 
		 sum += factorial(digit);
			
		}
		
		return sum;
		
	}
	
	static boolean sumEqualsNum (long n) {
		
		if (n == sumFactorials(n)) {
			return true;
		} else {
			return false;
		}
	}

}
