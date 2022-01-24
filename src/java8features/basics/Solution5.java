package java8features.basics;

import java.util.Arrays;

class Solution5 {
    public static int solution(int[] A) {
    	if(A.length ==1) {
    		return A[0];
    	}
    	Arrays.sort(A);
    	int last = 1000001;
    	int lastButOne = 1000001;
    	int counter =1;
    	for(int current:A) {
    		if(last==1000001) {
    			last=current;
    		}
    		else if(lastButOne ==1000001) {
    			lastButOne = last;
    			last = current;
    		}
    		else if(last != lastButOne && last != current) {
    			return last;
    		}
    		else if(counter == 3 && lastButOne != last) {
    			return lastButOne;
    		}
    		else if(last != lastButOne && last != current) {
    			return last;
    		}
    		else {
    			if(A.length == counter && last != current) {
        			return current;
        		}
    			lastButOne = last;
    			last = current;
    		}		
    		counter++;
    	}
    	return 0;
    }
    public static void main(String[] args) {
    	int[] A = new int[] {42};
    	System.out.println(solution(A));
	}
}
		