package randomchecks;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



public class BlQue 
{
	static BlockingQueue<String> bq = new LinkedBlockingQueue<String>();
	
	static List<String> lst = new ArrayList<String>();
	static Hashtable<String,String> ht = new Hashtable<String,String>();
	static Vector<String> vt = new Vector<String>();
	
	public static void main(String[] args) throws Exception 
	{
		Thread td = new Thread(() ->{System.out.println("Testing"); try {
			Thread.sleep(12000);
			bq.add("ab");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}});
		td.start();
		try 
		{
			System.out.println("Hello");
			bq.take();
			System.out.println("Done");
			//throw new Exception();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
