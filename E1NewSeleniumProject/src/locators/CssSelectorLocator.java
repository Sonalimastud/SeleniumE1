package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//To lunch the broswer
		driver.manage().window().maximize();//to maximize broswer
		driver.get("https://www.instagram.com/");//to lunch the web applicatio
		Thread.sleep(2000);
		
		//to find the username textfield and pss input
		WebElement user = driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
		user.sendKeys("7894563215");
		
		//to find the password textfield and pss input
		WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
		pass.sendKeys("Sona@123");
		
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		loginButton.click();
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
