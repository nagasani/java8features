package java8features.basics;

import java.util.HashSet;
import java.util.Set;

class Solution12 {
	 
	public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int a = B/K;
        
        int b = A/K;
        
        return a-b;
        
        
    }
	
	public static void main(String[] args) {
		//int[] A = new int[] {1, 3, 1, 4, 2, 3, 5, 4};	
		int[] A = new int[] {2, 2, 2, 2, 2};
		//System.out.println(solution(A));
	}
}