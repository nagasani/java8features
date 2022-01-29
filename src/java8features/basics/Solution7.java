package java8features.basics;

import java.util.HashSet;
import java.util.Set;

class Solution7 {
	 
	public static int solution( int[] A) {
		Set<Integer> s = new HashSet<>();
		for(int a: A) {
			s.add(a);
		}
		if(s.size() != A.length) {
			return -1;
		}
		else {
			for(int i=1; i<s.size()+1;i++) {
				if(!s.contains(i)) {
					return -1;
				}
			}
			return 1;
		}
 	}
	
	public static void main(String[] args) {
		//int[] A = new int[] {1, 3, 1, 4, 2, 3, 5, 4};	
		int[] A = new int[] {2, 2, 2, 2, 2};
		System.out.println(solution(A));
	}
}