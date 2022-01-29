package java8features.basics;

import java.util.ArrayList;
import java.util.List;

class Solution8 {
	 
	public static int solution(int X, int[] A) {
		List<Integer> lst = new ArrayList<>();
		for(int l=0; l < A.length; l++){
			if(A[l] >= X) {
				return l;
			}
			if(!lst.contains(A[l])) {lst.add(A[l]);}
			if(lst.size()==X) {
				return l;
			}
		}
		return -1; 
	}
	
	public static void main(String[] args) {
		//int[] A = new int[] {1, 3, 1, 4, 2, 3, 5, 4};	
		int[] A = new int[] {2, 2, 2, 2, 2};
		System.out.println(solution(2,A));
	}
}