package mypackage;

public class Outer02 {
	
	private String msg = "Hey Folks Welcome To Inner Classess";
	
	void display() {
		class Inner {
			void msg() {
				System.out.println(msg);
			}
		}
		Inner in = new Inner();
		in.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer02 obj = new Outer02();
		obj.display();

	}

}
