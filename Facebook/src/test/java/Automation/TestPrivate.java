package Automation;

public class TestPrivate {
	
	private void m1() {
		System.out.println("m1");
	}

	public static void main(String[] args) {
		
		TestPrivate tp = new TestPrivate();
		tp.m1();
		
		TestDefault td1 = new TestDefault();
		td1.m2();

	}

}
