package com.shan.sample.jumpingonclouds;

public class JumpingOnClouds {
	
	static int jumpingOnClouds(int[] c) {
        int count = 0;
        int jump = 0;
        while (count < c.length - 1) {
            System.out.println("<<< " + count);
        	if ((c.length - count > 2 ) && (c[count] == 0 && c[count+1] == 0 && c[count+2] == 0)){
                count += 2;
                jump++;
                continue;
            }

            if((c.length - count > 1 ) && (c[count] == 0 && c[count+1] == 0)){
                count += 1;
                jump++;
                continue;
            }

            if((c.length - count > 0 ) && (c[count] == 0 && c[count+1] == 1)){
                count += 2;
                jump++;
                continue;
            }
        }
        return jump;
	}

	public static void main(String[] args) {
		int[] c = {0, 0, 1, 0, 0, 1, 0};
		System.out.println(jumpingOnClouds(c));
		// Expected 4
		
		
		int[] c1 = {0, 0, 0, 0, 1, 0};
		System.out.println(jumpingOnClouds(c1));
		// Expected 3
		
		int[] c2 = {0, 0, 0, 1, 0, 0};
		System.out.println(jumpingOnClouds(c2));
		//  Expected 3
		
	}

}
