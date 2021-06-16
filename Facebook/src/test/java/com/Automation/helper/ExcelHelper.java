package com.Automation.helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public  class ExcelHelper{
	
	
	
public static Object[][] getTestData(String filename, String sheetname) throws Exception{
		
		Object[][] data = null;
		
		
		// read data from excel and perform post method
		File file = new File(filename);
		FileInputStream inputstream = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(inputstream);
		
		Sheet sheet1 = workbook.getSheet(sheetname);
		
		data = new Object[sheet1.getPhysicalNumberOfRows()-1][sheet1.getRow(0).getPhysicalNumberOfCells()];
		
		for(int rowIndex=sheet1.getFirstRowNum()+1; rowIndex<=sheet1.getLastRowNum();rowIndex++) {
		for(int colIndex=sheet1.getRow(rowIndex).getFirstCellNum(); colIndex<sheet1.getRow(rowIndex).getLastCellNum();colIndex++) {
			
			data[rowIndex-1][colIndex]= sheet1.getRow(rowIndex).getCell(colIndex).toString();
		}
			
		}
		
		workbook.close();
		
		return data;
		
	}
	

}
