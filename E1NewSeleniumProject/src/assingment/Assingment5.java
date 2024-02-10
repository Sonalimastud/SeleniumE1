package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment5{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser
		driver.get("https://www.flipkart.com/"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.partialLinkText("Login"));  //find username@ text field ont he web page
		login.click();		
		
		WebElement email = driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']"));  //find username@ text field ont he web page
		email.sendKeys("sonalimastud@gmail.com");
		
		WebElement otp = driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")); //find username@ text field ont he web page
		otp.click();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
