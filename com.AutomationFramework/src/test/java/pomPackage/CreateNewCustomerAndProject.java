package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class CreateNewCustomerAndProject extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
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
