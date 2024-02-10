package dropdwonHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // to declare implicit wait
		driver.get("file:///C:/Users/OM/OneDrive/Desktop/WebElement/Multiple_Select.html"); // to launch the application
		
		WebElement singleSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(singleSelectDD);
		
		// to deselect an option by using the index value
		sel.selectByIndex(4);
		Thread.sleep(2000);
		sel.deselectByIndex(4);
		
		// to deselect an option by using the index value
		sel.selectByValue("v4");
		Thread.sleep(2000);
		sel.deselectByValue("v4");
				
		// to deselect an option by using the index value
		sel.selectByVisibleText("Samosa");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Samosa");

	}

}
