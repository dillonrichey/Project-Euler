
public class LongestCollatzSequence {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		int greatestChain = 0;
		int greatest = 0;

		for (int i = 2; i < 1000001; i++) {

			long num = i;
			int chainValue = 1;
			System.out.println("Number:" + i);

			while (num > 1) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = (num * 3) + 1;
				}
				chainValue += 1;
			}

			if (chainValue > greatestChain) {
				greatestChain = chainValue;
				greatest = i;
			}
			System.out.println("Chain value:" + chainValue + "\n");

		}
		System.out.println("Greatest chain value: " + greatest + ": " + greatestChain);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Run time: " + totalTime);
	}
}
