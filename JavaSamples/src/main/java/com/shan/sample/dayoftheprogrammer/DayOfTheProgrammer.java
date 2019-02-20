package com.shan.sample.dayoftheprogrammer;

public class DayOfTheProgrammer {
	
	private static int DAY_OF_THE_PROGRAMMER = 256;
	private static int YEAR = 1820;  // 2016  1800

	public static void main(String[] args) {
		System.out.println(DAY_OF_THE_PROGRAMMER);
		
		if (YEAR < 1700  || YEAR > 2700) {
			System.out.println("INVALID RANGE");
		} else {
//			DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			
		    if (YEAR == 1918)
		    	System.out.println( "26.09." + YEAR);
		        		
		    if (YEAR % 4 == 0 && (YEAR < 1918 || YEAR % 400 == 0 || YEAR % 100 != 0)) {
		    	System.out.println( "12.09." + YEAR);
		    } else {
		    	System.out.println( "13.09." + YEAR);
		    }
			
			
//			// cheking leap year or not
//			if (Year.isLeap(YEAR)) {
//				System.out.println("it is a leap year");
//			}
//			
//			
//			System.out.println(DAY_OF_THE_PROGRAMMER);
//			System.out.println(Year.of(YEAR).atDay(DAY_OF_THE_PROGRAMMER).format(dtfm));	
		}
		
		
		
		
	}

}
