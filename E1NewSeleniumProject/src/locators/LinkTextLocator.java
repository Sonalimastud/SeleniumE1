package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser
		driver.get("https://www.facebook.com/"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement forgetPass = driver.findElement(By.linkText("Forgotten password?"));  //find username@ text field ont he web page
		forgetPass.click(); 
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
