package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWebDriver {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver(); // to upcast WebDriver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.instagram.com/");
		
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);// to create the object of EventWebDriver class
		
		File scr = efwd.getScreenshotAs(OutputType.FILE);// to take the screenshot of web page

		File destination = new File("./screenshots/Instagram.png");// to specify the location, name and extension of screenshot
		Files.copy(scr, destination);// to save the screenshot into screenshot folder
		driver.close();

	}

}
