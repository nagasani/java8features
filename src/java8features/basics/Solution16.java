package java8features.basics;


class Solution16 {
	 public static int solution(String E, String L) {
		 
		 System.out.println(E.substring(0,2));
		 System.out.println(E.substring(3,5));
		 
		 int start = Integer.parseInt(E.substring(0,2))*60+Integer.parseInt(E.substring(3,5));
		 int end = Integer.parseInt(L.substring(0,2))*60+Integer.parseInt(L.substring(3,5));
		 
		 int stayHours = (end-start)/60;
		 int stayMins = (end-start)%60;
		 
		 int billHours = stayHours+(stayMins > 0 ? 1:0);
		 
		 int fee = 5+((billHours-1)*4);
		
		 return fee;
    	
    }
    public static void main(String[] args) {
    	int[] A = new int[] {1, 3, 6, 4, 1, 2,0};
    	System.out.println(solution("10:10","13:21"));
	}
}
		