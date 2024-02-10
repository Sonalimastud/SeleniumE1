package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser
		driver.get("https://app.fireflink.com/"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("mui-1"));  //find username@ text field ont he web page
		email.sendKeys("sonalimastud99@gmail.com");		
		
		WebElement pass = driver.findElement(By.name("password"));  //find username@ text field ont he web page
		pass.sendKeys("Mastud@82"); 
		
		WebElement login = driver.findElement(By.className("primary-btn"));  //find username@ text field ont he web page
		login.click();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
