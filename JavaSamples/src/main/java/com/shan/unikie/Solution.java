package com.shan.unikie;

public class Solution {
	
	static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        // r is length of an array and l is 0
        while (l < r) {
        	//int m = (l + r) / 2;
            if (A[r] > X) {
                r = r - 1;
            } else {
                l = r;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }

	public static void main(String[] args) {
		int[] a = {-2000000000, 5 , 8 ,9, 2000000000};
		System.out.println(solution(a, 1));  // -1
		System.out.println(solution(a, 2));  // -1
		System.out.println(solution(a, 8));  // 2
		System.out.println(solution(a, -2000000000)); // 0
		System.out.println(solution(a, 5)); // 1
		System.out.println(solution(a, 9)); // 3
		

	}

}


