
public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {

		for (int a = 1; a < 1000; a++) {

			for (int b = 1; b < 1000; b++) {

				int cSquared = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);

				double c = Math.sqrt(cSquared);

				double sum = a + b + c;

				if (sum == 1000) {
					
					long product = (long) (a * b * c);

					System.out.println(a + "² + " + b + "² = " + cSquared + "   Sum: " + sum);
					System.out.println(product);
				}
			}
		}
	}

}
