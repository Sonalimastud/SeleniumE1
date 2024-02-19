package handlingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // To Provide Implicit wait
		driver.get("https://omayo.blogspot.com"); // to lunch the webapplication
		Thread.sleep(2000);
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		//To switch control to the popup
		Alert promptAlert = driver.switchTo().alert();
		
		// to get the text of the popup and print in console
		String promptText = promptAlert.getText();
		System.out.println(promptText);
		Thread.sleep(2000);
		
		// to pass the input to prommpt alert
		promptAlert.sendKeys("Sonali");
		Thread.sleep(1000);
		
		promptAlert.accept();
		//promptAlert.dismiss();
		driver.close();

	}

}
