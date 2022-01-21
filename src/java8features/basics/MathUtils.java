package java8features.basics;
public class MathUtils {
    public static double average(int a, int b) {
    	//double d = a + b;
    	double d1=a + b;
        return (d1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(average(2,1));
    }
}
