package com.CRM.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileGenericLibrary {

	public String readDataFromPropertyFile(String filePath, String key) throws FileNotFoundException, IOException {

		Properties propObj = new Properties();
		propObj.load(new FileInputStream(filePath));
		return propObj.getProperty(key, "Properties File :Incorrect Key");

	}

	public String ReadDataFromExcel(String filePath, String sheetName, int rowValue, int cellValue) throws Throwable {
		FileInputStream fisObj = new FileInputStream(filePath);
		Workbook wBook = WorkbookFactory.create(fisObj);
		Sheet sheet = wBook.getSheet(sheetName);
		return sheet.getRow(rowValue).getCell(cellValue).getStringCellValue();
	}

	public void WriteDataFromExcel(String filePath, String sheetName, int rowValue, int cel, String cellVal)
			throws Throwable {
		FileInputStream iStream = new FileInputStream(filePath);
		Workbook wBook = WorkbookFactory.create(iStream);
		wBook.getSheet(sheetName).getRow(rowValue).createCell(cel).setCellValue(cellVal);

		FileOutputStream fos = new FileOutputStream(filePath);
		wBook.write(fos);
	}

}
