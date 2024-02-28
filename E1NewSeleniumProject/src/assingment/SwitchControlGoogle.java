package assingment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SwitchControlGoogle {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame("app");
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;//To perform typecasting
		File map = ts.getScreenshotAs(OutputType.FILE);// to take the screenshot of web page

		File destination = new File("./screenshots/Map.png");// to specify the location, name and extension of screenshot
		Files.copy(map, destination);// to save the screenshot into screenshot folder
		
		// to switch the control to main webpage
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.close();

	}

}
