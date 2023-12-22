package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmPageFactoy {
	WebDriver driver;

	public OrangeHrmPageFactoy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy (xpath="//input[@name='passowrd']")
	 WebElement password;
	@FindBy (xpath="//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	 WebElement button;

	public WebElement emailId() {

		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement button() {
		return button;
	}
}
