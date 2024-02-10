package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByBrowserSpecificClass {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver(); // to store the refrence with ChromeDriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;//To perform typecasting
		File scr = ts.getScreenshotAs(OutputType.FILE);// to take the screenshot of web page

		File destination = new File("./screenshots/Facebook.png");// to specify the location, name and extension of screenshot
		Files.copy(scr, destination);// to save the screenshot into screenshot folder
		driver.close();

	}

}
