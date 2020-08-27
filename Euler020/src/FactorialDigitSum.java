import java.math.BigInteger;

public class FactorialDigitSum {

	public static void main(String[] args) {
	
		long startTime = System.currentTimeMillis();
		
		BigInteger number = BigInteger.valueOf(100);
		for (int i = 99; i > 0; i--) {
			BigInteger one = BigInteger.valueOf(i);
			number = number.multiply(one);
		}
		
		System.out.println(digitSum(number.toString()));
		
		
		long endTime = System.currentTimeMillis();
		long runTime = endTime - startTime;
		System.out.println("Program run time: " + runTime);
		
	}
	
private static int digitSum(String digits) {
		
		int sum = 0;
		
		for (int i = 0; i < digits.length(); i++) {
			
			Character digit = new Character(digits.charAt(i));
			String digitString = digit.toString();
			int n = Integer.parseInt(digitString);
			sum += n;
		}
		return sum;
	}

}
