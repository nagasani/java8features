package java8features.basics;

import java.util.Arrays;

class Solution6 {
    public static int solution(int[] A) {
       
    	if(A.length ==1)return A[0];
    	int p = A.length/2;
    	//System.out.println(p);
    	
    	int[] calc = new int[A.length-1];
    	int pBefore = 1;
    	int pBeforeAgain = 1;
    	for(int i=0; i<p; i++) {
    		pBefore = pBefore+A[i];
    	}
    	pBeforeAgain = pBefore;
    	int pAfter=1;
    	int pAfterAgain=1;
    	for(int i=p; i<A.length; i++) {
    		pAfter = pAfter+A[i];
    	}
    	pAfterAgain=pAfter;
    	calc[p-1]=(pBefore-pAfter) < 0 ? -1*(pBefore-pAfter):pBefore-pAfter;
    	int j =1;
    	for(int i=p-2; i>-1; i--) {
    			calc[i]=(pBefore-A[i+1]-pAfter+A[p-j]) < 0 ? -1*(pBefore-A[i+1]-pAfter+A[p-j]) : (pBefore-A[i+1]-pAfter+A[p-j]);
    			pBefore=pBefore-A[i+1];
    			pAfter=pAfter+A[p-j];
    			j++;
    	}
    	int k=0;
    	for(int i=p; i<A.length-1; i++) {
			calc[i]=(pBeforeAgain+A[i]-pAfterAgain-A[p+k]) < 0 ? -1*(pBeforeAgain+A[i]-pAfterAgain-A[p+k]) : pBeforeAgain+A[i]-pAfterAgain-A[p+k] ;
			pBeforeAgain=pBeforeAgain+A[i];
			pAfterAgain=pAfterAgain-A[p+k];
			k++;
    	}
    	//System.out.println(Arrays.toString(calc));
    	Arrays.sort(calc);
    	return calc[0];
    }
    
    public static void main(String[] args) {
    	int[] A = new int[] {1, 3, 6, 4, 1, 2,8};
    	System.out.println(solution(A));
	}
}
		