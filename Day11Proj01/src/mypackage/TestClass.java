package mypackage;

interface First{
	default void show() {
		System.out.println("Default First");
	}
}
interface Second{
	default void show() {
		System.out.println("Default Second");
	}
}

public class TestClass implements First,Second {
    public void show(){
		First.super.show();
		Second.super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass obj = new TestClass();
		obj.show();

	}

}
