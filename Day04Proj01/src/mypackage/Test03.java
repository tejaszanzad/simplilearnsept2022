package mypackage;

class Demo {
	static double Sum(double num1, double num2) {
		double res = num1 + num2;
		return res;
	}
}

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Demo.Sum(12.56,29.98);
		System.out.println("Sum:"+x);
		
	}

}
