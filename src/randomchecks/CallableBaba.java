package randomchecks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableBaba {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {});
		
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		};

		task.run();

		Thread thread = new Thread(task);
		thread.start();
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		List<Future> lst = new ArrayList<Future>();
		
		for(int i=0; i< 10; i++) 
		{
			Future<Integer> future = service.submit(new Task());
			lst.add(future);
		}
		
		for(int i=0; i< 10; i++) 
		{
			Future<Integer> future = lst.get(i);
			try 
			{
				Integer result = future.get();
				System.out.println(" result "+i+" : "+result);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Done!");
	}
	
	static class Task implements Callable<Integer>
	{
		@Override
		public Integer call() throws Exception {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName());
			return new Random().nextInt();
		}
		
	}
}
