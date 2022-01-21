package java8features.basics;

import java.util.HashMap;
import java.util.Map;

public final class RamImmutable {
	
	private String firstName;
	private String lastName;
	
	private Map<String, String> detail = new HashMap<>();

	public RamImmutable(String firstName, String lastName, Map<String, String> detail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.detail = detail;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Map<String, String> getDetail() {
		return new HashMap<String, String>(this.detail);
	}
	
	@Override
	public String toString() {
		return "RamImmutable [firstName=" + firstName + ", lastName=" + lastName + ", detail=" + detail + "]";
	}

}
