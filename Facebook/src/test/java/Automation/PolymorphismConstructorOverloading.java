package Automation;

public class PolymorphismConstructorOverloading {
	
	//Constructor overloading
	int index;
	
	public PolymorphismConstructorOverloading() {
		index=0;
	}
	
	public PolymorphismConstructorOverloading(int index) {
		this.index=index;
	}
	
	public void display() {
		System.out.println("Index is "+index);
	}

	public static void main(String[] args) {
	
		PolymorphismConstructorOverloading pm = new PolymorphismConstructorOverloading();
		pm.display();
		
		
		

	}

}
