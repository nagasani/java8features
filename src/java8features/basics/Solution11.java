package java8features.basics;
	
import java.util.HashMap;
import java.util.Map;


class Solution11 {
	 
	public static int solution( int[] A) {
	
		int count = 0;
		for(int a=0; a<A.length-1;a++) {
			if (A[a]==1)
			{
				continue;
			}
			for(int b=0; b<A.length; b++) {
				if (A[b]==0)
				{
					continue;
				}
				if( a<b && A[a]==0 && A[b]==1) {
					System.out.println(a+" : "+b);
					count++;
				}
				if(count > 1000000000) {
					return -1;
				}
			}
		}
		return count;
 	}
	
	public static void main(String[] args) {
		//int[] A = new int[] {1, 3, 1, 4, 2, 3, 5, 4};	
		int[] A = new int[] {0,1,0,1,1};
		System.out.println(solution(A));
	}
}