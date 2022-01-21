package randomchecks;

public class ThreadSyncCheck {
	
	public static void main(String[] args) {
		
		ThreadSyncCheckSee tcs = new ThreadSyncCheckSee();
		
		Thread t1 = new Thread(()->{try {
			tcs.hello1();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}});
		t1.start();
		System.out.println("T1 Started");
		Thread t2 = new Thread(()->{try {
			tcs.hello2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}});
		t2.start();
		System.out.println("T2 Started");
	}

}
