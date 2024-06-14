package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	//Declaration
	@FindBy(xpath = "//input[@value='Create New User']")private WebElement createNewUserButton;
	@FindBy(name = "username")private WebElement usernameTB;
	@FindBy(name = "passwordText")private WebElement passwordTB;
	@FindBy(name = "passwordTextRetype")private WebElement retypePasswordTB;
	@FindBy(name = "firstName")private WebElement firstNameTB;
	@FindBy(name = "lastName")private WebElement lastNameTB;
	@FindBy(id = "right12")private WebElement modifyTimeTrackCheckBox;
	@FindBy(id = "right2")private WebElement manageCustomerAndProjectCheckBox;
	@FindBy(id = "right13")private WebElement manageTasksCheckBox;
	@FindBy(id = "right1")private WebElement generateReportCheckBox;
	@FindBy(id = "right5")private WebElement manageUserCheckBox;
	@FindBy(id = "right7")private WebElement manageBillingTypeCheckBox;
	@FindBy(xpath = "//input[contains(@value,'Create User ')]")private WebElement creatUserButton;
	@FindBy(xpath = "//input[contains(@value,' Cancel')]")private WebElement cancelButton;

	public UserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getModifyTimeTrackCheckBox() {
		return modifyTimeTrackCheckBox;
	}

	public WebElement getManageCustomerAndProjectCheckBox() {
		return manageCustomerAndProjectCheckBox;
	}

	public WebElement getManageTasksCheckBox() {
		return manageTasksCheckBox;
	}

	public WebElement getGenerateReportCheckBox() {
		return generateReportCheckBox;
	}

	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}

	public WebElement getManageBillingTypeCheckBox() {
		return manageBillingTypeCheckBox;
	}

	public WebElement getCreatUserButton() {
		return creatUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public void createNewUserMethods(String usn, String pwd, String fname, String lname) throws InterruptedException
	{
		Thread.sleep(2000);
		usernameTB.sendKeys(usn);
		Thread.sleep(1000);
		passwordTB.sendKeys(pwd);
		Thread.sleep(1000);
		retypePasswordTB.sendKeys(pwd);
		Thread.sleep(1000);
		firstNameTB.sendKeys(fname);
		Thread.sleep(1000);
		lastNameTB.sendKeys(lname);
		Thread.sleep(1000);
		modifyTimeTrackCheckBox.click();
		Thread.sleep(1000);
		manageCustomerAndProjectCheckBox.click();
		Thread.sleep(1000);
		manageUserCheckBox.click();
		Thread.sleep(1000);
		generateReportCheckBox.click();
		Thread.sleep(1000);
		manageBillingTypeCheckBox.click();
		Thread.sleep(1000);
		creatUserButton.click();
		Thread.sleep(1000);
		
	}
	
}
