package handlingPopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleNotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--disable-notifications");
		 
		 WebDriver driver = new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.easemytrip.com/");
		 Thread.sleep(2000);
		 
		 driver.close();
		
		

	}

}
