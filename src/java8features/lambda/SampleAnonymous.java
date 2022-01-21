package java8features.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SampleAnonymous {
	
	private static final String s = "Hellos Hellos";
	
	private static final List<String> lst = new ArrayList<String>() {{
		add("XZ13s");
		add("AB21/X");
		add("YYLEX");
		add("AR2D");
		}};

	public static void main(String[] args) {
		//String s = "Hello Hello";
		Foo f = new Foo() {
			 @Override 
			 public void add()
	         {
	                // printing  age
				 System.out.println("Hi ");
				 System.out.println(s);
	         }
		};
		f.add();
		
		MySam my = new MySam() {
			@Override 
			 public void add()
	         {
	                // printing  age
				 System.out.println("He He");
	         }
		};
		my.add();
		
		MySam mew = new MySam();
		mew.add();
		
		Runnable rb = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hellow Thread");
				
			}
		};
		Thread td = new Thread(rb);
		td.start();
		try {
			synchronized (td) {
				System.out.println("Hi HI HI");
				td.wait();	
				System.out.println("Bye Bye");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int k=0;k<1000000000; k++) {
			System.out.println(td.isAlive()?"Alive":"Dead");
			if(td.isAlive()) 
			{
				System.out.println(td.isAlive()?"Alive1":"Dead1");
				continue;
			}
			else 
			{
				System.out.println(td.isAlive()?"Alive2":"Dead2");
				break;
			}
			
		}
		System.out.println(lst.size());
		for(String str: lst) 
		{
			System.out.println(str);
		}
		
		Thread tda = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("One shot code");
				
			}
			
			
		});
		tda.start();
		
	}
	
	/*
	 * List<Map> lists = new ArrayList<Map>();
	 * 
	 * //lists.stream().map(map1 -> map1).collect(Collectors.toList());
	 * lists.stream().map(map1 -> map1).collect(Collectors.toList());
	 * 
	 * Map update(Map map) throws Exception { return map; //throw new Exception(); }
	 */
	
	// The whole concept is code nchabacikihayidan
	//Clasula lolli
}
