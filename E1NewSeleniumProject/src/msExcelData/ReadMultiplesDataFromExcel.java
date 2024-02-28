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
		FileInputStream fls = new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		Sheet sheet = wb.getSheet("ipl");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
		}

	}

}
