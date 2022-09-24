package mypackage;

import java.util.*;

class Student {
	int n;
	int[] marks;

    public void getMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Subjects");
		n = sc.nextInt();
		marks = new int[n];
		for(int i=0; i<n; i++) {
		System.out.println("Enter Subject "+(i+1)+" Marks");
		marks[i] = sc.nextInt();
		}
	}
	public void displayMarks() {
		System.out.println("Printing Subjects Marks");
		for(int m: marks) {
			System.out.println(m);
		}
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student obj = new Student();
        obj.getMarks();
        obj.displayMarks();
	}

}
