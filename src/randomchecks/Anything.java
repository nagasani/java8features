package randomchecks;

public class Anything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "A";
		int totalVal = 0;
		for(int i=0; i < st.length(); i++) {
			totalVal += (st.charAt(i));//'- 'A'+1);
			System.out.println(totalVal);
		}
		System.out.println(totalVal);
	}
}
