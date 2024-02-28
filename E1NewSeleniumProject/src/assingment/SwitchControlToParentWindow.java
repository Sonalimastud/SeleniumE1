package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchControlToParentWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click(); // to click on frame option
		driver.findElement(By.xpath("//section[text()='iframes']")).click(); // to click on iframe option
		
		// to find the frame and store in a variable
		WebElement username = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		
		// to switch the control to the frame element
		driver.switchTo().frame(username);
		
		// to find th e element present inside frame
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("adcd@gmail.com");
		
		// to switch the control to main webpage
		driver.switchTo().defaultContent();
		
		// to click on the nested iframe option on the main webpage
		driver.findElement(By.partialLinkText("Nested iframe")).click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
