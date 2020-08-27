import java.util.ArrayList;

public class PermutedMultiples {

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();

		boolean found = false;
		int solution = 0;

		while (!found) {

			for (long x = 1; x < Integer.MAX_VALUE; x++) {
				
				String val = Long.toString(6*x);
				long compVal =5;
				
				
				
				// check if 5x and 6x are permuted multiples
				if (permuted(val, Long.toString(compVal * x))) {
					compVal--;
					// check if 6x and 4x are permuted multiples
					if (permuted(val, Long.toString(compVal * x))) {
						compVal--;
						// check if 6x and 3x are permuted multiples
						if (permuted(val, Long.toString(compVal * x))) {
							compVal--;
							// check if 6x and 2x are permuted multiples
							if (permuted(val, Long.toString(compVal * x))) {
								compVal--;
								solution = (int) x;
								found = true;
								break;
							}
						}
					}
				}
				 
			}
		}

		/*
		 * test code for permuted() method (WORKS)
		 */
		// long test1 = 125874;
		// long test2 = 2 * test1;
		//
		// if (permuted(Long.toString(test1),Long.toString(test2))){
		// solution = (int) test1;
		// }

		long end = System.currentTimeMillis();
		long time = end - begin;

		System.out.println("Solution: " + solution);
		System.out.println("Solution found in " + time + " ms.");

		// to test permutation methods (working)
		// String testOne = "125874";
		// String testTwo = "251748";
		//
		// if (permuted(testOne, testTwo)) {
		// System.out.println("Success!");
		// } else {
		// System.out.println("Failure. :/");
		// }
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 * 
	 * 		Takes in two strings and returns a true value if the strings contain
	 *         the same characters, regardless of order.
	 */
	public static boolean permuted(String a, String b) {

		if (a.length() == b.length()) {

			if (a.length() == 1) {
				if (a.charAt(0) == b.charAt(0)) {
					return true;
				}

			} else {

				ArrayList<Character> aList = new ArrayList<Character>();
				ArrayList<Character> bList = new ArrayList<Character>();

				for (char c : a.toCharArray()) {
					aList.add(c);
				}
				for (char c : b.toCharArray()) {
					bList.add(c);
				}

				if (recursivePerm(aList, bList)) {
					return true;
				}
			}

		}
		return false;

	}

	/**
	 * @param a
	 * @param b
	 * @return
	 * 
	 * 		Takes in two ArrayLists of characters and recursively iterates
	 *         through them to check if they contain the same characters. Returns
	 *         true if so.
	 * 
	 */
	public static boolean recursivePerm(ArrayList<Character> a, ArrayList<Character> b) {

		while (a.size() > 1) {
			if (b.contains(a.get(0))) {
				b.remove(a.get(0));
				a.remove(0);
				if (recursivePerm(a, b)) {
					return true;
				}
			} else {
				return false;
			}
		}

		if (a.size() == 1) {
			if (a.get(0) == b.get(0)) {
				return true;
			}
		}

		return false;

	}

}
