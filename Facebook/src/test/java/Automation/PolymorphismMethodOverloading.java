package Automation;

public class PolymorphismMethodOverloading {
	
	public void display() {
		System.out.println("Hello...");
	}
	
	public void display(String FirstName) {
		System.out.println("Hello..."+FirstName);
	}
	
	public void display(String FirstName, String LastName) {
		System.out.println("Hello..."+FirstName+" "+LastName);
	
	}
	public static void main(String[] args) {
		
		PolymorphismMethodOverloading pm = new PolymorphismMethodOverloading();
		
		pm.display();
		pm.display("Srikrishna");
		pm.display("Srikrishna","Adusumilli");
		


}
}
