package handlingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // To Provide Implicit wait
		driver.get("https://omayo.blogspot.com"); // to lunch the webapplication
		Thread.sleep(2000);
		
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);

		Alert alertPopup = driver.switchTo().alert();
		//alertPopup.accept();
		alertPopup.dismiss();
		driver.close();

	}

}
