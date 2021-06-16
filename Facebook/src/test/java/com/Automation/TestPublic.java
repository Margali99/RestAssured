package com.Automation;

import Automation.TestProtected;

public class TestPublic extends TestProtected{
	
	public void m4() {
		System.out.println("m4");
	}

	public static void main(String[] args) {
		
		TestPublic tpb = new TestPublic();
		tpb.m4();
		
	
		tpb.m3();
		
		

	}

}
