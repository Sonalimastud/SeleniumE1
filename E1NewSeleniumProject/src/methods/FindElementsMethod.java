package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser
		driver.get("https://www.google.co.in/"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("bikes");
		Thread.sleep(1000);
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='wM6W7d'"));
		
		// for(int i=0; i<options.size(); i++)
		// {
		//  String opt = we.getText();
		//  System.out.println(opt);
		//  Thread.sleep(1000);
	    // }
		
		for(WebElement we: options)
		{
			String opt = we.getText();
			System.out.println(opt);
			Thread.sleep(1000);
			
		}

	}

}
