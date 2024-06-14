package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActitimeSoftAssert {
  @Test
  public void validLogin() throws InterruptedException
  {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://127.0.0.1/login.do");
	
	String expectedLoginTitle = "actiTIME - Login";
	
	SoftAssert sa = new SoftAssert();
	
	sa.assertEquals(driver.getTitle(), expectedLoginTitle, "Login page is not displayed");
	
	WebElement usn = driver.findElement(By.name("username"));
	sa.assertEquals(usn.isDisplayed(), true, "Username text box is not displayed");
	usn.sendKeys("admin");
	
	WebElement pwd = driver.findElement(By.name("pwd"));
	sa.assertEquals(pwd.isDisplayed(), true, "Password text box is not displayed");
	pwd.sendKeys("manager");
	
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	sa.assertEquals(pwd.isDisplayed(), true, "Login button is not displayed");
	loginButton.click();
	
	sa.assertAll();
	
	Thread.sleep(4000);
	driver.close();
	}
}
