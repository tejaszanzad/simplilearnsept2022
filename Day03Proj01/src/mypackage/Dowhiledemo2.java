package mypackage;

import java.util.*;
public class Dowhiledemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		do {
			System.out.println("What is 2+2");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			if(i==4) 
		    break;
			}while(true);
		
            System.out.println("Yes 2+2=4");
            
	}

}
