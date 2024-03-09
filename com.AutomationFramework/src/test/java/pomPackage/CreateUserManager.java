package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class CreateUserManager extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		HomePage hp = new HomePage(driver);
		hp.getUsersModule().click();
		
		UserPage up = new UserPage(driver);
		up.getCreateNewUserButton().click();
		
		Worklib wb = new Worklib();
		int no = wb.randomNum();
		
		String usn = flib.readExcelData(EXCEL1_PATH, "ManagerCreds", 1, 0);
		String pwd = flib.readExcelData(EXCEL1_PATH, "ManagerCreds", 1, 1);
		String fname = flib.readExcelData(EXCEL1_PATH, "ManagerCreds", 1, 2);
		String lname = flib.readExcelData(EXCEL1_PATH, "ManagerCreds", 1, 3);
		
		up.createNewUserMethods(usn+no, pwd+no, fname+no, lname+no);
		
	}

}
