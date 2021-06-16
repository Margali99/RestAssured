package com.Automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class ReadExcel {

	public static void main(String[] args) throws Exception{


		File file = new File("D:\\RestAssured\\RestAssured_excel\\Book.xlsx");

		FileInputStream inputstream = new FileInputStream(file); //to read
		
		Workbook workbook= WorkbookFactory.create(inputstream); // to open
		
		
		System.out.println("No.of Sheets : " + workbook.getNumberOfSheets());
		
		Sheet sheet =workbook.getSheet("sheet1");
		
		System.out.println("No.of rows : "+ sheet.getPhysicalNumberOfRows());
		System.out.println("First row number is :" + sheet.getFirstRowNum());
		System.out.println("Last row number is :" + sheet.getLastRowNum());
		
		
		Row row = sheet.getRow(0);
		
		System.out.println("No.of columns : " + row.getPhysicalNumberOfCells());
		System.out.println("First Cell Number :" + row.getFirstCellNum());
		System.out.println("Last Cell Number :" + row.getLastCellNum());
		
		
		//print rows and cells
		
//		System.out.println(sheet.getRow(0).getCell(0));
//		System.out.println(sheet.getRow(0).getCell(1));
//		System.out.println(sheet.getRow(0).getCell(2));
//		System.out.println(sheet.getRow(0).getCell(3));
//		System.out.println(sheet.getRow(0).getCell(4));
		
		
		//for dynamic values
		
//		for(int rowIndex=0; rowIndex<=3; rowIndex++) {
//			for(int colIndex=0; colIndex<5; colIndex++) {
//				
//				System.out.println(sheet.getRow(rowIndex).getCell(colIndex) + "\t");
//			}
//			
//			System.out.println();
//		}
		
		//for more dynamic values
		
		for(int rowIndex=0; rowIndex<= sheet.getLastRowNum(); rowIndex++) {
			for(int colIndex=0; colIndex<sheet.getRow(rowIndex).getLastCellNum();colIndex++) {
				System.out.println(sheet.getRow(rowIndex).getCell(colIndex)+ "\t");
			}
			
			System.out.println("\n");
		}
		
		
		
		
		
	}

}
