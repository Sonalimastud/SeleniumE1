package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
	
	@FindBy(name="username")private WebElement unsTb;
	@FindBy(name="pwd")private WebElement pwdTb;
	@FindBy(id="loginButton")private WebElement loginButton;
	@FindBy(name="remember")private WebElement rememberMeChekBox;
	@FindBy(partialLinkText = "Actimind Inc.")private WebElement actitimaeLink;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUnsTb() {
		return unsTb;
	}

	public WebElement getPwdTb() {
		return pwdTb;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getRememberMeChekBox() {
		return rememberMeChekBox;
	}

	public WebElement getActitimaeLink() {
		return actitimaeLink;
	}
	
	

}
