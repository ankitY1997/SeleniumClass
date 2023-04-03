package com.inetbanking.utills;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataReadExcel {
	
	
	@DataProvider(name="login data")
	public  Object[] [] getData() throws IOException
	{
		File file=new File("./DataFile/data.xlsx");
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
	@DataProvider(name="inputdata")
	public  Object[] [] getInputData() throws IOException
	{
		File file=new File("./DataFile/Data2.xlsx");
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


	/*@Test(dataProvider = "inputdata")
	public void data(HashMap map)
	{
		String name=map.get("input1").toString();
		String name1=map.get("input2").toString();
		System.out.println(name);
		System.out.println(name1);

	}*/

	

}
