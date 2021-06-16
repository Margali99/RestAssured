package Automation;

public class Test {
	
	int id;
	String name;
	double salary;
	
	//zero argument constructor
	
	public Test() {
		
	}

	//initialization constructor
	
	public Test(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		//default constructor
//		Test t1 = new Test();
		
		
		//parameterized constructor
		Test t1 = new Test(1111,"Srikrishna",9999.99);
		
	}

}
