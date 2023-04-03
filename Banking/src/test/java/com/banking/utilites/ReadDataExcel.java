package com.banking.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadDataExcel {
	
	@DataProvider(name="login data")
public static Object[] [] getData() throws IOException
{
	File file=new File("./DataFile/ExcelFile.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheetAt(0);
	
	int rownum=sheet.getLastRowNum();
	int columnnum=sheet.getRow(0).getLastCellNum();
	
	Object[] [] obj=new Object[rownum][1];
	
	for(int i=0;i<rownum;i++)
	{
		HashMap<Object,Object>data=new HashMap<Object,Object>();
		for(int j=0;j<columnnum;j++)
		{
			
			data.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i+1).getCell(j).toString());
			
			
		}
		
		obj[i][0]=data;
		
	}
		
	return obj;
	
}



}
