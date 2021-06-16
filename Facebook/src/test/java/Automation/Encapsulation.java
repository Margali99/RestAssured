package Automation;

public class Encapsulation {

	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id<=0) {
			System.out.println("Invalid id");
			System.exit(1);
		}
		else {
			this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private String name;
	private double salary;
	
	public static void main(String[] args) {
		
		Encapsulation ec = new Encapsulation();
		ec.setId(1111);
		ec.setName("Srikrishna");
		ec.setSalary(9999.99);
		
		System.out.println(ec.getId());
		System.out.println(ec.getName());
		System.out.println(ec.getSalary());
	

	}

}
