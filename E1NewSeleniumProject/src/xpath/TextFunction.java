package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));
		driver.get("https://www.bhaane.com/");
		Thread.sleep(2000);
		
		//To close popup
		driver.findElement(By.id("mdiv")).click();
		
		// to login 
		driver.findElement(By.xpath("//*[@id=\"top-header\"]/div/div/div[4]/ul/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("mastud3@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mastud@123");
		driver.findElement(By.xpath("//button[text()='submit']")).click();
		Thread.sleep(1000);
		
		// Search product
		driver.findElement(By.xpath("//*[@id=\"top-header\"]/div[1]/div/div[1]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"top-header\"]/div[2]/div/div[1]/div/ul/li[2]/a[text()='skirts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"products\"]/div[1]/a/div/img[1]")).click();
		Thread.sleep(1000);
		
		// add product to wishlist
		driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div/div[2]/div/form/div[3]/div/button[2]/span[1]")).click();
		
		// add product to cart
		driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div/div[2]/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"modal-bag\"]/div/div[1]/div[3]/a[text()='go to cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cart\"]/div[1]/div[2]/a/button")).click();
		Thread.sleep(1000);
		
		// add address
		driver.findElement(By.xpath("//button[text()='add new address']")).click();
		Thread.sleep(1000);
		WebElement countryD = driver.findElement(By.name("country_id"));
		Thread.sleep(1000);
		Select country = new Select(countryD);
		
		country.selectByValue("101");
		Thread.sleep(1000);
		WebElement stateD = driver.findElement(By.id("state"));
		Select state = new Select(stateD);
		
		state.selectByValue("Maharashtra");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[3]/div/input")).sendKeys("Sonali");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[4]/div/input")).sendKeys("Mastud");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[5]/div/input")).sendKeys("Bhaane");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[6]/div/div/input")).sendKeys("7896541236");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[7]/div/input")).sendKeys("Taj hotel");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[8]/div/input")).sendKeys("Baner");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[9]/div/input")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div[10]/div/input")).sendKeys("411023");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='deliver here']")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
