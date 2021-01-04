package joinAndSynchronizedMethod;

public class Demo {
	private static int count = 0;
	
	// synchronized Keyword: makes it so that one thread can call the function at a time
	public static synchronized void inccount() {
		count++;
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run () {
				for (int i=0;i<10000;i++) inccount();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run () {
				for (int i=0;i<10000;i++) inccount();
			}
		});
		
		t1.start();
		t2.start();
		
		// Java join method can be use to pause the current tread execution until the specified thread is dead
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Value "+count);
		

	}
}
