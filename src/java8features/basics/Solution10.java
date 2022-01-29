package java8features.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution10 {
	 
	public static int solution( int[] A) {
		List<Integer> l = Arrays.stream(A).boxed().filter(x->x>0).sorted().collect(Collectors.toList()); 
		if(l.isEmpty()) {return 1;}
        int maxVal = l.get(l.size()-1);
        int counter=0;
        for(int i=0; i<maxVal;i++) {
        	if(!l.contains(i+1)) {
        		return i+1;
        	}
        	counter++;
        }
        if(counter == maxVal) {return maxVal+1;}
        return 1;
 	}
	
	public static void main(String[] args) {
		//int[] A = new int[] {1, 3, 1, 4, 2, 3, 5, 4};	
		int[] A = new int[] {2, 2, 2, 2, 2};
		System.out.println(solution(A));
	}
}