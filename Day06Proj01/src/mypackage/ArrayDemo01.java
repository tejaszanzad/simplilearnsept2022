package mypackage;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 40;
		a[2] = 90;
		a[3] = 20;
		a[4] = 60;
		int n = a.length;
		System.out.println("Printing Array Elements Using For Loop");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPrinting Elements Greater Than 50");
		for(int i=0; i<n; i++) {
			if(a[i]>50) {
				System.out.print(a[i]+" ");
		} 
			
		}
	}

}
