import java.io.File;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {

	public static void main(String[] args) {

		String[] numString = new String[100];
		BigInteger sum = BigInteger.ZERO;

		System.out.println("Input file name and extension: ");
		try {

			Scanner sysIn = new Scanner(System.in);
			File file = new File(sysIn.nextLine());

			Scanner numScan = new Scanner(file);

			while (numScan.hasNextLine()) {
				for (int i = 0; i < 100; i++) {
					numString[i] = numScan.nextLine();
				}
			}
			
			for (int i = 0; i < numString.length; i++) {
				BigInteger tempNum = new BigInteger(numString[i]);
				sum = sum.add(tempNum);
			}
			
			

			numScan.close();

			System.out.println(numString.length);
			System.out.println(sum);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
