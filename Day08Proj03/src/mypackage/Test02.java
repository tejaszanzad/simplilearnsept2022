package mypackage;

import java.io.*;

//let the class extends thread
class MyThread1 extends Thread {
	  boolean stop =false;
	//write the run method inside the class
	 public void run() {
		 for(int i=0; i<=1000000; i++) {
			 System.out.println(i);
			 if(stop)
				 return;
		 }
		 
	 }
}

public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Creating the MyThread class object
		MyThread1 obj = new MyThread1();
		
		//Creating The Thread Class Object And Attach It To Object Of MyThread class
        Thread t = new Thread(obj);
        
        //now run the thread on the object
        t.start();//this will execute code inside run method
        
        //stops the thread when enter key is pressed
        System.in.read();
        obj.stop=true;
       
	}

}