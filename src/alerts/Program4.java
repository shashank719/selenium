package alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program4 {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--disable-notifications");
	c.addArguments("-start-maximized");
	
	WebDriver driver = new ChromeDriver(c);
	driver.get("https://optinmonster.com/");
	Thread.sleep(5000);
	driver.close();
}
}
