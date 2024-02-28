package HandlingsFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPassingFrameElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		
		// to identify the frame by writting the  xpath
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		
		// to pass the refrence of the xpath
		driver.switchTo().frame(frameElement);
		
		// to perform opration on element designed inside frame
		driver.findElement(By.id("regEmail")).sendKeys("9988774455");
		
		Thread.sleep(2000);
		driver.close();

	}

}
