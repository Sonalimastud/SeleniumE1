package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	// this class is used to store all the reusable methods
	// all non static method
	
	// this method is used to read the data from the excel file
	
	public String readExcelData(String excelPath,String sheetName, int rowNo, int cellNo ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); // to provide the path of the excel file
		Workbook wb = WorkbookFactory.create(fis); // to make the file ready to read
	    Sheet sheet = wb.getSheet(sheetName); // to get into the desired sheet
	    Row row = sheet.getRow(rowNo); // to get into desired row
	    Cell cell = row.getCell(cellNo); // to get into desired cell
	    String usnData = cell.getStringCellValue(); // t read the data from the cell
		return usnData;
	}

	// this method is udes to the get the number of row from particular sheet
	public int getRowCount(String excelpath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath); // to provide the path of the excel file
		Workbook wb = WorkbookFactory.create(fis); // to make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); // to get into the desired sheet
		int rc = sheet.getLastRowNum(); // to get the number of the row from the sheet
		return rc;
	}
	
	// the method is used to write the data into excel sheet
	public void wrietExcelData(String excelPath, String sheetName, int rowNo, int cellNo, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); // to provide the path of the excel file
		Workbook wb = WorkbookFactory.create(fis); // to make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); // to get into the desired sheet
		Row row = sheet.getRow(rowNo); // to get the number of the row from the sheet
		Cell cell = row.getCell(cellNo); // to get the desired cell
		cell.setCellValue(data); // to pass the string data to the desired cell
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
}

