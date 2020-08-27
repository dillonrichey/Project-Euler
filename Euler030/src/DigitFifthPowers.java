
public class DigitFifthPowers {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 2; i < 1000000; i++) {
			if (i == fifthPowerSum(i)) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println("Total: " + sum);

	}

	public static int fifthPowerSum(int x) {

		int sum = 0;
		while (x != 0) {
			int y = x % 10;
			sum += Math.pow(y, 5);
			x /= 10;
		}
		return sum;

	}

}
