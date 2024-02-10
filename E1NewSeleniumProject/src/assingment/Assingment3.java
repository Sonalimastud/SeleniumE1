package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment3{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser
		driver.get("http://sonali/login.do"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.name("username"));  //find username@ text field ont he web page
		email.sendKeys("admin");		
		
		WebElement pass = driver.findElement(By.name("pwd"));  //find username@ text field ont he web page
		pass.sendKeys("manager"); 
		
		WebElement login = driver.findElement(By.className("initial"));  //find username@ text field ont he web page
		login.click();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
