package java8features.lambda;

public class LetsCheck {
	
	public static void main(String[] args) {
		
		Hello sum = (a,b) -> a+b;
		
		System.out.println("Sum is :"+ performOpertion(10, 20, sum));
		
		String m="hello";
		Hello1 hello = () -> m;
		System.out.println(hello.operation());
		
	}
	
	public static int performOpertion(int a, int b, Hello hl) {
		
		return hl.operation(a, b);
	}
	
	@FunctionalInterface
	interface Hello{
		int operation(int x, int y);
	}
	
	@FunctionalInterface
	interface Hello1{
		String operation();
	}

}
