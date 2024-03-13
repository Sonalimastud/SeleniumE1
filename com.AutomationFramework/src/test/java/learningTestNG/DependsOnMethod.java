package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test
  public void login()
  {
	  Reporter.log("Login method", true);
  }
  
  @Test(dependsOnMethods = "login")
  public void addToCart()
  {
	  Reporter.log("Add To Cart method", true);
  }
  
  @Test(dependsOnMethods = "addToCart")
  public void logout()
  {
	  Reporter.log("Logout method", true);
  }
}
