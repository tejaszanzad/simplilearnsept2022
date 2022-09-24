package mypackage;

import java.util.*;

class Customer {
	int cId;
	String cname, location;
	
	public void getDetails() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Cutomer Id :");
	cId = sc.nextInt();
	System.out.println("Enter Customer Name :");
	cname = sc.next();
	System.out.println("Enter Customer Location :");
	location = sc.next();
	sc.close();
	};
	
	public void setDetails() {
		System.out.println("Printing Customer Details");
		System.out.println("Customer Id :"+cId);
		System.out.println("Customer Name :"+cname);
		System.out.println("Cutomer Location :"+location);
	}		
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cobj = new Customer();
		cobj.getDetails();
		cobj.setDetails();	
	}
}
