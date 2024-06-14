package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));
		driver.get("https://www.bhaane.com");
		Thread.sleep(2000);
		
		//To close popup
		driver.findElement(By.id("mdiv")).click();
		
		// To create an account
		//driver.findElement(By.xpath("//*[@id=\"top-header\"]/div/div/div[4]/ul/li[2]")).click();
		//driver.findElement(By.xpath("//div[text()='sign up >']")).click();
		//driver.findElement(By.name("first_name")).sendKeys("Ranjanw");
		//driver.findElement(By.name("last_name")).sendKeys("Masw");
		//driver.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[1]/div[3]/div/input")).sendKeys("mastud4@gmail.com");
		//driver.findElement(By.name("mobile")).sendKeys("7796543333");
		//driver.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[1]/div[5]/div/input")).sendKeys("Mastud@123");
		//driver.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[2]/button")).click();
		//Thread.sleep(2000);
		
		// to login 
		driver.findElement(By.xpath("//*[@id=\"top-header\"]/div/div/div[4]/ul/li[2]")).click();
		driver.findElement(By.name("email")).sendKeys("mastud3@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mastud@123");
		driver.findElement(By.xpath("//button[text()='submit']")).click();
		
		// Search product
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/header/div/div/div[1]/ul/li[1]/a/span")).click();
		
		driver.findElement(By.xpath("//a[text()='jumpsuits']")).click();
		
		
	}

}
