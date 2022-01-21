package java8features.lambda;

import java.util.Optional;
import java.util.Random;
import java.util.Vector;
import java.util.stream.Collectors;

public class StringArrayInVectorStream {

	public static void main(String[] args) {
		Vector<String[]> v = new Vector<>();
		for(int i=0;i<100;i++) {
			v.add(givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect());
		}
		  System.out.println("******************");
		//v.stream().map(x->x[1]).forEach(System.out::println);
		 // System.out.println(v.stream().map(x->x[1]).findFirst().get());
		  System.out.println(v.stream().map(x->x[1]).anyMatch("b"::equals));
		  
	}
	
	public static String[] givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {
		String[] st = new String[5];
		for(int i=0;i<5;i++) {
		    int leftLimit = 97; // letter 'a'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 10;
		    Random random = new Random();
	
		    String generatedString = random.ints(leftLimit, rightLimit + 1)
		      .limit(targetStringLength)
		      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		      .toString();
		    st[i] = generatedString;
		    System.out.println(generatedString);
		}
		 System.out.println("Done");
		return st;
	}
}
