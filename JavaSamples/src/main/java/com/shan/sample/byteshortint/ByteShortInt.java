package com.shan.sample.byteshortint;

public class ByteShortInt {

	
	public static void main(String[] args) {
		 /* 
		 	There's a minimum and a maximum. So with a data type 'int', the computer assigns enough space to store a number that is
		 between the ranges of around about minus 2.147 billion to positive 2.147 billion.
		 the minimum/maximum values that can be stored in this data type as well as other data types.
		 So it turns out the minimum range, I'm going to delete that and put 'myMinValue'
		 for an 'integer' is, I said minus two billion, to it's '-2,147,483,648'.
		 So that is the smallest number that can fit in an 'integer'. So we try and make it smaller still
		 if we make the 8 on the end a 9, we actually get an error, and if we hover our mouse 'Integer number too large'
		 So all that sounds a bit funny, you'd think that probably should say 'Integer number too small', but
		 essentially what it's saying is, we've trying to exceed the boundaries of the minimum and maximum values of an integer.
		 */
		
		// int has the width of 32;
//		int intMinValue = -2_147_483_648;
//		int intMaxValue = 2_147_483_647;
//		int intTotal = (intMinValue / 2);
		
		/*
		 	So the next data type I want to discuss is called a 'byte'. So we can type this like:
		'byte myByteValue = 10' So what we're doing in there is we're telling the
		computer is this is a data type of type 'byte', and we're assigning the value of '10'.
		And the name of course we're defining is 'myByteValue'. Now byte value is
		is allocated by the computer a much smaller amount of space, and consequently
		can fit a much smaller number.
		In actual fact a 'byte' can only store a number in the range of -128 to 127. So literally,
		that is the smallest number that will fit in a 'byte' and the largest number that can fit is 127.
		So if we try and exceed that, we get an error.
		 */
		
		// byte has the width of 8;
//		byte byteMinValue = -128;
//		byte byteMaxValue = 127;
//		// variable which is type 'byte'. But Java has converted that automatically to an 'integer' by default, 
//		// when you're making an assignment. in an expression, Java converts that to an 'integer'. need byte casting	
//		byte byteTotal = (byte) (byteMinValue / 2);
		
		/*
		 	Now a 'short', that value for a 'short', we'll put 'myShortValue'
		for the name, and this can store a larger number. Around 30000 for argument's sake.
		But the actual largest number that can be stored in a 'short' is -32768.
		So if you try and go smaller, you get an error and the largest is 32767,
		and if we try to exceed it we get an error. So again that's a different type
		and generally speaking, a 'short' is allocated about twice the amount of space
		that a 'byte' is and about half the amount of, that an 'integer' is.
		 */
		
		// short has the width of 16;
//		short shortMinValue = -32768;
//		short shortMaxValue = 32767;
//		short shortTotal = (short) (shortMinValue / 2);
		
		/*
		 	where you've got a number that you want to process that is larger than the amount for an 'int'. and we call that a 'long'.
		a 'long' value, we can actually store a huge number. It's actually 2 to the power of 63.
		*/
		
		// long has the width of 64;
//		long myLongValue = 9_223_372_036_854_775_807L;
		
		
		
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		
		Long long_Total = 50000L + 10L * (byteValue + shortValue + intValue);  // in Expression type will be accepted as long from (byte, int or short) 
		short short_Total = (short) (1000 + 10 * (byteValue + shortValue + intValue)); // needs to have the short type casting here
		
		System.out.println("long_Total : "+long_Total);
		System.out.println("short_Total : "+short_Total);
		
	}

}
