package com.Automation;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateAndWriteToExcel {

	public static void main(String[] args) throws Exception{
		
		Workbook workbook = WorkbookFactory.create(true);
		Sheet sheet1 = workbook.createSheet("Sheet1");
		
		Row row = sheet1.createRow(0);
		
		row.createCell(0).setCellValue("TestScript");
		row.createCell(1).setCellValue("FirstName");
		row.createCell(2).setCellValue("LastName");
		
		row = sheet1.createRow(1);
		
		row.createCell(0).setCellValue("TC_001");
		row.createCell(1).setCellValue("Shriram");
		row.createCell(2).setCellValue("Adusu");
		
		row=sheet1.createRow(2);
		row.createCell(0).setCellValue("TC_002");
		row.createCell(1).setCellValue("Shrikrishna");
		row.createCell(2).setCellValue("Ad");
		
		workbook.write(new FileOutputStream(new File("D:\\RestAssured\\RestAssured_excel\\Book1.xlsx")));
		workbook.close();
	}

}
