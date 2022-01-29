package java8features.basics;

import java.io.BufferedReader;
import java.io.FileReader;

public class SignedUnSigned {
	
	public static void main(String[] args) {
		Integer unsigned = Integer.parseUnsignedInt("3000000000");
		System.out.println("Unsigned Value is "+unsigned);
		Integer result = Integer.divideUnsigned(unsigned, 2);
		System.out.println("The result is "+result);
		char[] c = new char[]{'a','b'};
		System.out.println(c);
		String s= new String(c);
		System.out.println(s);
		System.out.println(addValues(1,2,3));
	}
	
	
	private static int addValues(int... values) {
		int result = 0;
		for(int i:values) {
			result+=i;
		}
		return result;
	}
	
	private static void addValues1() {
		try(FileReader reader = new FileReader("");
			BufferedReader br = new BufferedReader(reader)){
			String text = br.readLine();
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
