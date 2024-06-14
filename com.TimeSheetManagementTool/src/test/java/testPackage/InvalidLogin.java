package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListner;
import genericPackage.Flib;
import pagePackage.LoginPage;

@Listeners(CustomeListner.class)

public class InvalidLogin extends BaseTest {

	@Test
	
	public void invalidTC() throws IOException, EncryptedDocumentException, InterruptedException {
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);

		int rc = flib.getRowCount(EXCEL_PATH, "invalidecreds");
		
		for(int i = 0; i<rc ; i++)
		{
			lp.invalidLoginMethod(flib.readExcelData(EXCEL_PATH, "invalidecreds", i, 0), flib.readExcelData(EXCEL_PATH, "invalidecreds", i, 1));
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
