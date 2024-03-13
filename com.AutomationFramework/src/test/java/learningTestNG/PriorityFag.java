package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFag {
  @Test (priority = -1)
  public void register() 
  {
	  Reporter.log("This is register method", false);
  }
  
  @Test (priority = 0)
  public void login() 
  {
	  Reporter.log("This login method", true);
  }
  
  @Test (priority = 1)
  public void addToCart() 
  {
	  Reporter.log("This is Add To Cart method", true);
  }
  
  @Test (priority = 2)
  public void addToWishlist() 
  {
	  Reporter.log("This is Add To Wishlist method", true);
  }
  
  @Test (priority = 3)
  public void buyProduct() 
  {
	  Reporter.log("This is Buy Product method", true);
  }
  
  @Test (priority = 4)
  public void tractOrder()
  {
	  Reporter.log("This is Tract Order method", true);
  }
  
  @Test (priority = 5)
  public void logout() 
  {
	  Reporter.log("This is logout method", true);
  }
}
