package methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizChildWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.partialLinkText("Open a popup window")).click(); // to open the new window
		
	    Set<String> allWindows = driver.getWindowHandles(); // to get the address of all the window
	    
	    //to iterrate and switch the control to the window one by one
	    for(String wh : allWindows)
	    {
	    	String title = driver.switchTo().window(wh).getTitle(); // to get the title of each window
	    	
	    	if(title.equals("New Window")) // to compare title to the child window
	    	{
	    		driver.manage().window().maximize(); // to maximiz the child window
	    		Thread.sleep(1000);
	    		driver.close();
	    	}
	    }
	    Thread.sleep(1000);
	    driver.quit();
		

	}

}
