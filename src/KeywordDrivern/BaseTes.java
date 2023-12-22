package KeywordDrivern;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTes {
		// used to open speicfixc broswer
	public static WebDriver driver;
	
	public void openBrowser() throws IOException	{
		KeyDrivenFiles k = new KeyDrivenFiles();
		String  browservalue = k.readProperty("C:\\Users\\shash\\\\eclipse-workspace\\\\SeleniumAutomation\\src\\testdata\\data.properties", "browser");
		String  url = k.readProperty("C:\\\\Users\\\\shash\\\\eclipse-workspace\\\\SeleniumAutomation\\\\src\\\\testdata\\\\data.properties", "url");
	   if(browservalue.equalsIgnoreCase("chrome"))
	   {
		   driver =new ChromeDriver();
		   driver.get(url);
   }
	   else if(browservalue.equalsIgnoreCase("firefox"))
	   {
		   driver = new FirefoxDriver();
		   driver.get(url);
	   }
	   else
	   {
		   System.out.println("invalid input");
	   }
		}
	public void closebrowser()
	{
		driver.close();
	}

}
