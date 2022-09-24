package mypackage;

class PrivateAccessSpecifier {
	private void display() {
		System.out.println("You are using Private Access Specifier");
	}
}

public class AccessSpecifiers02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Private Access Specifiers");
		PrivateAccessSpecifier obj = new PrivateAccessSpecifier();
		//trying to access private method of another class
		//obj.display();		

	}

}
