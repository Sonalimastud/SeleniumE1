package methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPossitionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // to lunch the browser
		Thread.sleep(2000);
		driver.manage().window().maximize(); // to maximize the browser
		Thread.sleep(2000);
		Point targetPosition = new Point(200, 100); // to the co-ordinate to set position method
		driver.manage().window().setPosition(targetPosition); //to set the position of browser
		Thread.sleep(2000);
		driver.close();

	}

}
