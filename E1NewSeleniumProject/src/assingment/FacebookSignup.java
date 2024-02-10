package assingment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // to declare implicit wait
		driver.get("https://www.facebook.com/"); // to launch the application
		
		WebElement daydropdown = driver.findElement(By.id("day"));
	    WebElement monthDropDown = driver.findElement(By.id("month"));
	    WebElement yearDropDown = driver.findElement(By.id("year"));
	   
	    Select day = new Select(daydropdown);
	    boolean result = day.isMultiple();
	    System.out.println("dayDropdown is multiple?:"+result);
	
	    List<WebElement> dayoptions = day.getOptions();
	    for(WebElement we :dayoptions)
	    {
	    	System.out.println(we.getText());
	    }
	
		 day.selectByIndex(16);
		 System.out.println("---------------------------------------------");
		 System.out.println();
		  
		 Select month = new Select(monthDropDown);
		 boolean result1 = month.isMultiple();
	     System.out.println("monthDropdown is multiple?:"+result);
		
		 List<WebElement> monthOptions = month.getOptions();
		 for(WebElement we :monthOptions)
		 {
			 System.out.println(we.getText());
		 }
		
		 month.selectByValue("6");
		 System.out.println("---------------------------------------------");
		 System.out.println();
			  
		 Select year = new Select(yearDropDown);
	     boolean result3 = year.isMultiple();
	     System.out.println("year is multiple?:"+result3);
			
		 List<WebElement> yearOptions = year.getOptions();
		 for(WebElement we :yearOptions)
		 {
			 System.out.println(we.getText());
		 }
			
		 year.selectByValue("2021");
		 System.out.println("---------------------------------------------");
		 System.out.println();
		  
		
	
	}

}
