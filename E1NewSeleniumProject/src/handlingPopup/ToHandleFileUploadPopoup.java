package handlingPopup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopoup {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		 driver.get("https://omayo.blogspot.com/");
		 Thread.sleep(2000);
		 
		 WebElement file = driver.findElement(By.id("uploadfile"));
		 
		 Actions ac = new Actions(driver);
		 ac.click(file).perform();
		 Thread.sleep(2000);
		 
		 Runtime.getRuntime().exec("./autoItProgram/File1.exe");
	}

}
