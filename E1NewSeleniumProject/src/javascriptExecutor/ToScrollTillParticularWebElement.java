package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillParticularWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // lunch the browser 
		driver.manage().window().maximize(); //to maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // To Provide Implicit wait
		driver.get("https://www.selenium.dev/"); // to lunch the webapplication
		
		WebElement scrollTarget = driver.findElement(By.xpath("//h2[text()='News']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver; // To Typecast from WebDriver To JavascriptExecutor
		
		js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget); // to display the element at last of the screen

	}


}
