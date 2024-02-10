package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment4{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // lunch the browser 
		driver.manage().window().maximize(); //to maximize browser
		driver.get("https://www.ajio.com/"); // to lunch the webapplication
		Thread.sleep(2000);
		
		WebElement singin = driver.findElement(By.id("loginAjio"));  //find username@ text field ont he web page
		singin.click();		
		
		WebElement number = driver.findElement(By.name("username"));  //find username@ text field ont he web page
		number.sendKeys("7896541238"); 
		
		WebElement cont = driver.findElement(By.className("login-btn"));  //find username@ text field ont he web page
		cont.click();
		
		WebElement gender = driver.findElement(By.cssSelector("input[valye='Female']"));  //find username@ text field ont he web page
		gender.click();
		
		WebElement name = driver.findElement(By.cssSelector("input[placeholder='Name']"));  //find username@ text field ont he web page
		name.sendKeys("jiya"); 
		
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));  //find username@ text field ont he web page
		email.sendKeys("jiya@gmail.com"); 
		
		WebElement checkBox = driver.findElement(By.id("tncCheckbox"));  //find username@ text field ont he web page
		checkBox.click();
		
		WebElement sendOtp = driver.findElement(By.className("login-form-inputs login-btn"));  //find username@ text field ont he web page
		sendOtp.click();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
