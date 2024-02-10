package dropdwonHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // to declare implicit wait
		driver.get("file:///C:/Users/OM/OneDrive/Desktop/WebElement/Options.html"); // to launch the application
		
		WebElement singleSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(singleSelectDD);
		 WebElement elements = sel.getWrappedElement();
		 String result = elements.getText();
		 System.out.println(result);

	}

}
