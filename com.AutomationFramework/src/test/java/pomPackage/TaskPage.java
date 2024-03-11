package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {
	
	@FindBy(xpath = "//a[text()='Projects & Customers']")private WebElement projectandCoustomerLink;
	@FindBy(xpath = "//input[@value='Create New Customer']")private WebElement createNewCustomerButton;
	@FindBy(xpath = "//input[@value='Create New Project']")private WebElement createNewProjectButton;
	@FindBy(name = "name")private WebElement customerNameTB;
	@FindBy(xpath = "//input[@value='Create Customer']")private WebElement createCustomerButton;
	@FindBy(xpath = "//input[contains(@value, ' Cancel ')]")private WebElement cancelCustomerButton;
	@FindBy(name = "customerId")private WebElement customerDropDown;
	@FindBy(xpath = "//input[@name='name']")private WebElement projectNameTB;
	@FindBy(name = "createProjectSubmit")private WebElement createProjectButton;
	@FindBy(xpath = "//input[contains(@value, ' Cancel ')]")private WebElement cancelProjectButton;
	@FindBy(xpath = "//a[text()='All']")private WebElement selectAllProjectandCustomer;
	@FindBy(xpath = "//input[@value='Delete Selected']")private WebElement deleteSelectedButton;
	@FindBy(xpath = "//input[@value='Archive Selected']")private WebElement archiveSelectedButton;
	@FindBy(id = "deleteButton")private WebElement deleteThisCustomerPopup;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProjectandCoustomerLink() {
		return projectandCoustomerLink;
	}

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

	public WebElement getCustomerNameTB() {
		return customerNameTB;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getCancelCustomerButton() {
		return cancelCustomerButton;
	}

	public WebElement getCustomerDropDown() {
		return customerDropDown;
	}

	public WebElement getProjectNameTB() {
		return projectNameTB;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}

	public WebElement getCancelProjectButton() {
		return cancelProjectButton;
	}

	public WebElement getSelectAllProjectandCustomer() {
		return selectAllProjectandCustomer;
	}

	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}

	public WebElement getArchiveSelectedButton() {
		return archiveSelectedButton;
	}
	
	public WebElement getDeleteThisCustomerPopup() {
		return deleteThisCustomerPopup;
	}

	public void createNewCustomerMethod(String customerName) throws InterruptedException
	{
		projectandCoustomerLink.click();
		Thread.sleep(1000);
		createNewCustomerButton.click();
		Thread.sleep(1000);
		customerNameTB.sendKeys(customerName);
		Thread.sleep(1000);
		createCustomerButton.click();
		Thread.sleep(1000);
	}
	
	public void createNewProjectMethod(String customerName, String projectName) throws InterruptedException
	{
		projectandCoustomerLink.click();
		Thread.sleep(1000);
		createNewProjectButton.click();
		
	    Select sel = new Select(customerDropDown);
	    sel.selectByVisibleText(customerName);
		Thread.sleep(1000);
		
		projectNameTB.sendKeys(projectName);
		Thread.sleep(1000);
		createProjectButton.click();
		Thread.sleep(1000);
	}
	
	public void deleteAllCustomerAndProjectsMethod() throws InterruptedException
	{
		projectandCoustomerLink.click();
		Thread.sleep(1000);
		selectAllProjectandCustomer.click();
		Thread.sleep(1000);
		deleteSelectedButton.click();
		Thread.sleep(1000);
		deleteThisCustomerPopup.click();
		Thread.sleep(1000);
	}

}
