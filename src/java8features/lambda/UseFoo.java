package java8features.lambda;

public class UseFoo {
	
	@FunctionalInterface
	public interface Foo {
	    String method(String string);
	}
	
	public String add(String string, Foo foo) {
	    return foo.method(string);
	}

	public static void main(String[] args) {
		Foo foo = parameter -> parameter + " from lambda";
		UseFoo useFoo = new UseFoo();
		String result = useFoo.add("Message ", foo);
		System.out.println(result);
	}
}
