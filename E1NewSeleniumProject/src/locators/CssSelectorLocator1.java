package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.cssSelector("input[aria-label^='Ph']"));
		user.sendKeys("7894563215");
		
		WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
		pass.sendKeys("Sona@123");
		
		WebElement loginButton = driver.findElement(By.cssSelector("button[type*='bm']"));
		loginButton.click();
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
