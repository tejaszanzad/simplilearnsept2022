package mypackage;

abstract class AnonymousInnerClass{
	public abstract void display();
}
public class Outer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass obj = new AnonymousInnerClass() {
			
			public void display() {
				System.out.println("AnonymousInnerClass");
			}
		};
		obj.display();
	}

}
