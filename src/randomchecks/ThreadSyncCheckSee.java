package randomchecks;

public class ThreadSyncCheckSee {
	
	public int i = 0;
	
	public synchronized void hello1() throws InterruptedException {
		System.out.println("Hello1");
		for(int j= 0;  j < 1000000000; j++) {
			i++;
		}
		System.out.println(i);
		Thread.sleep(30000);
	}
	
	public synchronized void hello2() throws InterruptedException {
		System.out.println("Hello2");
		for(int j= 0;  j < 1000000000; j++) {
			i++;
		}
		System.out.println(i);
		Thread.sleep(30000);
	}

}
