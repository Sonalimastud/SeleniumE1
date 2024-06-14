package mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class zomato {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("zomato", Keys.ENTER);
		
		driver.findElement(By.xpath("//h3[text()='Best Restaurants in India']")).click();
		
        WebElement scrollTarget = driver.findElement(By.xpath("//h6[text()='Social links']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/footer/div/div/div[5]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/footer/div/div/div[5]/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/footer/div/div/div[5]/div[1]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/footer/div/div/div[5]/div[1]/a[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/footer/div/div/div[5]/div[1]/a[5]")).click();
		
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}
		}
		
		driver.switchTo().window(parent).close();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File link = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("./screenshots/Link.png");
		Files.copy(link, destination);
       }
	
}
