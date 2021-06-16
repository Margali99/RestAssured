package Automation;

public class Employeee {
	
	public int id;
	public String name;
	public double salary;
	
	
	//constructor for initialization
	public Employeee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);	
	}
	

	public static void main(String[] args) {
		
		//parameterized constructor
		
		Employeee e1 = new Employeee(1111, "Srikrishna", 99999.99);
		
		e1.display();
		
	}

}
