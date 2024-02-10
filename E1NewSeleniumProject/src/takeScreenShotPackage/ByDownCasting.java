package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;


public class ByDownCasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		RemoteWebDriver nd = (RemoteWebDriver)driver; // to perform typecasting
		File scr = nd.getScreenshotAs(OutputType.FILE);// to take the screenshot of web page
		File dest = new File("./screenshots/Flipkart.jpg");// to specify the location, name and extension of screenshot
		Files.copy(scr, dest);// to save the screenshot into screenshot folder
		driver.close();
	}

}
