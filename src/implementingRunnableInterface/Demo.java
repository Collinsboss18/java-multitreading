package implementingRunnableInterface;

class MyClass implements Runnable {

	public void run() {
		for (int i=0; i<10; i++) System.out.println(Thread.currentThread().getId()+" Value "+i);
		
		// To make thread run concurrently
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class Demo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass());
		Thread t2 = new Thread(new MyClass());
		t1.start();
		t2.start();

	}

}
