package assingment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleUploadFilePopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		 driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		 Thread.sleep(2000);
		 
		 WebElement file = driver.findElement(By.id("myFile"));
		 
		 Actions act = new Actions(driver);
		 act.click(file).perform();
		 
		 Runtime.getRuntime().exec("./autoItProgram/File_Upload_W3.exe");

	}

}
