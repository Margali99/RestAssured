package Automation;

public class InstanceMethod {
	
	public void m1() {
		System.out.println("m1");
	}

	public static void main(String[] args) {
		
		InstanceMethod im = new InstanceMethod();
		im.m1();

	}

}
