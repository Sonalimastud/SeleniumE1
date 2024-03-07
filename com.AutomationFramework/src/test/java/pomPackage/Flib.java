package pomPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readPropertyData(String propPath, String key) throws IOException 
	{
        FileInputStream fis = new FileInputStream(propPath); // to provide the path of the excel file
		Properties prop = new Properties(); // Create the object of Properties class
		prop.load(fis);     // To make the file ready to read
		String data = prop.getProperty(key); // To read/fetch the value assigned to a particular key
		return data;
	}
	
	public String readExcelData(String excelPath, String sheetName, int rowNo, int cellNo ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); // to provide the path of the excel file
		Workbook wb = WorkbookFactory.create(fis); // to make the file ready to read
	    Sheet sheet = wb.getSheet(sheetName); // to get into the desired sheet
	    Row row = sheet.getRow(rowNo); // to get into desired row
	    Cell cell = row.getCell(cellNo); // to get into desired cell
	    String Data = cell.getStringCellValue(); // to read the data from the cell
		return Data;
	}
	
	public void writeExcelData(String excelPath, String sheetName, int rowNum, int cellNum, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); // to provide the path of the excel file
		Workbook wb = WorkbookFactory.create(fis); // to make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); // to get into the desired sheet
		Row row = sheet.getRow(rowNum); // to get into the desired row
		Cell cell = row.getCell(cellNum); // to get into desired cell
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
	
	public int getRowCount(String excelpath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath); // to provide the path of the excel file
		Workbook wb = WorkbookFactory.create(fis); // to make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); // to get into the desired sheet
		int rc = sheet.getLastRowNum(); // to get the number of the row from the sheet
		return rc;
	}

}
