package KeywordDrivern;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook {
	// automation script for login page
	//static WebDriver driver;
	public static void main(String[] args) throws IOException {

		BaseTes b = new BaseTes();
		KeyDrivenFiles k = new KeyDrivenFiles();
		
		String usename = k.readProperty("C:\\\\Users\\\\shash\\\\eclipse-workspace\\\\SeleniumAutomation\\\\src\\\\testdata\\\\data.properties", "username");
		String pwd = k.readProperty("C:\\\\Users\\\\shash\\\\eclipse-workspace\\\\SeleniumAutomation\\\\src\\\\testdata\\\\data.properties", "password");
		
		b.openBrowser();
		b.driver.findElement(By.xpath("//input[@id='email']")).sendKeys(usename);
		b.driver.findElement(By.xpath("input[@id='pass']")).sendKeys(pwd);
		b.driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
	}

}
