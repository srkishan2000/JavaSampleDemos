package com.shan.sample.dayoftheweekchallenge;

public class DayOfTheWeekChallenge {

	// using Switch Statement
	public static void printDayOfTheWeek(int day) {
		// using string arrays here
		String[] dayOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		// using switch statement
		switch(day) {
			case 1: case 2: case 3: case 4: case 5: case 6: case 7:
				System.out.println(dayOfTheWeek[day-1]);
				break;
			default:
				System.out.println("Invalid Day");
				break;
		}
		
		// using if else statement
		if (day > 0 && day < 8) {
			System.out.println(dayOfTheWeek[day-1]);
		} else {
			System.out.println("Invalid Day");
		} 
	}
	
	public static void main(String[] args) {
		printDayOfTheWeek(3);
		printDayOfTheWeek(7);
		printDayOfTheWeek(675);

	}

}
