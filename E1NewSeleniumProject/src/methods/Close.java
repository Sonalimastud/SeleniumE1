package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Close {

	public static void main(String[] args) throws InterruptedException {
		
       ChromeOptions ops = new ChromeOptions();
       ops.addArguments("--remote-allow-origins=*");
	
	   WebDriver driver = new ChromeDriver(ops);
		
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
        //new ChromeDriver(co);
	
		
	}

}
