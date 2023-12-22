package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.OrangeHrmLogin;

public class Login {
	
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		OrangeHrmLogin o = new OrangeHrmLogin(driver);
		o.emailId().sendKeys("Admin");
		// for password and button use explicit wait 
		o.password().sendKeys("admin123");
		o.button().click();
	}

}
