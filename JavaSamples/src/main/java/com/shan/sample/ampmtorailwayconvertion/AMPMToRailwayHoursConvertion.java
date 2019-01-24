package com.shan.sample.ampmtorailwayconvertion;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AMPMToRailwayHoursConvertion {

	public static void main(String[] args) {
		 String time = "3:30 PM";

	    SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm a");

	    SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm");

	    try {
	    	System.out.println("12 to 24 Hours Convertion....");
			System.out.println(time + " Converted to Railway Hours -> " + date24Format.format(date12Format.parse(time)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
