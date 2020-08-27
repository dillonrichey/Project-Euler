import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class NamesScores {

	private static ArrayList<String> nameList = new ArrayList<String>();

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		makeList(readFile("names.txt"));
		System.out.println("The value of the names in file 'names.txt': " + nameValue());

		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Program run time: " + time);

	}

	public static String readFile(String filename) {
		File file = new File(filename);

		BufferedReader reader;
		String nameList = "";

		try {
			StringBuffer contents = new StringBuffer();
			String text = null;
			reader = new BufferedReader(new FileReader(file));
			while ((text = reader.readLine()) != null) {
				contents.append(text).append(System.getProperty("line.separator"));
			}
			nameList = contents.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return nameList;
	}

	public static void makeList(String names) {

		String temp = ""; // empty string that will be used to temporarily store the individual names
		boolean isName = false;
		int i = 0;
		while (i < names.length()) {
			if (names.charAt(i) == '\"') {
				// if a quotation mark is read in, change the value of isName
				isName = !isName;
				i++; // skip to next character
			}
			if (isName) {
				// if current character is part of a name, add it to the temp string
				temp += names.charAt(i);
			} else {
				if (temp == "") {
					// prevents a blank line from being included
					break;
				} else {
					nameList.add(temp); // adds name to list of names
					temp = ""; // resets the value of the temp string
				}
			}
			i++;

		}
		Collections.sort(nameList);
		System.out.println("Names sorted: " + nameList.size());
	}

	private static long nameValue() {
		long total = 0;
		int i = 1; //crucial to set initial iterator value to 1 in order to get the multiplication correct
		Iterator<String> itr = nameList.iterator();
		while (itr.hasNext()) {
			String tmp = itr.next().toString();
			int nameSum = 0;

			for (int j = 0; j < tmp.length(); j++) {

				if (tmp.charAt(j) == 'A')
					nameSum += 1;
				else if (tmp.charAt(j) == 'B')
					nameSum += 2;
				else if (tmp.charAt(j) == 'C')
					nameSum += 3;
				else if (tmp.charAt(j) == 'D')
					nameSum += 4;
				else if (tmp.charAt(j) == 'E')
					nameSum += 5;
				else if (tmp.charAt(j) == 'F')
					nameSum += 6;
				else if (tmp.charAt(j) == 'G')
					nameSum += 7;
				else if (tmp.charAt(j) == 'H')
					nameSum += 8;
				else if (tmp.charAt(j) == 'I')
					nameSum += 9;
				else if (tmp.charAt(j) == 'J')
					nameSum += 10;
				else if (tmp.charAt(j) == 'K')
					nameSum += 11;
				else if (tmp.charAt(j) == 'L')
					nameSum += 12;
				else if (tmp.charAt(j) == 'M')
					nameSum += 13;
				else if (tmp.charAt(j) == 'N')
					nameSum += 14;
				else if (tmp.charAt(j) == 'O')
					nameSum += 15;
				else if (tmp.charAt(j) == 'P')
					nameSum += 16;
				else if (tmp.charAt(j) == 'Q')
					nameSum += 17;
				else if (tmp.charAt(j) == 'R')
					nameSum += 18;
				else if (tmp.charAt(j) == 'S')
					nameSum += 19;
				else if (tmp.charAt(j) == 'T')
					nameSum += 20;
				else if (tmp.charAt(j) == 'U')
					nameSum += 21;
				else if (tmp.charAt(j) == 'V')
					nameSum += 22;
				else if (tmp.charAt(j) == 'W')
					nameSum += 23;
				else if (tmp.charAt(j) == 'X')
					nameSum += 24;
				else if (tmp.charAt(j) == 'Y')
					nameSum += 25;
				else if (tmp.charAt(j) == 'Z')
					nameSum += 26;
			}

			nameSum *= (i); // multiply the value of each name by its position in the list
			total += nameSum; // add the value of each name * position to the total of all names
			i++;
		}

		return total;
	}

}
