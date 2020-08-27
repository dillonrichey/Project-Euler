import java.math.BigInteger;

public class PowerfulDigitCounts {

	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 1; i < 100; i ++) {
			for (int j = 1; j < 100; j++) {
				
				if (nthDigitPower(i,j)) {
					System.out.println(i + "^" + j + " is an nth digit power.");
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

	public static boolean nthDigitPower(int a, int b) {

		BigInteger product = BigInteger.valueOf(a).pow(b);

		String numStr = product.toString();

		if (numStr.length() == b) {
			return true;
		}

		return false;
	}
}
