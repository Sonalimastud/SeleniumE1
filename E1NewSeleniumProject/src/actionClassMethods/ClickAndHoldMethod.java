package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Action']")).click();
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		// to find the elemeent to the click and hold
		WebElement clickAndHold = driver.findElement(By.xpath("div[@id='circle']"));
		
		Actions act = new Actions(driver);//To create the object of Actions class
		act.clickAndHold(clickAndHold).perform();// to perform click and hold operation
		Thread.sleep(7000);
		driver.close();

	}

}
