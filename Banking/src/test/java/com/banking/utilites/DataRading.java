package com.banking.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class DataRading 
{

	
	public static String [][] getExcelValue() throws IOException {
		
		File file=new File("./DataFile/ExcelFile.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet  sheet=workbook.getSheetAt(0);
		
		int rownum=sheet.getLastRowNum();
		
		int colnum=sheet.getRow(0).getLastCellNum();
		//this is for column one row has a how many cell indirectly it givens collumn number
		
		String [][]logindata=new String[rownum][colnum] ;
		         
		    
		
		
		for(int i=1;i<=rownum;i++)
		{
			XSSFRow row=sheet.getRow(i);
			//this is for knowing row 
			for(int j=0;j<colnum;j++)
			{
				XSSFCell cell=row.getCell(j);
				//here we are using one row and total cell thats why we take row reference
				
			//	System.out.println(cell.getCellType());//get cell type for knowing the data type of value
				//it may be boolean or string ,int 
				DataFormatter data=new DataFormatter();
				
				logindata[i-1] [j]=data.formatCellValue(cell);
				
				String name=logindata[i-1] [j];
				System.out.print(name+" ");
				/*switch(cell.getCellType())
				{
				case STRING :
				System.out.print(cell.getStringCellValue()+" ");
				break;
				case NUMERIC :
			    System.out.print((int)(cell.getNumericCellValue())+" ");
			    break;
				case BOOLEAN :
				System.out.print(cell.getBooleanCellValue()+" ");
				break;
				
				}*/
				
			}
			System.out.println(" ");
			
		}
		
		
		
		//testing login data is it working or not
		
		/*for(int i=0;i<logindata.length;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				String name= logindata[i][j];
				System.out.println(name);
				
				
			}
		}*/
		
		fis.close();
		return logindata;
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		try {
			getExcelValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
