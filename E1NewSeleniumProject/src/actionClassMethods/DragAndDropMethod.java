package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Action']")).click();
		driver.findElement(By.xpath("//section[text()='Drag &Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		
		// mobile and laptops source WebElement
		WebElement mobileChargerSource = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement laptopChargerSource = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement mobileCoverSource = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement laotopCoverSource = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		// mobile and laptops target WebElement
		WebElement mobileAccessoriesTarget = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopAccessoriesTarget = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions act = new Actions(driver); // create t he object of Action class
		
		// to drag and drop the WebElement into respective traget area
		act.dragAndDrop(mobileChargerSource, mobileAccessoriesTarget).perform();
		act.dragAndDrop(laptopChargerSource, laptopAccessoriesTarget).perform();
		act.dragAndDrop(laotopCoverSource, laptopAccessoriesTarget).perform();
		act.dragAndDrop(mobileCoverSource, mobileAccessoriesTarget).perform();

	}

}
