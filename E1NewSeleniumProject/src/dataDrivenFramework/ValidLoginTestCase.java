package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/testData.xlsx", "validcreds", 1, 0));
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/testData.xlsx", "validcreds", 1, 1));
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(7000);
		driver.close();

	}

}
