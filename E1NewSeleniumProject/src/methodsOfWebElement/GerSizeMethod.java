package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GerSizeMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // to declare implicit wait
		driver.get("http://127.0.0.1/login.do;jsessionid=1rb0hcfigra9y"); // to launch the application
		
	   WebElement username = driver.findElement(By.name("username"));
	   Dimension size = username.getSize();
	   int height = size.getHeight();
	   int width = size.getWidth();
	   System.out.println("Height of username textfild: "+height+"  "+"Width of username textfild:"+width);
	   
	   WebElement password = driver.findElement(By.name("pwd"));
	   Dimension size1 = password.getSize();
	   int height1 = size1.getHeight();
	   int width1 = size1.getWidth();
	   System.out.println("Height of password textfild: "+height1+"  "+"Width of password textfild:"+width1);

	}

}
