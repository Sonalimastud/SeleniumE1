package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser 
		driver.manage().window().maximize(); //to maximize browser
		driver.get("https://www.telegram.com/"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement singinLink = driver.findElement(By.cssSelector("a[aria-label='Sign In']"));  //find username@ text field ont he web page
		singinLink.click();		
		
		WebElement singinButton = driver.findElement(By.partialLinkText("Sign In"));  //find username@ text field ont he web page
		singinButton.click();
		
		WebElement email = driver.findElement(By.id("login-form-email"));  //find username@ text field ont he web page
		email.sendKeys("sonali@gmail.com");
		
		WebElement password = driver.findElement(By.id("login-form-password"));  //find username@ text field ont he web page
		password.sendKeys("Sonali@123");
		
		WebElement singin = driver.findElement(By.cssSelector("button[type='submit']"));  //find username@ text field ont he web page
		singin.click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
