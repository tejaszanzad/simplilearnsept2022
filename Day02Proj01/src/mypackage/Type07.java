package mypackage;

public class Type07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5 ,y=10, z=15;
		
		if(!(x<y && x>z)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

		System.out.println(!(x<y && x>z));
	}

}
