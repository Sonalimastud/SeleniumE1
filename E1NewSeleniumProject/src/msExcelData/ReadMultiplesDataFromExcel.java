package msExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultiplesDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i = 0; i <= 10 ; i++)
		{
		FileInputStream fls = new FileInputStream("./data/testData.xlsx"); //Provide the path of the file
		Workbook wb = WorkbookFactory.create(fls); // to make the file ready to read
		Sheet sheet = wb.getSheet("ipl"); // to get into the sheet
		Row row = sheet.getRow(i); // To get into the row
		Cell cell = row.getCell(0); // To get into the cell
		String data = cell.getStringCellValue(); // To read the data from the cell
		System.out.println(data);
		}

	}

}
