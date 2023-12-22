package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepository.FaceBookLogin;

public class Login1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FaceBookLogin fb = new FaceBookLogin(driver);
		fb.emailID().sendKeys("qwerty"); 
		fb.paswoord().sendKeys("12345");
		fb.button().click();
	}

}
