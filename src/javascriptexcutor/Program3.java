package javascriptexcutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://optinmonster.com");
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript("window.scrollBy(-5000,0)"); scroll left
		j.executeScript("window.scrollBy(5000,0)"); // srcoll right
		Thread.sleep(5000);
		
	}

}
