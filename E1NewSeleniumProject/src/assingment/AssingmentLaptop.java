package assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentLaptop {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop", Keys.ENTER);
	
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling :: div[@class='_24_Dny']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='RAM Capacity']")).click();
	driver.findElement(By.xpath("//div[text()='8 GB']/preceding-sibling :: div[@class='_24_Dny']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	driver.findElement(By.xpath("//div[text()='Windows 11']/preceding-sibling :: div[@class='_24_Dny']")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='4★ & above']/preceding-sibling :: div[@class='_24_Dny']")).click();	
	Thread.sleep(1000);
	List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> laptopPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor :: div[@class='_3pLy-c row']"));
	
	 for(int i=0; i<laptops.size(); i++)
	 {
	  String op = laptops.get(i).getText();
	  
	  for(int j=i; j<=i; j++)
	  {
		  String price = laptopPrice.get(j).getText();
		  System.out.println(op+" : "+price);
		  Thread.sleep(1000);
	  }
	  System.out.println();
    }
	 driver.close();
	 

	}

}
