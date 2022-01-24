package java8features.basics;

class Solution2 {
    public static int solution(int[] A) {
       
    	java.util.HashSet<Integer> h = new java.util.HashSet<>();
    	for(int i=1;i<A.length+2;i++) {
    		h.add(i);
    	}
    	for(int a:A) {
    		h.remove(a);
    	}
    	return h.iterator().next();
    }
    public static void main(String[] args) {
    	int[] A = new int[] {1, 2, 3};
    	System.out.println(solution(A));
	}
}
		