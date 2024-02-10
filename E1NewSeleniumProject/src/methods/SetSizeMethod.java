package methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // to lunch the broswer
		Thread.sleep(2000);
		driver.manage().window().maximize(); // to miximize the broswer
		Thread.sleep(2000);
		Dimension targetSize = new Dimension(900, 500); // to pass the width and hieght to the dimension 
		driver.manage().window().setSize(targetSize); // To set the size of broswer
		Thread.sleep(2000);
		driver.close();

	}

}
