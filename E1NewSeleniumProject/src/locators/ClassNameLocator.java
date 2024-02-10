package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser
		driver.get("file:///C:/Users/OM/OneDrive/Desktop/WebElement/Text.html"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement textBox = driver.findElement(By.className("usn-textbox"));  //find password text field ont he web page
		textBox.sendKeys("Manager"); // to pass input in password text field
		Thread.sleep(2000);
		driver.close();
		
		// Note:- inputs are passed to Username Textfield because it is the 1st element designed with input tag
	}

}
