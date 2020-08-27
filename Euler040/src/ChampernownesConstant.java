
public class ChampernownesConstant {

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();

		String concatStr = ".";

		int product = 1;
		int val = 1;

		while (concatStr.length() <= 1000000) {
			
			concatStr += Integer.toString(val);
			val++;
			System.out.println("i = " + val + " String length: " + concatStr.length());
			
		}
		
		for (int dVal = 1; dVal <= 1000000; dVal*=10) {
			System.out.println("Character at index " + dVal + ": " + concatStr.charAt(dVal));
			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Solution: " + product);
		
		System.out.println("Solution found in " + (end-begin) + " ms.");

	}

}
