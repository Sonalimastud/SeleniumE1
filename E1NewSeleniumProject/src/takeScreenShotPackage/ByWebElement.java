package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // to store the refrence with WebDriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		
		File scr = loginButton.getScreenshotAs(OutputType.FILE);// to take the screenshot of web page
		File dest = new File("./screenshots/InstaLoginButton.jpg");// to specify the location, name and extension of screenshot
		Files.copy(scr, dest);// to save the screenshot into screenshot folder
		driver.close();

	}

}
