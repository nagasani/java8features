package java8features.basics;

import java.util.HashMap;
import java.util.Map;

public class ImmutableCheck {
	
	public static void main(String[] args) {
		Map<String, String> detail1 = new HashMap<>(); 
		detail1.put("Height", "5 Feet 9 Inches");
		RamImmutable ram = new RamImmutable("Rama", "Nagasani", detail1);
		System.out.println(ram);
		ram.getDetail().put("Height", "I don't know");
		System.out.println(ram);
	}
	
}
