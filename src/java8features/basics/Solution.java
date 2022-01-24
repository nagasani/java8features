package java8features.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;	
import java.util.stream.Collectors;

class Solution {
    public static int solution(int[] A) {
       
    	List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
    	Collections.sort(list);
    	
    	if(list.get(list.size()-1) < 1) {
    		return 1;
    	}
    	boolean found =false;
    	for(int i=1; i< list.get(list.size()-1);i++) {
    		if(!list.contains(i)) {
    			found = true;
    			return i;
    		}
    	}
    	if(!found) {
    		return list.get(list.size()-1)+1;
    	}
    	return 1;
    	
    }
    public static void main(String[] args) {
    	int[] A = new int[] {1, 3, 6, 4, 1, 2,0};
    	System.out.println(solution(A));
	}
}
		