package msExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException{
		FileInputStream fls = new FileInputStream("./data/testData.xlsx"); //Provide the path of the file
		Workbook wb = WorkbookFactory.create(fls); // to make the file ready to read
	    Sheet sheet = wb.getSheet("validcreds"); // to get into the sheet
	    Row row = sheet.getRow(1); // To get into the row
	    Cell cell = row.getCell(0); // To get into the cell
	    String usnData = cell.getStringCellValue(); // To read the data from the cell
	    
	    FileInputStream fls1 = new FileInputStream("./data/testData.xlsx"); //Provide the path of the file
		Workbook wb1 = WorkbookFactory.create(fls1); // to make the file ready to read
	    Sheet sheet1 = wb1.getSheet("validcreds"); // to get into the sheet
	    Row row1 = sheet1.getRow(1); // To get into the row
	    Cell cell1 = row1.getCell(1); // To get into the cell
	    String pwdData = cell1.getStringCellValue(); // To read the data from the cell
	    
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("http://127.0.0.1/login.do");
	   
	   driver.findElement(By.name("username")).sendKeys(usnData);
	   Thread.sleep(2000);
	   driver.findElement(By.name("pwd")).sendKeys(pwdData);
	   Thread.sleep(2000);
	   driver.findElement(By.id("loginButton")).click();
	   Thread.sleep(7000);
	   driver.close();
	   }

}
