package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser
		
		//to apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/"); // to lunch the webapplication
		driver.findElement(By.name("username")).sendKeys("manager"); //to send input to username

	}

}
