package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.OrangeForpwdPf;
import objectrepository.OrangeHrmLogin;
import objectrepository.OrangeHrmPageFactoy;

public class LoginPf {
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		OrangeHrmPageFactoy o = new OrangeHrmPageFactoy(driver);
		o.emailId().sendKeys("Admin");
		// for password and button use explicit wait 
		// page object model and page factory  what is the use over pf
		//
		o.password().sendKeys("admin123");
		o.button().click();
	}
	@Test
	public void frgotPassword()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		OrangeForpwdPf o1 = new OrangeForpwdPf(driver);
		
		o1.button().click();
	}

}
