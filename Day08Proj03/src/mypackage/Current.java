package mypackage;

public class Current {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let us find current thread");
		Thread t = Thread.currentThread();
		System.out.println("Current Thread :"+t);
		System.out.println("Its Name :"+t.getName());
		
	}

}
