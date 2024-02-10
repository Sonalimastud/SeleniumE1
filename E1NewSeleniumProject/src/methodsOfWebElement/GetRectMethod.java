package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // to declare implicit wait
		driver.get("http://127.0.0.1/login.do;jsessionid=1rb0hcfigra9y"); // to launch the application
		
	   WebElement login = driver.findElement(By.id("loginButton"));
	   Rectangle rect = login.getRect();
	   System.out.println(rect.getHeight());
	   System.out.println(rect.getWidth());
	   System.out.println(rect.getX());
	   System.out.println(rect.getY());
	}

}
