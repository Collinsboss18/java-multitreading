package extentingThread;

public class Demo {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.start();

		MyClass myClass1 = new MyClass();
		myClass1.start();
		
	}

}
