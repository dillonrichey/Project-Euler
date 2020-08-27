
public class SumSquareDifference {

	public static void main(String[] args) {
		
		int sumOfSquares = 0;
		int squareOfSum = 0;
		
		for (int i = 0; i < 101; i++) {
			sumOfSquares += i * i;
			squareOfSum += i;
		}
		
		squareOfSum = (int) Math.pow(squareOfSum, 2);
		
		int sumSquareDiff = squareOfSum - sumOfSquares;
		
		System.out.println(sumOfSquares);
		System.out.println(squareOfSum);
		System.out.println(sumSquareDiff);
	}

}
