import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 * You are given the following information, but you may prefer 
 * to do some research for yourself.
 * 
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * 
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class CountingSundays {
	// class body

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		

		System.out.println("Total days: " + totalDays(1901, 2001));
		System.out.println("Sundays:" + sundays(1901, 2001, "Tuesday").toString());
		System.out.println("First days: " + firstDays(1901, 2001));
		System.out.println("First Sundays: " + firstSundays(sundays(1901,2001,"Tuesday"), firstDays(1901,2001)));
		System.out.println("Number of first Sundays: " + firstSundays(sundays(1901,2001,"Tuesday"), firstDays(1901,2001)).size());
		
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Program run time: " + time);

	}

	public static ArrayList<Long> sundays(int firstYear, int lastYear, String startDay) {

		ArrayList<Long> sundays = new ArrayList<>();

		long offset = 0;

		switch (startDay) {
		case "Monday":
			offset = 7;
			break;
		case "Tuesday":
			offset = 6;
			break;
		case "Wednesday":
			offset = 5;
			break;
		case "Thursday":
			offset = 4;
			break;
		case "Friday":
			offset = 3;
			break;
		case "Saturday":
			offset = 2;
			break;
		case "Sunday":
			offset = 0;
			break;
		}

		for (long i = offset; i < totalDays(firstYear, lastYear); i += 7) {
			sundays.add(i);
		}
		return sundays;
	}

	
	
	public static ArrayList<Long> firstDays(long firstYear, long lastYear) {

		ArrayList<Long> firstDays = new ArrayList<>();
		firstDays.add((long) 1);

		long totalDays = totalDays(firstYear, lastYear);

		long dayNum = 1;
		int month;
		long year = firstYear;
		long daysPerYear;

		while (dayNum < totalDays) {
			for (month = 1; month < 13; month++) {
				dayNum += daysPerMonth(month, year);
				firstDays.add(dayNum);
			}
			year++;
		}
		return firstDays;
	}
	
	
	public static ArrayList<Long> firstSundays(ArrayList<Long> a, ArrayList<Long> b){
		
		ArrayList<Long> firstSundays = new ArrayList<>();
		
		for(Long day: a) {
			if (b.contains(day)) {
				firstSundays.add(day);
			}
		}
		
		return firstSundays;
		
	}

	/**
	 * @param startYear
	 * @param endYear
	 * @return
	 */
	public static long totalDays(long startYear, long endYear) {

		long days = 1;

		for (long year = startYear; year < endYear; year++) {
			days += daysPerYear(year);
		}
		return days;
	}

	/**
	 * @param year
	 * @return
	 */
	public static long daysPerYear(long year) {

		if ((year % 4 == 0 && century(year) == false) || (century(year) == true && year % 400 == 0)) {
			if (year < 2000) {
				return 366;
			} else {
				return 365;
			}
		} else {
			return 365;
		}
	}

	/**
	 * @param month
	 * @param year
	 * @return
	 */
	public static int daysPerMonth(int month, long year) {

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return (leapYear(year)) ? 29 : 28;
		}
		return 31;
	}

	/**
	 * @param year
	 * @return
	 */
	static boolean leapYear(long year) {

		if (((year % 4 == 0 && century(year) == false) || (century(year) == true && year % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Takes in a given year as an integer and returns a boolean value indicating if
	 * the year is a century or not.
	 * 
	 * @param year
	 * @return
	 */
	static boolean century(long year) {
		if (year % 1000 == 0) {
			return true;
		} else {
			return false;
		}
	}
}