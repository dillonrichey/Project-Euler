import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LargestProductInASeries {

	public static void main(String[] args) {

		System.out.print("Enter the file name with extension : ");
		String sequence = "";
		long greatest = 0;
		int consecNums = 13;

		try {

			Scanner sysIn = new Scanner(System.in);
			File file = new File(sysIn.nextLine());

			Scanner input = new Scanner(file);

			while (input.hasNextLine()) {
				sequence += input.nextLine();

			}
			input.close();

			for (int i = 0; i < sequence.length() - consecNums; i++) {
				long product = 1;
				for (int j = i; j < i + consecNums; j++) {

					product *= Integer.parseInt(sequence.substring(j, j + 1));

				}

				if (product > greatest)
					greatest = product;

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Number sequence: " + sequence);
		System.out.println("Sequence length: " + sequence.length());
		System.out.println("Greatest " + consecNums + "-digit product: " + greatest);
		System.out.println("You did it :)");

	}
}
