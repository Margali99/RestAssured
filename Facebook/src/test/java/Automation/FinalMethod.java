package Automation;

public class FinalMethod {

	public final void m1() {
		System.out.println("m1");
	}
	
	
	public static void main(String[] args) {
		
		FinalMethod fm = new FinalMethod();
		fm.m1();
		//final method is used for polymorphism
		

	}

}
