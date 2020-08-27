
/**
 * @author dillonrichey
 *
 */
public class PentagonNumbers {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();

		int result = 0;
		boolean found = false;
		int i = 1;
		int k = 0, j = 0;

		while (!found) {
			i++;

			k = i * (3 * i - 1) / 2;
			
			for (int ii = i-1; ii > 0; ii--) {
				 j = ii * (3 *ii -1) / 2;
				
				if (isPent(k - j) && isPent (k + j)) {
					result = k -j;
					found = true;
					break;
				}
				
			}
			
		}
		
		long end = System.currentTimeMillis();
		
		long time = end - start;
		
		System.out.println("k = " + pentIndex(k) + ", j = " + pentIndex(j)
				+ "\n"
				+ "The value of D is " + result
				+"\n"
				+ "Solution took " + time + " ms.");

	}

	public static boolean isPent(int x) {

		double n = (((Math.sqrt((24 * x) + 1)) + 1) / 6);

		if (n == (int) n) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @param x
	 * @return index of a pentagonal number
	 */
	public static int pentIndex(int x) {

		if (isPent(x)) {
			return (int) (((Math.sqrt((24 * x) + 1)) + 1) / 6);
		} else {
			return 0;
		}

	}
}
