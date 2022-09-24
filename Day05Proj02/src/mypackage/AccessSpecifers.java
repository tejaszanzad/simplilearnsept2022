package mypackage;

class DefaultAccessSpecifier {
	void display() {
		System.out.println("You are using Default Access Specifiers");
	}
}

public class AccessSpecifers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default Access Specifier");
		DefaultAccessSpecifier obj = new DefaultAccessSpecifier();
		obj.display();

	}

}
