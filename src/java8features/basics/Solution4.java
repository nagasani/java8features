package java8features.basics;

import java.util.Arrays;

import java.util.List;	
import java.util.stream.Collectors;

class Solution4 {
    public static int[] solution(int[] A, int N) {
       
    	List<Integer> l =  Arrays.stream(A).boxed().collect(Collectors.toList());
    	for(int i=0; i<N; i++) {
    		l.add(0,l.get(l.size()-1));
    		l.remove(l.size()-1);
    	}
    	int[] intArray = new int[l.size()];
    	for(int k=0; k < l.size();k++) {
    		intArray[k]=l.get(k);
    	}
        return intArray;
    	
    }
    public static void main(String[] args) {
    	int[] A = new int[] {1, 3, 6, 4, 1, 2,0};
    	System.out.println(solution(A,5));
	}
}
		