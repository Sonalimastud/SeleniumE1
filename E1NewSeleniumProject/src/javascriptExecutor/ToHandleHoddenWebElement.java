package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHoddenWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // To Provide Implicit wait
		driver.get("https://www.facebook.com/signup"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement hiddenElement = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		//hiddenElement.sendKeys("sonali");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='sonali'", hiddenElement);
	}

}
