package com.shan.sample.simpleinterest;

import java.util.Scanner;

public class SimpleInterest {
	
	public static float simpleInterest(float principal, float interest, float period) {
		
		System.out.println("Enter the Principal : " + principal);
        System.out.println("Enter the Rate of interest : " + interest + " %");
        System.out.println("Enter the Time period : " + period + " months");
		
		return (interest * period * principal) / 100;
	}

	public static void main(String[] args) {
		
		System.out.printf("%.2f", simpleInterest(20202f, 2.5f, 3f));
		System.out.println("\n"+"==========="+"\n");
		System.out.printf("%.2f", simpleInterest(60000f, 1.7f, 60f));
		
		System.out.println("\n"+"=+=+=+=+=+="+"\n");
		
		System.out.println("Here the locale set to US to represent the decimal separator as '.'  \n");
		
		System.out.println(String.format(java.util.Locale.US, "%.2f", simpleInterest(20202f, 2.5f, 3f)));
		System.out.println("===========");
		System.out.println(String.format(java.util.Locale.US, "%.2f", simpleInterest(60000f, 1.7f, 60f)));
		
		
		
		System.out.println("\n ======> For Command Line <====== \n");
		
		float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float si;
        si = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + si);
        
        s.close();
		
	}

}
