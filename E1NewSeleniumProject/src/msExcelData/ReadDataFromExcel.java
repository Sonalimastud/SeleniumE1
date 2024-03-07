package msExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fls = new FileInputStream("./data/testData.xlsx"); //Provide the path of the file
		Workbook wb = WorkbookFactory.create(fls); // to make the file ready to read
		Sheet sheet = wb.getSheet("ipl"); // to get into the sheet
		Row row = sheet.getRow(5); // To get into the row
		Cell cell = row.getCell(0); // To get into the cell
		String data = cell.getStringCellValue(); // To get into the cell
		System.out.println(data);

	}

}
