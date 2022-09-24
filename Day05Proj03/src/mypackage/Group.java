package mypackage;

import java.util.*;

class Employee {
	//instance variable
	int id;
	String name;
	
	//to store variables
	Employee(int i, String n) {
		id =i;
		name=n;
	}
	
	//method to display data
	void displayData() {
		System.out.println(id+"\t"+name);
	}
}

public class Group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accepting data from keyboard
		Scanner sc = new Scanner(System.in);
		
		//creating Employee array of size 3
		Employee[] arr = new Employee[3];
		
		//store 3 Employee Details into array
		for(int i=0; i<3; i++) {
			System.out.println("Enter Employee ID");
			 int id = sc.nextInt();
			 
			 System.out.println("Enter Employee Name");
			 String name = sc.next();
			 
			 arr[i] = new Employee(id,name);
		}
			 
			 System.out.println("\n The Employee Data IS ");
			 //displaying the Employee Data
			 for(int i=0; i<3; i++) {
				 arr[i].displayData();
			 }
			
	}

}
