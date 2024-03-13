package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGclass {
  @Test(priority = 1)
  public void login() 
  {
	 Reporter.log("This is login method", true); // print in consol as well as in report
  }
  @Test(priority = 2)
  public void addToCart()
  {
	  Reporter.log("This is Add to cart method", false); // print only in report
  }
  @Test(priority = 3)
  public void logout()
  {
	  System.out.println("This is logout method"); // print only in console
  }
}

