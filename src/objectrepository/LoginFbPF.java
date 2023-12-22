package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginFbPF {
	@Test
	public void login()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		FaceBookPf fb = new FaceBookPf(driver);
		fb.emailID().sendKeys("qwerty");
		fb.paswoord().sendKeys("12345");
		fb.button().click();
	}

}
