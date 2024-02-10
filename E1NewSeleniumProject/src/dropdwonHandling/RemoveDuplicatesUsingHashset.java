package dropdwonHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingHashset {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // lunch the browser
		driver.manage().window().maximize(); //to maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // to declare implicit wait
		driver.get("file:///C:/Users/OM/OneDrive/Desktop/WebElement/Multiple_Select.html"); // to launch the application
		
		WebElement singleSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(singleSelectDD);
		
		// to remove the duplicates
	     HashSet<String> hs = new HashSet<String>(); // to create new object for TreeSet
		
	     List<WebElement> options = sel.getOptions(); //to get the list of all the options
		
		//
		//for(int i=0; i<options.size();i++)
		//{
			//Object textToInsert = options.get(i).getText();
			//hs.add(textToInsert);
				
	//	}
		
		for(WebElement we : options)
		{
			String textToInsert = we.getText();
			hs.add(textToInsert);
		}
		
		for(String t : hs)
		{
			System.out.println(t);
		}

	}

}
