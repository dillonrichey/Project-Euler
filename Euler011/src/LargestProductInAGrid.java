import java.io.File;
import java.util.Scanner;

public class LargestProductInAGrid {

	public static void main(String[] args) {

		System.out.print("Enter the file name with extension : ");
		String gridList = "";
		int[][] grid = new int[20][20];
		long greatest = 0;

		try {

			Scanner sysIn = new Scanner(System.in);
			File file = new File(sysIn.nextLine());

			Scanner input = new Scanner(file);

			while (input.hasNextLine()) {
				gridList += input.nextLine();
			}
			input.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		String[] integerStrings = gridList.split(" ");

		int[] integers = new int[integerStrings.length];

		for (int i = 0; i < integers.length; i++) {

			integers[i] = Integer.parseInt(integerStrings[i]);
		}

		int i = 0;
		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 20; col++) {
				grid[row][col] = integers[i];
				i++;
			}
		}

		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 20; col++) {
				if (col == 19) {
					System.out.print(grid[row][col] + "\n");
				} else {
					System.out.print(grid[row][col] + " ");
				}
			}

		}

		// multiply numbers horizontally
		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 17; col++) {
				long product = 1;

				product *= grid[row][col] * grid[row][col + 1] * grid[row][col + 2] * grid[row][col + 3];

				if (product > greatest) {
					greatest = product;
				}
			}
		}
		System.out.println(greatest);

		// multiply numbers vertically
		for (int row = 0; row < 17; row++) {
			for (int col = 0; col < 20; col++) {
				long product = 1;

				product *= grid[row][col] * grid[row + 1][col] * grid[row + 2][col] * grid[row + 3][col];

				if (product > greatest) {
					greatest = product;
				}
			}
		}
		System.out.println(greatest);

		// multiply numbers diagonally (left to right)
		for (int row = 0; row < 17; row++) {
			for (int col = 0; col < 17; col++) {
				long product = 1;

				product *= grid[row][col] * grid[row + 1][col + 1] * grid[row + 2][col + 2] * grid[row + 3][col + 3];

				if (product > greatest) {
					greatest = product;
				}
			}
		}
		System.out.println(greatest);

		// multiply numbers diagonally (right to left)
		for (int row = 0; row < 17; row++) {
			for (int col = 3; col < 20; col++) {
				long product =1;
				
				product *= grid[row][col] * grid[row +1][col-1] * grid[row+2][col-2] * grid[row+3][col-3];
				
				if (product > greatest) {
					greatest = product;
				}
				
			}
		} System.out.println(greatest);

	} // end main method

}
