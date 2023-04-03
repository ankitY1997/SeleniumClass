package com.inetbanking.utills;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	
	
	public static void main(String[] args) throws IOException {
		
		isFileContainsSpecificColumnDataForGrid("Service ID","00128623");	
		}
	
	
public static boolean isFileContainsSpecificColumnDataForGrid(String headerName,String data) throws IOException {
    	
	FileInputStream fis = new FileInputStream(downloadPath + File.separator + fileName);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	int lastRowNum = sheet.getLastRowNum();
	int lastColumnNum = sheet.getRow(0).getLastCellNum();
	int headerIndex = 0;
	boolean flag = false;
	boolean headerFound = false;
	for (int i = 0; i < lastColumnNum; i++) {
		String headerValue = sheet.getRow(0).getCell(i).getStringCellValue();
		if (headerValue.equals(headerName)) {
			headerIndex = i;
			headerFound = true;
			break;
		} else if (headerValue == null) {
			break;
		}
	}
	if (headerFound) {
		for (int j = 1; j < lastRowNum; j++) {
			try {
				String cellValue = sheet.getRow(j).getCell(headerIndex).getStringCellValue();
				if (cellValue.equals(data)) {
					flag = true;
					break;
				} else if (cellValue == null) {
					break;
				}
			}
			catch (Exception e) {
				Double cellValue = sheet.getRow(j).getCell(headerIndex).getNumericCellValue();
				String strValue = cellValue.toString();
				String newValue = "";
				for (int i = 0; i < strValue.length(); i++){
					char c = strValue.charAt(i);
					if (c != 46) {
						newValue = newValue + c;
					}
					if (newValue.toString().equals(data)) {
						flag = true;
						break;
					} else if (cellValue == 0.0) {
						break;
					}
				}
			}
		}
	}
		
	}


}
