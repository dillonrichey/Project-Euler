import java.math.BigInteger;
import java.util.ArrayList;

public class DistinctPowers {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		ArrayList<BigInteger> distinctPowers = new ArrayList<BigInteger>();
		
		BigInteger number;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				number = BigInteger.valueOf(i).pow(j);
				
				if (!distinctPowers.contains(number)) {
					distinctPowers.add(number);
				}
			}
		}
		
		System.out.println("Number of distinct powers: " + distinctPowers.size());
		long end = System.currentTimeMillis();
		long runtime = end - start;
		System.out.println("Program run time: " + runtime + "ms");

	}

}
