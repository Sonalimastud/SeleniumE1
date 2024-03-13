package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCoutFlag {
  @Test(priority = 1)
  public void login() 
  {
	  Reporter.log("Login method", true);
  }
  
  @Test(priority = 2, invocationCount = 4)
  public void addToCart() 
  {
	  Reporter.log("Add to cart method", true);
  }
  
  @Test(priority = 3)
  public void logout() 
  {
	  Reporter.log("Logout method", true);
  }
}
