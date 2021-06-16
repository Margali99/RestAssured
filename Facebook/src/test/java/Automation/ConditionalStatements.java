package Automation;

public class ConditionalStatements {

	public static void main(String[] args) {

		
		String filename = "TestData.xlsx";

//		// if
//		if (filename.endsWith("xlsx")) {
//
//			System.out.println("Processing...");
//		}

//		// if else
//		if (filename.endsWith("xlsx")) {
//
//			System.out.println("Processing...");
//		}
//		else {
//			System.out.println("Process only xlsx files");
//		}

		
		//if elseif
		
//		int statuscode =101;
//		
//		if((statuscode>=100) & (statuscode<=199)){
//			System.out.println("Informational");
//		}
//		
//		else if((statuscode>=200) & (statuscode<=299)){
//			System.out.println("Success");
//		}
//		
//		else if((statuscode>=300) & (statuscode<=399)){
//			System.out.println("Redirection");
//		}
//		
//		else if((statuscode>=400) & (statuscode<=499)) {
//			System.out.println("Client error");
//		}
//		
//		else {
//			System.out.println("Server error");
//		}
		
		//switch
		
		int statuscode = 100;
		
		switch(statuscode) {
			
		case 100:
			System.out.println("Redirection");
			break;
			
		case 200:
			System.out.println("Ok");
			break;
			
		case 300:
			System.out.println("Multiple choice");
			break;
			
		case 400:
			System.out.println("Client error");
			break;
			
		case 500:
			System.out.println("Server error");
			break;
			
		default:
			System.out.println("Invalid status code");
			break;
		}
	
	}
		
	}

