import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CodedTriangleNumbers {

	private static ArrayList<String> wordList = new ArrayList<String>();

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		// add words to wordList
		makeList(readFile("words.txt"));

		ArrayList<Integer> triNums = new ArrayList<>();

		// add the first 26 triangle numbers to the list for now
		// in a minute we'll come back and add the value for the
		// number of letters in the longest word in the file * 26
		// (the largest value for aa given number)
		// the word in the file with the largest value is "RESPONSIBILITY",
		// with a value is 192. Therefore, we calculate all the triangle numbers under 167; 
		for (int i = 1; i < 160; i++) {
			triNums.add(triangleNumber(i));
		}
		
		int wordCount = 0;
		
		for (long i = 0; i < wordList.size(); i++) {
			
			if (triNums.contains(wordValue(wordList.get((int) i)))) {
			wordCount++;
			}
		}
		
		System.out.println("Word count: " + wordCount);
		
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("\nProgram run time: " + time);

	}

	public static String readFile(String filename) {

		System.out.println("Reading file");

		File file = new File(filename);

		BufferedReader reader;
		String wordList = "";

		try {
			StringBuffer contents = new StringBuffer();
			String text = null;
			reader = new BufferedReader(new FileReader(file));
			while ((text = reader.readLine()) != null) {
				contents.append(text).append(System.getProperty("line.separator"));
			}

			wordList += contents.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return wordList;

	}

	public static void makeList(String words) {
		System.out.println("Making list");

		String temp = ""; // empty string that will be used to temporarily store the individual names
		boolean isWord = false;
		int i = 0;
		while (i < words.length()) {
			if (words.charAt(i) == '\"') {
				// if a quotation mark is read in, change the value of isName
				isWord = !isWord;
				i++; // skip to next character
			}
			if (isWord) {
				// if current character is part of a name, add it to the temp string
				temp += words.charAt(i);
			} else {
				if (temp == "") {
					// prevents a blank line from being included
					break;
				} else {
					
					wordList.add(temp); // adds name to list of names
					temp = ""; // resets the value of the temp string
				}
			}
			i++;

		}
	}

	public static int wordValue(String word) {

		System.out.println("Calculating word values");

		int sum = 0;

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			int letterValue = 0;

			switch (letter) {
			case 'A':
				letterValue = 1;
				break;
			case 'B':
				letterValue = 2;
				break;
			case 'C':
				letterValue = 3;
				break;
			case 'D':
				letterValue = 4;
				break;
			case 'E':
				letterValue = 5;
				break;
			case 'F':
				letterValue = 6;
				break;
			case 'G':
				letterValue = 7;
				break;
			case 'H':
				letterValue = 8;
				break;
			case 'I':
				letterValue = 9;
				break;
			case 'J':
				letterValue = 10;
				break;
			case 'K':
				letterValue = 11;
				break;
			case 'L':
				letterValue = 12;
				break;
			case 'M':
				letterValue = 13;
				break;
			case 'N':
				letterValue = 14;
				break;
			case 'O':
				letterValue = 15;
				break;
			case 'P':
				letterValue = 16;
				break;
			case 'Q':
				letterValue = 17;
				break;
			case 'R':
				letterValue = 18;
				break;
			case 'S':
				letterValue = 19;
				break;
			case 'T':
				letterValue = 20;
				break;
			case 'U':
				letterValue = 21;
				break;
			case 'V':
				letterValue = 22;
				break;
			case 'W':
				letterValue = 23;
				break;
			case 'X':
				letterValue = 24;
				break;
			case 'Y':
				letterValue = 25;
				break;
			case 'Z':
				letterValue = 26;
				break;
			}
			sum += letterValue;
		}
		return sum;

	}

	public static int triangleNumber(int n) {

		System.out.println("Calculating triangle numbers");

		int triNum = (((n + 1) * n) / 2);

		return triNum;
	}

}
