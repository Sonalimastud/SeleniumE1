package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // to declare implicit wait
		driver.get("https://www.flipkart.com/"); // to launch the application
		
		WebElement homeAndFurniture = driver.findElement(By.xpath("//span[text()='item & Furniture']"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(homeAndFurniture).perform();

	}

}
