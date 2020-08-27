import java.math.BigInteger;

public class PowerDigitSum {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		System.out.println(digitSum(n.toString()));
		
		long endTime = System.currentTimeMillis();
		System.out.println("Program run time: " + (endTime - startTime));

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
