package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListner;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskPage;

@Listeners(CustomeListner.class)

public class CreateNewCustomerAndProject extends BaseTest {

	@Test
	
	public void createNewCustomerAndProjectTC () throws IOException, EncryptedDocumentException, InterruptedException {
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		String usn = flib.readPropertyData(PROP_PATH, "username");
		String pwd = flib.readPropertyData(PROP_PATH, "password");
		lp.validLoginMethod(usn, pwd);
		
		HomePage hp = new HomePage(driver);
		hp.getTasksModule().click();
		
		TaskPage tp = new TaskPage(driver);
		tp.createNewCustomerMethod(flib.readExcelData(EXCEL2_PATH, "taskPageDetails", 1, 0));
		Thread.sleep(2000);
		tp.createNewProjectMethod(flib.readExcelData(EXCEL2_PATH, "taskPageDetails", 1, 0), flib.readExcelData(EXCEL2_PATH, "taskPageDetails", 1, 1));
		Thread.sleep(2000);
		tp.deleteAllCustomerAndProjectsMethod();
		Thread.sleep(2000);
		driver.close();
	}

}
