package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListner;
import genericPackage.Flib;
import genericPackage.Worklib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserPage;

@Listeners(CustomeListner.class)
public class CreateUserManager extends BaseTest {

	@Test
	
	public void createUserManagerTC() throws IOException, EncryptedDocumentException, InterruptedException {
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		HomePage hp = new HomePage(driver);
		hp.getUsersModule().click();
		
		UserPage up = new UserPage(driver);
		up.getCreateNewUserButton().click();
		
		Worklib wb = new Worklib();
		int no = wb.randomNum();
		
		String usn = flib.readExcelData(EXCEL2_PATH, "ManagerCreds", 1, 0);
		String pwd = flib.readExcelData(EXCEL2_PATH, "ManagerCreds", 1, 1);
		String fname = flib.readExcelData(EXCEL2_PATH, "ManagerCreds", 1, 2);
		String lname = flib.readExcelData(EXCEL2_PATH, "ManagerCreds", 1, 3);
		
		up.createNewUserMethods(usn+no, pwd+no, fname+no, lname+no);
		
	}

}
