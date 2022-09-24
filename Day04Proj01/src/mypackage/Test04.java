package mypackage;

class Person {
	//instance variable
	private String name;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		//store some data into the object
		p1.setName("Roy");
		p1.setAge(25);
		//access data from object
		System.out.println("Name :"+p1.getName());
		System.out.println("Age :"+p1.getAge());

	}

}
