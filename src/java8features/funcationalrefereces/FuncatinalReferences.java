package java8features.funcationalrefereces;


@FunctionalInterface
interface Hello{
	void howAreYou();
}

public class FuncatinalReferences {
	
	public static void yo() {
		System.out.println("Yo YO......");
	}
	
	public static void main(String[] args) {
		Hello hl = FuncatinalReferences::yo;
		hl.howAreYou();
	}
//Method Reference is way of dealing with statelessness
}
