package com.Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception{
		
		File file = new File("D:\\RestAssured\\RestAssured_excel\\Book.xlsx");
		
		FileInputStream inputstream = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(inputstream);
		
		System.out.println("No.of sheets: "+ workbook.getNumberOfSheets());
		
		Sheet sheet1 = workbook.getSheet("Sheet1");
		
		System.out.println("No.of rows: "+ sheet1.getPhysicalNumberOfRows());
		System.out.println("First row number; "+ sheet1.getFirstRowNum());
		System.out.println("Last row number; "+ sheet1.getLastRowNum());
		
		
		Row row1 = sheet1.getRow(0);
		
		System.out.println("No.of cells: "+ row1.getPhysicalNumberOfCells());
		System.out.println("First col number: "+ row1.getFirstCellNum());
		System.out.println("Last col number: "+ row1.getLastCellNum());
		
		for(int rowIndex=0; rowIndex<=sheet1.getLastRowNum(); rowIndex++) {
			for(int colIndex=0; colIndex< sheet1.getRow(rowIndex).getLastCellNum();colIndex++){
				
				System.out.print(sheet1.getRow(rowIndex).getCell(colIndex) + "\t");
			}
			
			System.out.println();
		}

		row1.createCell(5).setCellValue("ExecutionStatus");
		sheet1.getRow(1).createCell(5).setCellValue("Pass");

		workbook.write(new FileOutputStream(file));
		
		workbook.close();		
	}

}
