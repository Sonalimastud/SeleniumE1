package msExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fls = new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		Sheet sheet = wb.getSheet("ipl");
		Row row = sheet.createRow(11);
		Cell cell = row.createCell(0);
		cell.setCellValue("MIS");
		
		FileOutputStream fos = new FileOutputStream("./data/testData.xlsx");
		wb.write(fos);

	}

}
