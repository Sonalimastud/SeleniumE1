package handlingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\OM\\Downloads\\pallavi_r.docx");
		 Thread.sleep(2000);
		 driver.close();

	}

}
