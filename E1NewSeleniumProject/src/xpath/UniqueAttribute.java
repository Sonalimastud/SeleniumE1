package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/");
		Thread.sleep(2000);
		
		//WebElement cookies = driver.findElement(By.id("rcc-confirm-button"));
		//cookies.click();
		
		//WebElement singInLink = driver.findElement(By.className("collapse navbar-collapse"));
		//singInLink.click();
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='emailId']"));
		userName.sendKeys("sonalimastud99@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='mui-2']"));
		password.sendKeys("Sham@999");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
