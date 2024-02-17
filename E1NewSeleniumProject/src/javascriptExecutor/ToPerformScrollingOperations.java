package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser 
		driver.manage().window().maximize(); //to maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // To Provide Implicit wait
		driver.get("https://www.selenium.dev/"); // to lunch the webapplication
		
		JavascriptExecutor js=(JavascriptExecutor)driver; // To Typecast from WebDriver To JavascriptExecutor
		
		// To Perform Scroll-Down Operation
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		// To Perform Scroll-Up Operation
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		

	}

}
