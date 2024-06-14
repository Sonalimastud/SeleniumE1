package learningTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderByExcel {
  @DataProvider(name = "invalidCreds")
  
  public String [][] invalidCreds() throws EncryptedDocumentException, IOException 
  {
	 FileInputStream fls = new FileInputStream("./scr/test/resources/testData.xlsx");
	  Workbook wb = WorkbookFactory.create(fls);
	 Sheet sheet = wb.getSheet("invalidecreds");
	 int rowCount = sheet.getPhysicalNumberOfRows()-1;
	 int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
	 
	 String [][] arr = new String[rowCount][cellCount];
	 
	 for(int i=0, k=0; i <= rowCount; i++, k++)
	 {
		 for(int j=0; j < cellCount; j++)
		 {
			 arr[k][j]=sheet.getRow(i).getCell(j).getStringCellValue().toString();
		 }
	 }
	 
	return null;
  }
  
  @Test(dataProvider = "invalidCreds")
  public void login(String arr[]) throws InterruptedException
  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(arr[0]);
		driver.findElement(By.name("pwd")).sendKeys(arr[1]);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
