package mypackage;

public class Employee {
	int empno;
	String empname;
	double salary;
	String designation; 

	public Employee(int empno, String empname, double salary, String designation) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEmpname() {
		return empname;
	}

	public double getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + this.getEmpno() + ", empname=" + this.getEmpname() + ", salary=" + this.getSalary() + ", designation="
				+ this.getDesignation() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(176,"Tejas Zanzad",50000,"Full Stack Developer");
		System.out.println(emp.toString());

	}

}
