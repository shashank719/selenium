package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPf {
	WebDriver driver;

	public FaceBookPf(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath ="//input[@id='email']")
	WebElement emailid;
	@FindBy (xpath=" //input[@id='pass']")
	WebElement password;
	@FindBy (xpath ="//button[@name='login']")
	WebElement button;
	public WebElement emailID()
	{
	    return emailid;
	}
	public WebElement paswoord()
	{
		return password;
	}
	public WebElement button()
	{
		return button;
	}
	

}
