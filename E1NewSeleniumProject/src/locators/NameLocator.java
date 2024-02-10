package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser
		driver.get("https://www.facebook.com/"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement textBox = driver.findElement(By.name("email"));  //find username@ text field ont he web page
		textBox.sendKeys("sonali@gmail.com"); // to pass input in password text field
		
		WebElement textPass = driver.findElement(By.name("pass"));  //find password text field ont he web page
		textPass.sendKeys("Son@99"); // to pass input in password text field
		
		WebElement loginButton = driver.findElement(By.name("login")); 
		loginButton.click(); 
		
		Thread.sleep(9000);
		driver.close();
		
		
	}

}
