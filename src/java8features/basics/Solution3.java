package java8features.basics;

class Solution3 {
    public static int solution(int N) {
       
    	System.out.println(Integer.toBinaryString(Integer.valueOf(N)));
    	char[] C = Integer.toBinaryString(Integer.valueOf(N)).toCharArray();
    	int count = 0;
    	boolean countStart = false;
    	int soFarHighest = 0;
    	for(int i=C.length -1; i<C.length;i--) {
    		if(C[i] == '1' && !countStart) {
    			countStart = true;
    			continue;
    		}
    		if(countStart && C[i] == '0') {
    			count++;
    			continue;
    		}
    		if(countStart && C[i] == '1') {
    			if(count>0) {
    				if(soFarHighest < count) {
    					soFarHighest = count;
    				}
    				count = 0;
    			}
    		}
    	}
    	return soFarHighest;
    	
    }
    public static void main(String[] args) {
    	System.out.println(solution(25));
	}
}
		