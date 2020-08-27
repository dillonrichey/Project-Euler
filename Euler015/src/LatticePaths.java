import java.math.BigInteger;

public class LatticePaths {

	public static void main(String[] args) {

		BigInteger gridSize = new BigInteger("21");

		BigInteger[][] grid = new BigInteger[gridSize.intValue()][gridSize.intValue()];

		// populate first row and column with value of 1
		for (int i = 0; i < gridSize.intValue(); i++) {
			grid[0][i] = BigInteger.ONE;
			grid[i][0] = BigInteger.ONE;
		}

		// calculate grid values by adding values on the left and above the index
		for (int i = 1; i < gridSize.intValue(); i++) {
			for (int j = 1; j < gridSize.intValue(); j++) {

				BigInteger left = grid[i - 1][j];
				BigInteger above = grid[i][j - 1];

				grid[i][j] = left.add(above);
				
				if (i == j) {
					System.out.println(grid[i][j]);
				}

			}
		}

//		// print grid
//		for (int i = 0; i < gridSize.intValue(); i++) {
//			for (int j = 0; j < gridSize.intValue(); j++) {
//
//				if (j == (gridSize.intValue() - 1)) {
//					System.out.print(grid[i][j] + "\n \n");
//				} else {
//					System.out.print(grid[i][j] + "\t \t");
//				}
//
//			}
//		}

	}

}
