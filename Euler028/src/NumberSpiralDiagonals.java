
public class NumberSpiralDiagonals {

	public static void main(String[] args) {

		int n = 1001;

		long sumTotal = 1;
		
		long calculatedVal = (long) (4 * Math.pow(n, 2)) + (6*n) + 6;

		sumTotal += topLeft(n)+topRight(n)+bottomLeft(n)+bottomRight(n);

		System.out.println("\nTotal sum of all diagonal numbers: " + sumTotal);
		System.out.println("Calculated value: "+ calculatedVal);

//		topLeft(n);
//		topRight(n);
//		bottomLeft(n);
//		bottomRight(n);

	}

	public static Long topLeft(int n) {

		long sum = 0;
		
		System.out.print("Up/Left values: ");

		for (int i = 3; i <= n; i += 2) {
			long value = (long) (Math.pow(i, 2) - (i - 1));
			sum += value;
			System.out.print(value + ", ");
		}
		return sum;
	}

	public static Long topRight(int n) {

		long sum = 0;
		
		System.out.print("\nUp/Right values: ");

		for (int i = 3; i <= n; i += 2) {

			long value = (long) Math.pow(i, 2);
			sum += value;
			System.out.print(value + ", ");
		}
		return sum;
	}

	public static Long bottomLeft(int n) {

		long sum = 0;
		System.out.print("\nDown/Left values: ");

		for (int i = 3; i <= n; i += 2) {
			long value = (long) ((Math.pow(i, 2)) - (2 * i) + 2);
			sum += value;
			System.out.print(value + ", ");
		}
		return sum;
	}

	public static Long bottomRight(int n) {

		long sum = 0;
		System.out.print("\nDown/Right values: ");

		for (int i = 3; i <= n; i += 2) {
			long value = (long) (Math.pow(i, 2)) - (3 * i) + 3;
			sum += value;
			System.out.print(value + ", ");
		}
		return sum;
	}

}
