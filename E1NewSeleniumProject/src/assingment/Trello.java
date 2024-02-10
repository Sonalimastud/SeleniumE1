package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trello {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://trello.com/");
		
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("sonalimastud99@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Sham@7228");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//h1[text()='Simple Project Board']")).click();
		driver.findElement(By.xpath("//button[text()='Okay, got it']")).click();
		driver.findElement(By.xpath("//a[text()='Create board from template']")).click();
		driver.findElement(By.id("boardNewTitle")).sendKeys("java");
		
		//source element
		WebElement javaScr = driver.findElement(By.xpath("//a[text()='JAVA']"));
		WebElement manualScr = driver.findElement(By.xpath("//a[text()='MANUAL TESTING']"));
		WebElement seleniumScr = driver.findElement(By.xpath("//a[text()='SELENIUM']"));
		WebElement apiScr = driver.findElement(By.xpath("//a[text()='API']"));

		//target element
		WebElement mockGiveTarget = driver.findElement(By.xpath("//h2[text()='Mock Given']"));
		WebElement mockPendingTarget = driver.findElement(By.xpath("//h2[text()='Mock Pending']"));
		WebElement mockSchedulesTarget = driver.findElement(By.xpath("//textarea[text()='Mock Scheduled']"));
		
		Actions act = new Actions(driver);
		Actions dragAndDrop = act.dragAndDrop(javaScr, mockSchedulesTarget);
		dragAndDrop.perform();
		
		act.dragAndDrop(apiScr, mockSchedulesTarget).perform();
		act.dragAndDrop(seleniumScr, mockPendingTarget).perform();
		act.dragAndDrop(manualScr, mockGiveTarget).perform();
		
		

	}

}
