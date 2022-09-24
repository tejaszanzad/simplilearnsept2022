package mypackage;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Apple");
		al.add("Mango");
		al.add("Grapes");
		al.add("Oranges");
		
	    System.out.println("Contents :"+al);
	    
	    al.remove(2);
	    al.remove("Oranges");
	    
	    System.out.println("Contents After Removing :"+al);
	    
	    System.out.println("Size Of ArrayList :"+al.size());
	    
	    System.out.println("Extracting Elements Using Iterator");
	    
	    Iterator itr = al.iterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	}

}
