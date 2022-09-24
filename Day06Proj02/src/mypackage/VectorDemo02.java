package mypackage;

import java.util.*;

public class VectorDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>  v = new Vector<Integer>();
		
		int[] x = {22, 20, 10, 40 ,15, 60};
		
		for(int i=0; i<x.length; i++) {
			v.add(x[i]);
		}
		
		for(int i=0; i<v.size(); i++ ) {
			System.out.println(v.get(i));
		}
	}

}
