package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeForpwdPf {
	WebDriver driver;

	public OrangeForpwdPf (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =" //p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement link;
	
	public WebElement button()
	{
		return link;
	}

}
