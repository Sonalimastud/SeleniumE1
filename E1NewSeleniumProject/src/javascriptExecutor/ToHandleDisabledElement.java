package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // To Provide Implicit wait
		driver.get("https://demoapps.qspiders.com/ui?scenario=1"); // to lunch the webapplication
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(1000);
		
		WebElement disablbeTextBox = driver.findElement(By.id("name"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver; // To Typecast from WebDriver To JavascriptExecutor
		js.executeScript("document.getElementById('name').value='admin'"); // To pass the input in disable element
		Thread.sleep(2000);
		
		//js.executeScript("document.getElementById('name').value=''"); // To clear the input in disable element
		js.executeScript("arguments[0].value=''", disablbeTextBox);
		Thread.sleep(2000);
		
		driver.close();

	}

}
