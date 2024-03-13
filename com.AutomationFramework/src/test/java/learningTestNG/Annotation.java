package learningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {
  @Test
  public void test1() 
  {
	  Reporter.log("This is @test1", true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("This is before method", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("This is after method", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("This is before class", true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("This is after class", true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("This is before test", true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("This is after test", true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("This is before suite", true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("This is after suite", true);
  }
  
  @Test
  public void test2() 
  {
	  Reporter.log("This is @test2", true);
  }

}
