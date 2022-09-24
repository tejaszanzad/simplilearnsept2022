package mypackage;

//let the class extends thread
class MyThread extends Thread {
	//write the run method inside the class
	 public void run() {
		 for(int i=0; i<=100; i++) {
			 System.out.println(i);
		 }
		 
	 }
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the MyThread class object
		MyThread obj = new MyThread();
		
		//Creating The Thread Class Object And Attach It To Object Of MyThread class
        Thread t = new Thread(obj);
        
        //now run the thread on the object
        t.start();//this will execute code inside run method

	}

}
