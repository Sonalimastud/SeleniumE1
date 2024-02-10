package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingIntoRemotWebDriver {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver(); // to store the refrence with RemoteDriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		
		File scr = driver.getScreenshotAs(OutputType.FILE);// to take the screenshot of web page
		File dest = new File("./screenshots/Amazon.jpg");// to specify the location, name and extension of screenshot
		Files.copy(scr, dest);// to save the screenshot into screenshot folder
		driver.close();

	}

}
