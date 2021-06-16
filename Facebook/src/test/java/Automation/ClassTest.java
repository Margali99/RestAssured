package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ClassTest extends Implement{
	
	
	//final keyword - to have fixed variable values
	 final double PI = 3.14;
	 
	 
	 //final keyword - to prevent method overriding 
	 public void m5() {
		 System.out.println("m5");
	 }

	public static void main(String[] args) {
		
		
		ClassTest ct = new ClassTest();
		
		ct.m1();
		ct.m2();
		ct.m3();
		
		A a = new B();
		a.m1();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		System.out.println(e.toString());
		}
		
		
		File file = new File("D://TestData.xlsx");
		try {
			FileInputStream ip = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			System.out.println(e1.toString());
		}
		
		
		
		
		try {
			int val = 100/0;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		finally {
			System.out.println("finally");
		}
		
		
		try {
		int[] empid = new int[10];
		System.out.println(empid[19]);
		}
		catch(ArrayIndexOutOfBoundsException aoe) {
		System.out.println(aoe.toString());
		}
		
		System.out.println("End");
	

	}

}
