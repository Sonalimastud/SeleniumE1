package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment2{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser
		driver.get("https://www.netflix.com/in/"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement log = driver.findElement(By.id("signIn"));  //find username@ text field ont he web page
		log.click();		
		
		WebElement user = driver.findElement(By.id("id_userLoginId"));  //find username@ text field ont he web page
		user.sendKeys("sonalimastud@gmail.com");
		
		WebElement pass = driver.findElement(By.id("id_password"));  //find username@ text field ont he web page
		pass.sendKeys("son@123");
		
		WebElement login = driver.findElement(By.cssSelector("button[class^='btn']"));  //find username@ text field ont he web page
		login.click();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
