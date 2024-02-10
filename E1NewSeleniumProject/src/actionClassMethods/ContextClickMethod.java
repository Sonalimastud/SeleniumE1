package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // to declare implicit wait
		driver.get("https://demoapps.qspiders.com/ui?scenario=1"); // to launch the application
		
		Actions act = new Actions(driver); // to create the object of actions class
		
		WebElement Button = driver.findElement(By.xpath("//section[text()='Button']"));
		// to perform single click operation using click method of actions class
		act.click(Button);                            
		WebElement rightClick = driver.findElement(By.partialLinkText("Right Click"));
		// to perform single click operation using click method of actions class
		act.click(rightClick);                        
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='btn30']"));
		// to perform right click operation on WebElement
		act.contextClick(button1).perform();          
		WebElement button1Option = driver.findElement(By.xpath("//div[text()='Yes']"));
		// to perform single click operation using click method of actions class
		act.click(button1Option).perform();           
		
		WebElement button2 = driver.findElement(By.xpath("//button[@id='btn31']"));
		// to perform right click operation on WebElement
		act.contextClick(button2).perform();         
		WebElement button2Option = driver.findElement(By.xpath("//div[text()='No']"));
		// to perform single click operation using click method of actions class
		act.click(button2Option).perform();          
		
		WebElement button3 = driver.findElement(By.xpath("//button[@id='btn32']"));
		// to perform right click operation on WebElement
		act.contextClick(button3).perform();        
		WebElement button3Option = driver.findElement(By.xpath("//div[text()='5']"));
		// to perform single click operation using click method of actions class
		act.click(button3Option).perform();       
		
		
	}

}
