package mypackage;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vector");
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(15);
		vec.add(30);
		vec.add(45);
		System.out.println(vec);
		vec.add(1,20);
		System.out.println(vec);
		vec.remove(2);
		System.out.println(vec);
	}

}
