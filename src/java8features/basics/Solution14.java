package java8features.basics;

class Solution14 {
	public static int solution(int[] A) {
        // write your code in Java SE 8
        for(int i=0;i<A.length;i++) {
			for(int k=0;k<A.length;k++) {
				if(i==k) {}
				else
				{
					for(int j=0;j<A.length;j++) {
						// System.out.println("i : "+i+" j : "+j+" k : "+k);
						if(k==j || k == i || i==j){}
						else {
							//System.out.println("A[i] :"+A[i]);
							//System.out.println("A[j] :"+A[j]);
							//System.out.println("A[k] :"+A[k]);
							if(((A[i]+A[j])>A[k]) && ((A[j]+A[k])>A[i]) && ((A[k]+A[i])>A[j])){
								return 1;
							}
						}
					}
				}
			}
		}
        return 0;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[]{10, 50, 5, 1}));
		System.out.println(solution(new int[]{10, 2, 5, 1, 8, 20}));
	}
}
