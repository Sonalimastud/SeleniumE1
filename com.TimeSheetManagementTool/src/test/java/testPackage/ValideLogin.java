package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListner;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;

@Listeners(CustomeListner.class)

public class ValideLogin extends BaseTest{

	@Test
	public void loginTestCase() throws IOException, InterruptedException {
				
		// To load the non static members from Flib class
		Flib flib = new Flib();
				
		// To load the non static members from LoginPage class
		LoginPage lp = new LoginPage(driver);
				
		// To perform login operation by calling the method
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
			
	    Thread.sleep(5000);
			    
	    HomePage hp = new HomePage(driver);
	    hp.getLogoutLink().click();
	    
		Thread.sleep(7000);
		driver.close();

	}

}
