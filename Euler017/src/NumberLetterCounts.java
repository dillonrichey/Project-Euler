/*
 * If the numbers 1 to 5 are written out in words: 
 * one, two, three, four, five, then there are 
 * 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) 
 * inclusive were written out in words, how many 
 * letters would be used?
 * 
 */
public class NumberLetterCounts {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		String allNumWords = "";

		for (int i = 1; i < 1000; i++) {

			allNumWords += hunds(i);
			System.out.println(hunds(i));

		}
		
		allNumWords += "OneThousand";
		System.out.println(allNumWords);
		System.out.println("Number of letters used: " +allNumWords.length());
		long end = System.currentTimeMillis();
		long runtime = end - start;
		System.out.println("Program run time: " + runtime);

	}

	public static String hunds(int n) {

		String hundsWords = "";
		String number = Integer.toString(n);
		String hunds = null;
		int currentHunds = 0;

		if (number.length() > 2) {
			hunds = number.substring(number.length() - 3, number.length() - 2);
		}

		if (hunds != null) {
			currentHunds = Integer.parseInt(hunds);
		}

		

			switch (currentHunds) {
			case 1:
				hundsWords += "OneHundred";
				break;
			case 2:
				hundsWords += "TwoHundred";
				break;
			case 3:
				hundsWords += "ThreeHundred";
				break;
			case 4:
				hundsWords += "FourHundred";
				break;
			case 5:
				hundsWords += "FiveHundred";
				break;
			case 6:
				hundsWords += "SixHundred";
				break;
			case 7:
				hundsWords += "SevenHundred";
				break;
			case 8:
				hundsWords += "EightHundred";
				break;
			case 9:
				hundsWords += "NineHundred";
				break;
			}

			if (number.length() > 2 && (n % 100 != 0)) {
				hundsWords += "And";
			}
		hundsWords += tens(n);

		return hundsWords;
	}

	public static String tens(int n) {

		String tensWords = "";
		String number = Integer.toString(n);
		String tens = null;
		int currentTens = 0;

		if (number.length() >= 2) {
			tens = number.substring(number.length() - 2, number.length() - 1);
		}
		if (tens != null) {
			currentTens = Integer.parseInt(tens);
		}

		if (currentTens == 0 || currentTens == 1) {
			return ones(n);
		} else {
			switch (currentTens) {
			case 2:
				tensWords = "Twenty";
				break;
			case 3:
				tensWords = "Thirty";
				break;
			case 4:
				tensWords = "Forty";
				break;
			case 5:
				tensWords = "Fifty";
				break;
			case 6:
				tensWords = "Sixty";
				break;
			case 7:
				tensWords = "Seventy";
				break;
			case 8:
				tensWords = "Eighty";
				break;
			case 9:
				tensWords = "Ninety";
				break;

			}

			tensWords += ones(n);
		}
		return tensWords;
	}

	public static String ones(int n) {

		String onesWords = "";

		String number = Integer.toString(n);
		String ones = number.substring(number.length() - 1);
		String tens = null;
		int currentTens = 0;

		/*
		 * if the number has two or more digits, initialize the variable tens as the
		 * second to last digit in the n
		 * 
		 */
		if (number.length() >= 2) {
			tens = number.substring(number.length() - 2, number.length() - 1);
		}
		// initialize variable currentOne as the digit currently in the ones place
		int currentOne = Integer.parseInt(ones);

		/*
		 * if string tens has been initialized with a value, set integer variable
		 * currentTens equal to the integer contained in tens
		 */
		if (tens != null) {
			currentTens = Integer.parseInt(tens);
		}

		/*
		 * if tens has been initialized, enter for loop for handling special cases for
		 * values 10, 11, 12, 13, ad 15
		 */
		if (currentTens == 1 && (currentOne <= 9)) {

			switch (currentOne) {
			case 0:
				onesWords += "Ten";
				break;
			case 1:
				onesWords += "Eleven";
				break;
			case 2:
				onesWords += "Twelve";
				break;
			case 3:
				onesWords += "Thirteen";
				break;
			case 4:
				onesWords += "Fourteen";
				break;
			case 5:
				onesWords += "Fifteen";
				break;
			case 6:
				onesWords += "Sixteen";
				break;
			case 7:
				onesWords += "Seventeen";
				break;
			case 8:
				onesWords += "Eighteen";
				break;
			case 9:
				onesWords += "Nineteen";
				break;

			}

		} else {
			// else return value of ones digit alone (all cases where number > 20 and not
			// divisible by 10)
			switch (currentOne) {
			case 0:
				break;
			case 1:
				onesWords += "One";
				break;
			case 2:
				onesWords += "Two";
				break;
			case 3:
				onesWords += "Three";
				break;
			case 4:
				onesWords += "Four";
				break;
			case 5:
				onesWords += "Five";
				break;
			case 6:
				onesWords += "Six";
				break;
			case 7:
				onesWords += "Seven";
				break;
			case 8:
				onesWords += "Eight";
				break;
			case 9:
				onesWords += "Nine";
				break;
			}
		}

		return onesWords;
	}
}
