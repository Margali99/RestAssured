package Automation;

public class PolymorphismMethodOverriding {
	
	int id;
	String name;
	
	public PolymorphismMethodOverriding(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		
		return id+"_"+name;
		
	}

	public static void main(String[] args) {
	
		PolymorphismMethodOverriding pm = new PolymorphismMethodOverriding(1111,"Srikrishna");
		
		System.out.println(pm.toString());
		

	}

}
