package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
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
