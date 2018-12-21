package com.shan.sample.diagnalstar;

public class DiagnalStar {
	
	public static void printSquareStar(int number) {
		 
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
 
            for (int i = 1; i <= number; i++) {
 
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number) {
                        System.out.print("*");
                    } else if (i > 1 && i < number && (j == 1 || j == number)) {
                        System.out.print("*");
                    } else if (i == j) {
                        System.out.print("*");
                    } else if (j == ((number - i) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
	
	public static void main(String[] args) {
		printSquareStar(5);
		System.out.println("****");
		printSquareStar(8);
		System.out.println("****");
		printSquareStar(9);
		System.out.println("****");
		printSquareStar(3);
	}

}
