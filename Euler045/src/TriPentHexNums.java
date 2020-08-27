import java.util.concurrent.TimeUnit;

public class TriPentHexNums {

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();

		String triStr = "Triangular numbers: ";
		String pentStr = "Pentagonal numbers: ";
		String hexStr = "Hexagonal numbers: ";

		boolean found = false;
		long test = 0;

		while (!found) {

			for (int i = 144; i < Integer.MAX_VALUE; i++) {

				test = hex(i);

				if (isPent(test)) {
					if (isTri(test)) {
						found = true;
						break;
					}
				}

			}
		}

		// for (long i = 1; i < 150; i++) {
		//
		//
		// if (!isHex(hex(i))) {
		// System.out.println("hex(" + i + ") = " + hex(i));
		// System.out.println("isHex(" + hex(i) + ") is the problem!");
		// }
		//
		// if (!isPent(pent(i))) {
		// System.out.println("pent(" + i + ") = " + pent(i));
		// System.out.println("isPent(" + pent(i) + ") is the problem!");
		// }
		//
		// if (!isTri(tri(i))) {
		// System.out.println("tri(" + i + ") = " + tri(i));
		// System.out.println("istri(" + tri(i) + ") is the problem!");
		// }
		// }

		// // test tri() method
		// for (int i = 1; i < 6; i++) {
		//
		// if (i < 5) {
		// triStr += tri(i) + ", ";
		// } else {
		// triStr += tri(i);
		// }
		//
		// }

		// // test pent() method
		// for (int i = 1; i < 6; i++) {
		//
		// if (i < 5) {
		// pentStr += pent(i) + ", ";
		// } else {
		// pentStr += pent(i);
		// }
		//
		// }

		// // test hex() method
		// for (int i = 1; i < 6; i++) {
		//
		// if (i < 5) {
		// hexStr += hex(i) + ", ";
		// } else {
		// hexStr += hex(i);
		// }
		//
		// }

		// System.out.println(triStr + "\n" + pentStr + "\n" + hexStr);

		long end = System.currentTimeMillis();
		long time = end - begin;

		System.out.println("Solution: "
				+ "T(" + triIndex(test) + ") = " 
				+ "P(" + pentIndex(test) + ") =  " 
				+ "H(" + hexIndex(test) + ") = "
						+ test);

		System.out.println("Program run time: " + time + " ms");

	}

	public static long tri(double n) {

		long t = (long) ((Math.pow(n, 2) + n) / 2);

		return t;

	}

	public static long pent(double n) {

		long p = (long) (((3 * Math.pow(n, 2)) - n) / 2);

		return p;

	}

	public static long hex(double n) {

		long h = (long) ((2 * Math.pow(n, 2)) - n);

		return h;

	}

	public static boolean isPent(long x) {

		double n = (((Math.sqrt((24 * x) + 1)) + 1) / 6);

		if (n == (int) n) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isTri(long x) {

		double n = ((Math.sqrt((8 * x) + 1)) - 1) / 2;

		if (n == (int) n) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isHex(long x) {

		double n = ((Math.sqrt((8 * x) + 1)) + 1) / 4;

		if (n == (int) n) {
			return true;
		} else {
			return false;
		}
	}

	public static long triIndex(long x) {

		double n = ((Math.sqrt((8 * x) + 1)) - 1) / 2;

		return (long) n;

	}

	public static long pentIndex(long x) {

		double n = (((Math.sqrt((24 * x) + 1)) + 1) / 6);

		return (long) n;

	}

	public static long hexIndex(long x) {

		double n = ((Math.sqrt((8 * x) + 1)) + 1) / 4;

		return (long) n;

	}

}
