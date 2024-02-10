package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // to declare implicit wait
		driver.get("https://demoapps.qspiders.com/ui?scenario=1"); // to launch the application
		
		Actions act = new Actions(driver); // to create the object of actions class
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.partialLinkText("Double Click")).click();
		
		WebElement yesButton = driver.findElement(By.id("btn20"));
		WebElement noButton = driver.findElement(By.id("btn23"));
		WebElement ratingButton = driver.findElement(By.id("btn26"));
		
		act.doubleClick(yesButton).perform();
		act.doubleClick(noButton).perform();
		act.doubleClick(ratingButton).perform();

	}

}
