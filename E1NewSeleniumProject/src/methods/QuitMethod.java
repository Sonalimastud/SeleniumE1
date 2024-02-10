package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // to lunch the browser
		Thread.sleep(2000);
		driver.manage().window().maximize(); // to maximize the browser window
		Thread.sleep(2000);
		driver.get("https://omayo.blogspot.com/"); // to lunch the web application
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open a popup window")).click(); // open the new child window from browser
		Thread.sleep(2000);
		//driver.close();
		driver.quit(); // close child as well as parent window
	}

}
