package javascriptexcutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
	//scroll up
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://optinmonster.com");
			
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("window.scrollBy(0,3000)");
			Thread.sleep(5000);
			
			j.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(5000);
			driver.close();
			
		}
	

}
