package net.twonibbles;

import java.time.LocalDate;

public class Project19 {

	public static void main(String[] args) {
		
		int day = 23, month = 2, year = 2010;
		int dayOfWeekResult = DayOfWeek.dayOfWeek(day,month,year);
		System.out.println("Day number: " + dayOfWeekResult);
		DayOfWeek.findDay(month, day, year);
		
		
		

}



class DayOfWeek{
	
	public static int dayOfWeek(int d, int m, int y) {
        // Predefined month codes for each month
		
        int[] monthCode = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

		/*
		 * // Adjust year for January and February if (m < 3) { y -= 1; // If month is
		 * January or February, treat them as part of the previous year }
		 */

        // Calculate the year code
        int yearCode = (y % 100) + (y % 100) / 4;

        // Adjust year code for the century
        yearCode = (yearCode + (y / 100) / 4 + 5 * (y / 100)) % 7;

        // Calculate the day of the week and return the value as an integer
        return (d + monthCode[m - 1] + yearCode) % 7;
    }
	
	public static String findDay(int month, int day, int year) {
		
		LocalDate localDate = LocalDate.of(year, month, day);
		java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		System.out.println(dayOfWeek);
		return dayOfWeek.toString();
	}
	

	}
}