package mypackage;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Hyderabad");
		city.add("Bengaluru");
		city.add("Delhi");
		city.add("New York");
		System.out.println(city);
		city.add(2,"Mysore");
		System.out.println(city);
		city.remove("New York");
		System.out.println(city);
		
	}

}
